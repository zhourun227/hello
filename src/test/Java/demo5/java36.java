package demo5;

import java.lang.Thread;
import java.util.Scanner;

public class java36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//原子操作是指不能被中断的一个或一系列操作。
		//多线程同时读写共享变量时，会造成逻辑错误，因此需要通过synchronized同步；
		//同步的本质就是给指定对象加锁，加锁后才能继续执行后续代码；
		//注意加锁对象必须是同一个实例；
		//对JVM定义的单个原子操作不需要同步。
		/*
		 * 基本类型（long和double除外）赋值，例如：int n = m；
			引用类型赋值，例如：List<String> list = anotherList。
		 */
		//用synchronized修饰的方法就是同步方法，它表示整个方法都必须用this实例加锁。
		//JVM允许同一个线程重复获取同一个锁，这种能被同一个线程反复获取的锁，就叫做可重入锁。
		
		Producer p = new Producer();
        Consumcer c = new Consumcer();
        p.start();
        c.start();
	    
	}

}
class ProConTest{
    static int product = 0; //1:有产品 0：无产品
    static Object lock = new Object();
}
class Producer extends Thread{
    int count = 0;
    public void run(){
        while(true){
            try{sleep(3000);
            }catch(Exception e){
            	e.printStackTrace();
            }
            synchronized(ProConTest.lock){       //在synchronized内部可以调用wait()使线程进入等待状态；
                if(ProConTest.product == 1){     //在synchronized内部可以调用notify()或notifyAll()唤醒其他等待线程；
                    System.out.println("已经有产品，请生产者等待");
                    try{
                        ProConTest.lock.wait();  //必须在已获得的锁对象上调用wait()方法；
                    }catch(Exception e){
                        
                    }  
                }else if(ProConTest.product == 0){
                    ProConTest.product++;
                    count++;
                    System.out.print("生产者生产了第 " + count + " 个产品。");
                    System.out.println("通知消费者消费产品");
                    try{
                       ProConTest.lock.notify();  //必须在已获得的锁对象上调用notify()或notifyAll()方法；
                    }catch(Exception e){
                        
                    }
                }
//                if(count++ >= 100) break;
            }
        }
    }
}

class Consumcer extends Thread{
     int count = 0;
     public void run(){
        while(true){
            try{sleep(3000);}catch(Exception e){}
            synchronized(ProConTest.lock){
                if(ProConTest.product == 1){
                    ProConTest.product--;
                    count++;
                    System.out.print("消费了第 " + count + " 个产品。");
                    System.out.println("通知生产者生产");
                    try{
                        ProConTest.lock.notify();
                    }catch(Exception e){
                        
                    }                    
                }else if(ProConTest.product == 0){
                    System.out.println("没有产品，消费者等待");
                    try{
                        ProConTest.lock.wait();
                    }catch(Exception e){
                        
                    }
                }
//                if(count++ >= 100) break;
            }
        }
    }
}




