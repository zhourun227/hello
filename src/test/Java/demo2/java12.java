package demo2;

public class java12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 子类如果定义了一个与父类方法签名完全相同的方法，被称为覆写（Override）
		// Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
		// 多态的特性就是，运行期才能动态决定调用的子类方法

		// 覆写Object方法
		/*
		 * toString()：把instance输出为String； 
		 * equals()：判断两个instance是否逻辑相等；
		 * hashCode()：计算一个instance的哈希值。
		 */
		
		//在子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用
		//如果一个父类不允许子类对它的某个方法进行覆写，可以把该方法标记为final。用final修饰的方法不能被Override
		
		//MyPerson p = new MyPerson(); // 编译错误
		MyPerson p=new MyStudent();//并不关心Person类型变量的具体子类型
		p.run();
	}

}
//使用abstract修饰的类就是抽象类。我们无法实例化一个抽象类
abstract class MyPerson {
    public abstract void run();
    public void run1() {};
}
class MyStudent extends MyPerson{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("这种尽量引用高层类型，避免引用实际子类型的方式，称之为面向抽象编程");
	}
}
interface MyPerson1{
	//public static final
	int a=1;
	//接口定义的所有方法默认都是public abstract
	void run();
    String getName();
    //实现类可以不必覆写default方法。
    default void play() {
    	System.out.println(getName() + " run");
    };
}
///一个类可以实现多个interface
class MyStudent1 implements MyPerson1{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
//一个interface可以继承自另一个interface
interface Hello {
    void hello();
}
interface MyPerson2 extends Hello {
    void run();
    String getName();
}