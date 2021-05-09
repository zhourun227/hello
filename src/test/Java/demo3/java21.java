package demo3;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class java21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		map.put("apple", 123);
		map.put("pear", 456);
		//Map中不存在重复的key，因为放入相同的key，只会把原有的key-value对应的value给替换掉。
		map.put("apple", 789); // 再次放入apple作为key，但value变为789
		//虽然key不能重复，但value是可以重复的
		map.put("banana", 123);
		
		//遍历key
		for(String key:map.keySet()) {
			System.out.println(key);
		}
		//遍历key和value
		for(Entry<String, Integer> map1:map.entrySet()) {
			System.out.println(map1);
		}
		//要正确使用HashMap，作为key的类必须正确覆写equals()和hashCode()方法
		
		//如果Map的key是enum类型，推荐使用EnumMap
		//Map<String,Integer> map1=new EnumMap<>();
		System.out.println("----------->");
		//还有一种Map，它在内部会对Key进行排序，这种Map就是SortedMap。注意到SortedMap是接口，它的实现类是TreeMap
		Map<String, Integer> map2=new TreeMap<>();
		map2.put("orange", 1);
        map2.put("apple", 2);
        map2.put("pear", 3);
        for(Entry<String,Integer> e:map2.entrySet()) {
        	System.out.println(e);
        }
        //使用TreeMap时，放入的Key必须实现Comparable接口。String、Integer这些类已经实现了Comparable接口
	}

}
