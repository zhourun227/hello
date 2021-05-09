package demo4;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class java27 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//OutputStream有个flush()方法，能强制把缓冲区内容输出。
		//如果第二个参数为 true,向文件中追加内容，而不是覆盖掉文件中原有的数据
		try(OutputStream output = new FileOutputStream("D:\\\\2019-20-1-工程项目\\\\javatest.txt",true)){
			//output.write("hello".getBytes("UTF-8"));
			byte[] data=new byte[] {97,32,98,32,99}; 
			output.write(data);  //传入得事字节 askII码 97=a
			//write()方法也是阻塞
		}
		OutputStream output = new ByteArrayOutputStream();
	}

}
