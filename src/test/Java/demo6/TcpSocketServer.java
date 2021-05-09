package demo6;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class TcpServer{
    public static void main(String[] args){
    	ServerSocket ss = null;
    	Socket s = null;
    	byte[] buf = new byte[100];

    	try {
			ss = new ServerSocket(7777);
			System.out.println("waiting for a tcp connection...");
			s = ss.accept(); //这是个阻塞操作，
			System.out.println("a tcp connection is built.");
			InputStream is = s.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			OutputStream os = s.getOutputStream();
			//从流中读取字节数据，按照JDK默认的那一套序列化机制将其反序列化为对象
            Person p = (Person)ois.readObject();
			Stub stub = new Stub();
			stub.sayHello(p);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try{
				s.close();//关闭TCP 四次挥手
			}catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(ss != null) {
				    ss.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    }
}

class Stub implements IPCInterface {
	public void sayHelloTo(String name){
		System.out.println("hello " + name);
	}
	public int sum(int x, int y){
		return x + y;
	}
	public void sayHello(Person p){
		System.out.println("hello " + p);
	}
}
