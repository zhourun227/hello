package demo3;

import java.util.ArrayList;
import java.util.List;

public class java19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//泛型就是定义一种模板
		//注意泛型的继承关系：T不能变！T不能变成父类
		//可以把ArrayList<Integer>向上转型为List<Integer>,但不能把ArrayList<Integer>向上转型为ArrayList<Number>
		//如果不定义泛型类型时，泛型类型实际上就是Object=T
		List<Number> list=new ArrayList<>();
		list.add(1);
		list.add(0.1);
		//可以在接口中定义泛型类型，实现此接口的类必须实现正确的泛型类型。
		Pair1<String, Integer> p = new Pair1<>("test", 123);
		
		//Java语言的泛型实现方式是擦拭法（Type Erasure）
		/*
		 编译器把类型<T>视为Object；
		 编译器根据<T>实现安全的强制转型。
		 <T>不能是基本类型
		 无法取得带泛型的Class
		 无法判断带泛型的类型
		 不能实例化T类型
		 */
		
		//<? extends Number>称之为上界通配符,使得方法接收所有泛型类型为Number或Number子类
		//使用extends通配符表示可以读，不能写 传入null除外
		//<? super Integer>表示，方法参数接受所有泛型类型为Integer或Integer父类
		//使用<? super Integer>通配符作为方法参数，表示方法内部代码对于参数只能写，不能读 获取Object除外
		//Java的泛型还允许使用无限定通配符（Unbounded Wildcard Type），即只定义一个?
		//<?>通配符既不能读，也不能写，那只能做一些null判断
		
	}

}
class Pair<T>{
	 private T first;
	 private T last;
	 public Pair(T first, T last) {
	    this.first = first;
	    this.last = last;
	 }
	// 对静态方法使用<T>:
	 //对于静态方法，我们可以单独改写为“泛型”方法，只需要使用另一个类型即可
	    public static<K> Pair<K> create(K first, K last) { //这个static<K>和Pair<T>类型的<T>已经没有任何关系了
	        return new Pair<K>(first, last);
	    }
}
class Pair1<T, K> {
    private T first;
    private K last;
    public Pair1(T first, K last) {
        this.first = first;
        this.last = last;
    }
}