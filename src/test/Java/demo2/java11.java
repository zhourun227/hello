package demo2;

public class java11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 方法名相同，但各自的参数不同，称为方法重载（Overload）注意：方法重载的返回值类型通常都是相同的
		Person p1 = new Student("zr", 21, 10000);// 向上转型实际上是把一个子类型安全地变为更加抽象的父类型
		Person p2 = new Person("zz", 22);
		Student s1 = (Student) p1; // ok
		// Student s2 = (Student) p2; //
		// 把p2转型为Student会失败，因为p2的实际类型是Person，不能把父类变为子类，因为子类功能比父类多，多的功能无法凭空变出来。
		// 为了避免向下转型出错，Java提供了instanceof操作符，可以先判断一个实例究竟是不是某种类型
		Person p = new Person("zz", 22);
		System.out.println(p instanceof Person); // true
		System.out.println(p instanceof Student); // false

		Student s = new Student("zz", 22, 1);
		System.out.println(s instanceof Person); // true
		System.out.println(s instanceof Student); // true

		Student n = null;
		System.out.println(n instanceof Student); // false
		//判断instanceof后，可以直接转型为指定变量，避免再次强制转型
		/*
		 * Person p = new Student(); if (p instanceof Student) { // 只有判断成功才会向下转型:
		 * Student s = (Student) p; // 一定会成功 }
		 */
	}

}

class Person {
	// private String name;
	// private int age;
	protected String name;
	protected int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

// 注意：子类自动获得了父类的所有字段，严禁定义与父类重名的字段！
// Java只允许一个class继承自一个类，因此，一个类有且仅有一个父类。
// protected关键字可以把字段和方法的访问权限控制在继承树内部，一个protected字段和方法可以被其子类，以及子类的子类所访问
class Student extends Person {
	protected int score;

	public Student(String name, int age, int score) {
		// 子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的
		super(name, age); // 调用父类的构造方法Person(String, int)
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
// 只要某个class没有final修饰符，那么任何类都可以从该class继承。