package demo3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class java22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//如果我们只需要存储不重复的key，并不需要存储映射的value，那么就可以使用Set
		Set<String> set=new HashSet<>();
		System.out.println(set.add("abc")); // true
        System.out.println(set.add("xyz")); // true
        System.out.println(set.add("xyz")); // false，添加失败，因为元素已存在
        System.out.println(set.contains("xyz")); // true，元素存在
        System.out.println(set.contains("XYZ")); // false，元素不存在
        System.out.println(set.remove("hello")); // false，删除失败，因为元素不存在
        System.out.println(set.size()); // 2，一共两个元素
        
        System.out.println("----------->");
        
        //TreeSet是有序的，因为它实现了SortedSet接口
        Set<String> set1 = new TreeSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("pear");
        set1.add("orange");
        for (String s : set1) {
            System.out.println(s);
        }
	}
//添加的元素必须正确实现Comparable接口，如果没有实现Comparable接口，那么创建TreeSet时必须传入一个Comparator对象
}
