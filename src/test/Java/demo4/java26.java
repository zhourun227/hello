package demo4;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class java26 {
//io是抽象类
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//字节bytes流
		//这个抽象类定义的一个最重要的方法就是int read()
		//返回-1表示不能继续读取了
		//try(resource)的语法，只需要编写try语句，让编译器自动为我们关闭资源
		try(InputStream input = new FileInputStream("D:\\2019-20-1-工程项目\\javatest.txt");){
			// 定义1000个字节大小的缓冲区:
	        byte[] buffer = new byte[1000];
			int n;
			//read()方法是阻塞
			while((n=input.read(buffer))!=-1) {
				System.out.println(n);
			}
		}
		//ByteArrayInputStream实际上是把一个byte[]数组在内存中变成一个InputStream,可以用它来构造一个InputStream
		InputStream input = new ByteArrayInputStream(new byte[5]);
	}

}
