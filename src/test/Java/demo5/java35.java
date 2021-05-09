package demo5;

import java.time.LocalTime;

public class java35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//守护线程（Daemon Thread）,负责来结束这类线程
		//JVM退出时，不必关心守护线程是否已结束
		Thread t = new TimerThread();
		t.setDaemon(true);
		t.start();
	}
}
//有一种线程的目的就是无限循环,这个线程不结束,JVM进程就无法结束
class TimerThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}