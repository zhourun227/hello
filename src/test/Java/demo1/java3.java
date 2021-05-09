package demo1;

public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//浮点数0.1在计算机中就无法精确表示，因为十进制的0.1换算成二进制是一个无限循环小数
		//整型可以自动提升到浮点型
		
		//整数运算在除数为0时会报错
		double d1 = 0.0 / 0; // NaN
		double d2 = 1.0 / 0; // Infinity
		double d3 = -1.0 / 0; // -Infinity
		
		//可以将浮点数强制转型为整数。在转型时，浮点数的小数部分会被丢掉。如果转型后超过了整型能表示的最大范围，将返回整型的最大值。
		int n1 = (int) 12.3; // 12
		int n2 = (int) 12.7; // 12
		int n3 = (int) -12.7; // -12
		int n4 = (int) (12.7 + 0.5); // 13  如果要进行四舍五入，可以对浮点数加上0.5再强制转型
		int n5 = (int) 1.2e20; // 2147483647
		
		System.out.println("n4:"+n4);
		
		//布尔类型
		boolean isGreater = 5 > 3; // true
		int age = 12;
		boolean isZero = age == 0; // false
		boolean isNonZero = !isZero; // true
		boolean isAdult = age >= 18; // false
		boolean isTeenager = age >6 && age <18; // true
		//短路运算
		//false && x的结果总是false，无论x是true还是false
		boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);
        //对于||运算，只要能确定第一个值为true，后续计算也不再进行，而是直接返回true
        boolean result1 = true || (5 / 0 > 0); // true
        System.out.println(result1);
        
        //Java还提供一个三元运算符b ? x : y
        int n=100;
        int x=n>=0?-n:n;
        System.out.println("x:"+x);
	}

}
