package demo4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

//一个Java对象要能序列化，必须实现一个特殊的java.io.Serializable接口
//Serializable接口没有定义任何方法,是空接口。我们把这样的空接口称为“标记接口”（Marker Interface）

public class java28 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//序列化 把一个Java对象变为byte[]数组 需要使用ObjectOutputStream
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		try(ObjectOutputStream output = new ObjectOutputStream(buffer)){
			// 写入int:
            output.writeInt(12345);
            // 写入String:
            output.writeUTF("Hello");
            // 写入Object:
            output.writeObject(Double.valueOf(123.456));
		}
		System.out.println(Arrays.toString(buffer.toByteArray()));
		
		/*
		 * 反序列化
		try (ObjectInputStream input = new ObjectInputStream()) {
		    int n = input.readInt();
		    String s = input.readUTF();
		    Double d = (Double) input.readObject();
		}
		*/
	}

}

