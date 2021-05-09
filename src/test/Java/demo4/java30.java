package demo4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class java30 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try (Writer writer = new FileWriter("D:\\2019-20-1-工程项目\\javatest.txt",true)) {
		    writer.write('\n'+'H'+'\n'); // 写入单个字符
		    writer.write("Hello".toCharArray()); // 写入char[]
		    writer.write("Hello"); // 写入String
		}
	}
//CharArrayWriter和StringWriter在内存中模拟一个字符流输出。
	//Writer是基于OutputStream构造的，可以通过OutputStreamWriter将OutputStream转换为Writer，转换时需要指定编码。
}
