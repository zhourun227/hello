package demo1;

public class java7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option=2;
		switch(option) {
		case 0:
			System.out.println(false);
			break;
		case 1:
			System.out.println(true);
			break;
		case 2:
		case 3:
			System.out.println("有几个case语句执行的是同一组语句块");
			default:
				System.out.println("null");
		}
		//当没有匹配到任何case时，执行default
		//注意case语句并没有花括号{},case语句具有“穿透性”
		
		//switch语句还可以匹配字符串。字符串匹配时，是比较“内容相等”
		//注意新语法使用->，如果有多条语句，需要用{}括起来。不要写break语句，因为新语法只会执行匹配的语句，没有穿透效应
		String fritus="apple";
		switch(fritus) {
		//case "apple"->System.out.println("apple");
		//case "mango" -> {};
		//default -> System.out.println("No fruit selected");
		}
		//使用新的switch语法，不但不需要break，还可以直接返回值
		/*
		 String fruit = "apple";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
               int code = fruit.hashCode();
               yield code; // switch语句返回值
            }
        }; // 注意赋值语句要以;结束
        System.out.println("opt = " + opt);
		 */
	}

}
