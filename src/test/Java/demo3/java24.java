package demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class java24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deque来实现一个双端队列
		//既可以添加到队尾，也可以添加到队首；
		//既可以从队首获取，又可以从队尾获取。
		Deque<String> deque = new LinkedList<>();
        deque.offerLast("A"); // A
        deque.offerLast("B"); // A <- B
        deque.offerFirst("C"); // C <- A <- B
        System.out.println(deque.pollFirst()); // C, 剩下A <- B
        System.out.println(deque.pollLast()); // B, 剩下A
        System.out.println(deque.pollFirst()); // A
        System.out.println(deque.pollFirst()); // null
        
        //栈（Stack）是一种后进先出（LIFO：Last In First Out）的数据结构
        /*
        Stack只有入栈和出栈的操作：		
		把元素压栈：push(E)；
		把栈顶的元素“弹出”：pop()；
		取栈顶元素但不弹出：peek()。
		
		在Java中，我们用Deque可以实现Stack的功能，注意只调用push()/pop()/peek()方法，避免调用Deque的其他方法
		不要使用遗留类Stack
		把元素压栈：push(E)/addFirst(E)；
		把栈顶的元素“弹出”：pop()/pollFirst()；
		取栈顶元素但不弹出：peek()/peekFirst()。
         */
        
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
        // 排序前:
        System.out.println(list);
        Collections.sort(list);
        // 排序后:
        System.out.println(list);
        
        List<Integer> list1 = new ArrayList<>();
        for (int i=0; i<10; i++) {
            list1.add(i);
        }
        // 洗牌前:
        System.out.println(list1);
        Collections.shuffle(list1);
        // 洗牌后:
        System.out.println(list1);
	}
//通过Iterator对象遍历集合的模式称为迭代器
}
