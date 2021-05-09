package demo7;

public class SingleTest {
    public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1 == p2);
		System.out.println(p1);
		System.out.println(p2);
		
		Earth e1 = Earth.getInstance();
		Earth e2 = Earth.getInstance();
		System.out.println(e1 == e2);
		System.out.println(e1);
		System.out.println(e2);		
	}   
}

//单例
class Earth{
	private static Earth e = null;
	private Earth(){}
	
	public static Earth getInstance(){
		if(e == null){
			e = new Earth(); 
		}
		return e;
	}
}

class Person{
	
}