package demo2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class java17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.math.BigInteger就是用来表示任意大小的整数。BigInteger内部用一个int[]数组来模拟一个非常大的整数
		BigInteger bi = new BigInteger("1234567890");
		System.out.println(bi.pow(5));
		
		//对BigInteger做运算的时候，只能使用实例方法
		BigInteger i1 = new BigInteger("1234567890");
		BigInteger i2 = new BigInteger("12345678901234567890");
		BigInteger sum = i1.add(i2); 
		System.out.println(sum);
		
		//BigInteger转换成long型
		BigInteger i = new BigInteger("123456789000");
		System.out.println(i.longValue()); 
		/*
		 转换为byte：byteValue()
		转换为short：shortValue()
		转换为int：intValue()
		转换为long：longValue()
		转换为float：floatValue()
		转换为double：doubleValue()
		 */
		
		//BigDecimal可以表示一个任意大小且精度完全准确的浮点数
		BigDecimal bd = new BigDecimal("123.456700");
		System.out.println(bd.multiply(bd));
		//BigDecimal用scale()表示小数位数
		System.out.println(bd.scale());
		//stripTrailingZeros()去掉了末尾0的BigDecimal小数位数
		//在比较两个BigDecimal的值是否相等时，要特别注意，使用equals()方法不但要求两个BigDecimal的值相等，还要求它们的scale()相等
		BigDecimal d1 = new BigDecimal("123.456");
		BigDecimal d2 = new BigDecimal("123.45600");
		System.out.println(d1.equals(d2)); // false,因为scale不同
		System.out.println(d1.equals(d2.stripTrailingZeros())); // true,因为d2去除尾部0后scale变为2
		System.out.println(d1.compareTo(d2)); // 0
		//必须使用compareTo()方法来比较，它根据两个值的大小分别返回负数、正数和0，分别表示小于、大于和等于
		
		//伪随机数
		Random r=new Random();
		System.out.println(r.nextInt(10));//生成一个[0,10)之间的int
		
		//SecureRandom就是用来创建安全的随机数的
		SecureRandom sr = new SecureRandom();
		System.out.println(sr.nextInt(100));
	}

}
//使用record(记录类)定义的是不变类