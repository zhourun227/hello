package demo3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class java23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//队列（Queue）是一种经常使用的集合。Queue实际上是实现了一个先进先出的有序表
		Queue<String> q = new LinkedList<>();
		// 添加3个元素到队列:
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        // 从队列取出元素:
        //poll()：获取队首元素并从队列中删除；
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // null,因为队列是空的
        
        // peek()：获取队首元素但并不从队列中删除。
        // 添加3个元素到队列:
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        // 队首永远都是apple，因为peek()不会删除它:
        System.out.println(q.peek()); // apple
        System.out.println(q.peek()); // apple
        System.out.println(q.peek()); // apple
        
        //PriorityQueue和Queue的区别在于，它的出队顺序与元素的优先级有关，
              //对PriorityQueue调用remove()或poll()方法，返回的总是优先级最高的元素。
        Queue<String> q1 = new PriorityQueue<>(); //字符串的排序
        //（必须实现Comparable接口），也可以通过Comparator自定义排序算法（元素就不必实现Comparable接口）
	}

}
