package demo2;

import java.util.StringJoiner;

public class java15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java标准库提供了StringBuilder，它是一个可变对象，可以预分配缓冲区
		//StringBuffer线程安全版本，它通过同步来保证多个线程操作StringBuffer也是安全的，但是同步会带来执行速度的下降
		StringBuilder sb = new StringBuilder(1024);//缓冲区大小
	        sb.append("Mr ")
	          .append("Bob")
	          .append("!")
	          .insert(0, "Hello, ");
	        System.out.println(sb.toString());
	        
	        //用分隔符拼接数组
	        String[] names = {"Bob", "Alice", "Grace"};
	        StringJoiner sj = new StringJoiner(", ", "Hello ", "!");
	        for (String name : names) {
	            sj.add(name);
	        }
	        System.out.println(sj.toString());
	        
	        //String还提供了一个静态方法join()
	        String[] names1 = {"Bob", "Alice", "Grace"};
	        String s = String.join(", ", names1);
	        System.out.println(s);
	        
	        //int和Integer可以互相转换
	        int i = 100;
	        Integer n = Integer.valueOf(i);
	        int x = n.intValue();
	        int x2 = Integer.parseInt("100", 16); // 256,因为按16进制解析
	        
	       //包装类型的比较必须使用equals()
	       //整数和浮点数的包装类型都继承自Number
	}

}
