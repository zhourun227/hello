package demo5;

public class java33 {
//当线程启动后，它可以在Runnable、Blocked、Waiting和Timed Waiting这几个状态之间切换，直到最后变成Terminated状态，线程终止
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/**
		 * 线程正常终止：run()方法执行到return语句返回；
			线程意外终止：run()方法因为未捕获的异常导致线程终止；
			对某个线程的Thread实例调用stop()方法强制终止（强烈不推荐使用）。
		 */
		Thread t=new Thread(()->{
			System.out.println("hello");
		});
		System.out.println("start");
		t.start();
		t.join();   //等待t线程结束后再继续运行
		System.out.println("end");
	}

}
