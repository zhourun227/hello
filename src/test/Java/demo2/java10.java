package demo2;

public class java10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group g=new Group();
		g.setNames("a");
		g.setNames("a","b");
	}

}
/*
 基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响。
 
 引用类型参数的传递，调用方的变量，和接收方的参数变量，
 指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方（因为指向同一个对象嘛）。
 除了String
 */
class Group{
	//调用构造方法，必须用new操作符。
	public Group() {};//默认构造方法
	//自定义了一个构造方法，那么，编译器就不再自动创建默认构造方法
	//参数值最终由构造方法的代码确定
	//可以定义多个构造方法，在通过new操作符调用的时候，编译器通过构造方法的参数数量、位置和类型自动区分
	public Group(int age,String name) {};
	//一个构造方法可以调用其他构造方法，这样做的目的是便于代码复用。调用其他构造方法的语法是this(…)
	public Group(int a) {
		this(12,"name");   //调用上面的构造方法
	}
	private String[] names;
	//可变参数用类型...定义，可变参数相当于数组类型String[] names
	public void setNames(String... names) {
        this.names = names;
    }
}