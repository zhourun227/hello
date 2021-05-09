package demo6;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

class TcpClient {
	public static void main(String[] args){
		Socket s = null;
		try {
			s = new Socket("127.0.0.1", 7777);
			OutputStream os = s.getOutputStream();
			//把os包装成了一个对象输出流
			ObjectOutputStream oos = new ObjectOutputStream(os);
			InputStream is = s.getInputStream();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("####给服务器发消息。。。");
			Proxy proxy = new Proxy(oos);
			Person p = new Person("Lisi", 22);
			proxy.sayHello(p);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(s != null){
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Proxy implements IPCInterface {
	ObjectOutputStream oos = null;
	Proxy(ObjectOutputStream oos){
        this.oos = oos;
	}

	public void sayHelloTo(String name){
		try{
			//通过SocketTCP连接把参数跨进程传给服务端
			byte[] buf = name.getBytes();  //把字符串转换为字节数组 （序列化）
			oos.write(buf); //把字节数组buf中的内容写到网络输出流
		}catch(IOException e){
			e.printStackTrace();
		}
	}

    public void sayHello(Person p) throws IOException {
		//把对象写入流中，该方法中会按照JDK的一套默认序列化规则进行对象序列化
		oos.writeObject(p);
	}

	public int sum(int x, int y){
//		try {
//			os.write(x);
//			os.write(y);
//		}catch (IOException e){
//			e.printStackTrace();
//		}
		return 0;
	}
}


