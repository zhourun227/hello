package demo5;

public class java34 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 中断线程
		Thread t=new MyThread1();
		t.start();
		Thread.sleep(1);// 暂停1毫秒
		t.interrupt();// 中断t线程   interrupt()方法仅仅向t线程发出了“中断请求”
		t.join();// 等待t线程结束
		System.out.println("end");
		
		//调用interrupt()，join()方法会立刻抛出InterruptedException
		//就说明有其他线程对其调用了interrupt()方法，通常情况下该线程应该立刻结束运行
		
		//另一个常用的中断线程的方法是设置标志位
		//我们通常会用一个running标志位来标识线程是否应该继续运行
		HelloThread t1=new HelloThread();
		t1.start();
		Thread.sleep(1);
		t1.running=false;
	}

}
class MyThread1 extends Thread{
	@Override
	public void run() {
		int n=0;
		while(! isInterrupted()) {
			n++;
			System.out.println(n+"+hello");
		}
	}
}
class HelloThread extends Thread {
	//通过标志位判断需要正确使用volatile关键字；
	//volatile关键字解决了共享变量在线程间的可见性问题。
	/*
	 每次访问变量时，总是获取主内存的最新值；
	每次修改变量后，立刻回写到主内存。
	 */
    public volatile boolean running = true;
    public void run() {
        int n = 0;
        while (running) {
            n ++;
            System.out.println(n + "- hello!");
        }
        System.out.println("end!");
    }
}