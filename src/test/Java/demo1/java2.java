package demo1;

public class java2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java的整数运算遵循四则运算规则，可以使用任意嵌套的小括号。四则运算规则和初等数学一致。
		int x = 12345 / 67;
		int y = 12345 % 67;
		System.out.println("x:"+x+","+"y:"+y);
		
		//计算结果超出了范围，就会产生溢出，而溢出不会出错，却会得到一个奇怪的结果,可以把int换成long类型
		//++n表示先加1再引用n，n++表示先引用n再加1
		
		//移位运算
		int n=7; // 00000000 00000000 00000000 00000111 = 7
		int a=n<<1; // 00000000 00000000 00000000 00001110 = 14
		int b=n<<2;
		int c=n<<29; //最高位变成1
		System.out.println("a:"+a+","+"b:"+b);
		System.out.println("c:"+c);
		int n1 = -536870912; //最高位的1不动
		int a1 = n1 >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
		int b1 = n1 >> 2;  // 11111000 00000000 00000000 00000000 = -134217728
		int c1 = n1 >> 28; // 11111111 11111111 11111111 11111110 = -2
		int d1 = n1 >> 29; // 11111111 11111111 11111111 11111111 = -1
		System.out.println("d1:"+d1);
		
		//还有一种无符号的右移运算，使用>>>，它的特点是不管符号位，右移后高位总是补0
		int n2 = -536870912;
		int a2 = n2 >>> 1;  // 01110000 00000000 00000000 00000000 = 1879048192
		int b2 = n2 >>> 2;  // 00111000 00000000 00000000 00000000 = 939524096
		System.out.println("a2:"+a2);
		
		//类型自动提升与强制转型 范围小的自动提升为范围大的
		double dd=0.1;
		int ii=1;
		double re=dd+ii;
		System.out.println("re:"+re);
		
		int i1=(int)dd;
		System.out.println("i1:"+i1);
		
		String s=String.valueOf(123);
		int in=Integer.parseInt("11");
		Integer it=Integer.getInteger("111");
		boolean bl=Boolean.parseBoolean("true");
	}
}
