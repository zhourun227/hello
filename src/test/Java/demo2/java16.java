package demo2;

public class java16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = Weekday.SUN.name(); // "SUN"
		int n = Weekday.MON.ordinal(); // 1  从0开始计数
		System.out.println("s:"+s+","+"n="+n);
		//保证enum的枚举顺序不能变。新增的常量必须放在最后
		
		 Weekday day = Weekday.SUN;
	        switch(day) {
	        case MON:
	        case TUE:
	        case WED:
	        case THU:
	        case FRI:
	            System.out.println("Today is " + day + ". Work at office!");
	            break;
	        case SAT:
	        case SUN:
	            System.out.println("Today is " + day + ". Work at home!");
	            break;
	        default:
	            throw new RuntimeException("cannot process " + day);
	        }
	}

}
//enum定义的类型就是class
/*
 定义的enum类型总是继承自java.lang.Enum，且无法被继承；
只能定义出enum的实例，而无法通过new操作符创建enum的实例；
定义的每个实例都是引用类型的唯一实例；
可以将enum类型用于switch语句。
*/
//enum类型的每个常量在JVM中只有一个唯一实例，所以可以直接用==比较
enum Weekday {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}
