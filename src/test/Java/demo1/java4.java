package demo1;

public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在Java中，字符和字符串是两个不同的类型。
		
		//要显示一个字符的Unicode编码，只需将char类型直接赋值给int类型即可
		int i='A'; // 字母“A”的Unicodde编码是65
		System.out.println("i="+i);
		
		char c=65;
		char c1= '\u0041'; // 'A'，因为十六进制0041 = 十进制65
		System.out.println("c="+c+","+"c1="+c1);
		
		//转义字符\
		/*
		\n 表示换行符
		\r 表示回车符
		\t 表示Tab
		*/
		//用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接
		String s = "first line \n"
		         + "second line \n"
		         + "end";
		System.out.println("s:"+s);
		
		//引用类型外不可变
		
		String s1 = null; // s1是null  它表示不存在，即该变量不指向任何对象
		//注意要区分空值null和空字符串""，空字符串是一个有效的字符串对象，它不等于null
	}

}
