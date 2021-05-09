package demo2;

public class java13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classpath是JVM用到的一个环境变量，它用来指示JVM如何搜索class
		
		//一个.java文件只能包含一个public类，但可以包含多个非public类。如果有public类，文件名必须和public类的名字相同
		
		//用static修饰的字段，称为静态字段
		//静态字段并不属于实例
		//类名.静态字段来访问静态对象静态方法
		//interface的字段只能是public static final类型
		
		//定义为public的class、interface可以被其他任何类访问
		//定义为private的field、method无法被其他类访问
		//protected作用于继承关系。定义为protected的字段和方法可以被子类访问，以及子类的子类
		
		//在方法内部定义的变量称为局部变量
		
		//用final修饰class可以阻止被继承
		//用final修饰method可以阻止被子类覆写
		//用final修饰field可以阻止被重新赋值
		//用final修饰局部变量可以阻止被重新赋值
		
		Outer outer = new Outer("Nested"); // 实例化一个Outer
		Outer.Inner inner=outer.new Inner();// 实例化一个Inner
		inner.hello();
	}

}
//Inner Class的实例不能单独存在，必须依附于一个Outer Class的实例
class Outer {
	private String name;

    Outer(String name) {
        this.name = name;
    }
    class Inner {
        // 定义了一个Inner Class
    	void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }
}
//匿名类（Anonymous Class） 静态内部类（Static Nested Class）
//Java的内部类可分为Inner Class、Anonymous Class和Static Nested Class三种