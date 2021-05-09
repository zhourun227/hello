package demo2;

public class java14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 两个字符串比较，必须总是使用equals()方法。
		 * 
		 * 要忽略大小写比较，使用equalsIgnoreCase()方法。
		 */
		String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        String s3 = "HELLO";
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1==s2);
        
        "Hello".contains("ll"); //// 是否包含子串:
        "Hello".indexOf("l"); // 2
        "Hello".lastIndexOf("l"); // 3
        "Hello".startsWith("He"); // true
        "Hello".endsWith("lo"); // true
        
        //提取子串
        "Hello".substring(2); // "llo"
        "Hello".substring(2, 4); //"ll"
        
        //使用trim()方法可以移除字符串首尾空白字符
        "  \tHello\r\n ".trim(); // "Hello"
        //另一个strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除
        //"\u3000Hello\u3000".strip(); // "Hello"
        //" Hello ".stripLeading(); // "Hello "
        //" Hello ".stripTrailing(); // " Hello"
        
        //判断字符串是否为空和空白字符串
        "".isEmpty(); // true，因为字符串长度为0
        "  ".isEmpty(); // false，因为字符串长度不为0
        //"  \n".isBlank(); // true，因为只包含空白字符
        //" Hello ".isBlank(); // false，因为包含非空白字符
        
        String s = "hello";
        s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"
        
        String s4 = "A,B,C,D";
        String[] ss = s4.split("\\,"); // {"A", "B", "C", "D"}
        String[] arr = {"A", "B", "C"};
        String s5 = String.join("***", arr); // "A***B***C"
        
        //字符串提供了formatted()方法和format()静态方法，可以传入其他参数，替换占位符，然后生成新的字符串
        //String s6 = "Hi %s, your score is %d!";
        //System.out.println(s6.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
        
        String.valueOf(123); // "123"
        String.valueOf(45.67); // "45.67"
        String.valueOf(true); // "true"
        String.valueOf(new Object()); // 类似java.lang.Object@636be97c
        int n1 = Integer.parseInt("123"); // 123
        int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
        boolean b1 = Boolean.parseBoolean("true"); // true
        boolean b2 = Boolean.parseBoolean("FALSE"); // false
        Integer in=Integer.getInteger("123");//把该字符串对应的系统变量转换为Integer
        
        char[] cs = "Hello".toCharArray(); // String -> char[]
        char c="hello".charAt(1);//'e'
        System.out.println(c);
        //Java使用Unicode编码表示String和char
	}
}
