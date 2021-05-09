package demo1;

import java.util.Scanner;

public class java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java还提供了格式化输出的功能
		double d = 12900000;
        System.out.println(d); // 1.29E7
        
        double d1 = 3.1415926;
        System.out.printf("d1=%.2f\n",d1); //显示两位小数3.14
        //由于%表示占位符，因此，连续两个%%表示一个%字符本身
        
        //System.out代表标准输出流，而System.in代表标准输入流
        Scanner s=new Scanner(System.in);
        System.out.print("请输入st:");
        int st=s.nextInt();
        st=st+10;
        System.out.println("st="+st);
        
        //根据if的计算结果（true还是false），JVM决定是否执行if语句块（即花括号{}包含的所有语句）
        //当if语句块只有一行语句时，可以省略花括号{}
        //注意，else不是必须的
        //还可以用多个if ... else if ...串联
        //在串联使用多个if时，要特别注意判断顺序
        
        //浮点数在计算机中常常无法精确表示，并且计算可能出现误差，因此，判断浮点数相等用==判断不靠谱
        //正确的方法是利用差值小于某个临界值来判断
        
        //判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是否指向同一个对象
        //要判断引用类型的变量内容是否相等，必须使用equals()
        String s1="hello";
        String s2="HELLO".toLowerCase();
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
        //注意：执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException
        //要避免NullPointerException错误，可以利用短路运算符&&
	}

}
