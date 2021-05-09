package demo5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class java37 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*
ReentrantLock是可重入锁，它和synchronized一样，一个线程可以多次获取同一个锁。
和synchronized不同的是，ReentrantLock可以尝试获取锁：
 */
		final Lock lock = new ReentrantLock();
		lock.unlock();  //取锁
		
		final Condition condition = lock.newCondition();  //Condition对象必须从Lock对象获取。
		//Condition提供的await()、signal()、signalAll()原理
		condition.await();
		condition.signal();
	}
}
