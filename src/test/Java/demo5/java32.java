package demo5;

public class java32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start...");
		 Thread t = new Thread() {
			 public void run() {
				 System.out.println("thread run...");
				 try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.println("thread end.");
			 }
		 };
		 t.start();   
		 try {
	            Thread.sleep(20);
	        } catch (InterruptedException e) {}
	        System.out.println("main end...");
	}
	//Thread.setPriority(int n) //可以对线程设定优先级 1~10, 默认值5
}
