package demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//集合是接口 大小size()
public class java20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<>();   //通过数组
		List<Integer> list1=new LinkedList<>();  //通过“链表”也实现了List接口
		list.add("apple"); // size=1
        list.add("pear"); // size=2
        list.add("apple"); // 允许重复添加元素，size=3
        list.add(null);
        
        //List<Integer> list2 = List.of(1, 2, 5); 不接受null值
        //用迭代器Iterator来访问List   for each
        for (String s : list) {
            System.out.println(s);
        }
        list.toArray();
        Integer[] array = { 1, 2, 3 };
        Arrays.asList(array);  //返回的List不一定就是ArrayList或者LinkedList 它返回的是一个只读List
        
        System.out.println(list.contains("apple"));
        System.out.println(list.indexOf("pear"));
        //List内部并不是通过==判断两个元素是否相等，而是使用equals()方法判断两个元素是否相等
        //要正确使用List的contains()、indexOf()这些方法，放入的实例必须正确覆写equals()方法
        //String、Integer在Java标准库定义的这些类已经正确实现了equals()方法
        //自己定义的对象需要实现
	}

}
