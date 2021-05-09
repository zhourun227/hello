package demo4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class java29 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//字节流
		//要避免乱码问题，我们需要在创建FileReader时指定编码, StandardCharsets.UTF_8
		 try (Reader reader = new FileReader("D:\\\\\\\\2019-20-1-工程项目\\\\\\\\javatest.txt")) {
			 char[] buffer=new char[1000];
			 int n;
			 while((n=reader.read())!=-1) {
				 System.out.println("read " + n + " chars.");
			 }
		 }
		 //CharArrayReader StringReader可以在内存中模拟一个字符流输入。
		 //Reader是基于InputStream构造的：可以通过InputStreamReader在指定编码的同时将任何InputStream转换为Reader。
	}

}
