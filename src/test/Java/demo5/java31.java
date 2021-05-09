package demo5;

public class java31 {
//一个Java程序实际上是一个JVM进程，JVM进程用一个主线程来执行main()方法，在main()方法内部，我们又可以启动多个线程。
//线程是抢占的
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread();
		t1.start();// 启动新线程
		
		//直接调用run()方法，相当于调用了一个普通的Java方法
		//必须调用Thread实例的start()方法才能启动新线程
		
		Thread t2=new MyThread();
		t2.start();
		
		Thread t3=new Thread(new MyRunnable());
		t3.start();
		
		//用Java8引入的lambda语法进一步简写为
		 Thread t4 = new Thread(() -> {
	            System.out.println("start new thread3!");
	        });
	        t4.start(); // 启动新线程
	}

}
class MyThread extends Thread{
	@Override
	public void run() {
        System.out.println("start new thread1!");
    }
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("start new thread2!");
	}
}