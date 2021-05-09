package demo3;

public class java18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Throwable有两个体系：Error和Exception
		//RuntimeException以及它的子类 非RuntimeException（包括IOException、ReflectiveOperationException等等）
		//必须捕获的异常，包括Exception及其子类，但不包括RuntimeException及其子类
		//不需要捕获的异常，包括Error及其子类，RuntimeException及其子类。
		
		//存在多个catch的时候，catch的顺序非常重要：子类必须写在前面
		/*
		 try {
		        process1();
		        process2();
		        process3();
		    } catch (UnsupportedEncodingException e) {
		        System.out.println("Bad encoding");
		    } catch (IOException e) {
		        System.out.println("IO error");
		    }finally {
		        System.out.println("END");
		    }
		 */
		 //可以没有catch，只使用try ... finally结构
		/*
		 try {
        ...
    		} finally {
        System.out.println("END");
    		}
		 */
		//throws抛出异常
		//用throw语句抛出
		/*
		 if (s==null) {
        throw new NullPointerException();
    		}
		 */
		//assert x >= 0 : "x must >= 0";  断言是一种调试方式
	}
}
//自定义新的异常类型
class BaseException extends Exception {
	
}