package demo1;

import java.util.Arrays;

public class java9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for可以索引而for each循环无法拿到数组的索引，因此，到底用哪一种for循环，取决于我们的需要
		int[] arr= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
		// 冒泡排序
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		for(int i=0;i<ns.length;i++) {
			for(int j=0;j<ns.length-1;j++) {
				int temp;
				if(ns[j]>ns[j+1]) {
					temp=ns[j];
					ns[j]=ns[j+1];
					ns[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ns));
		
		//Java的标准库已经内置了排序功能，我们只需要调用JDK提供的Arrays.sort()就可以排序
		Arrays.sort(ns);
		System.out.println(Arrays.toString(ns));
		
		int[][] arr1= new int[][] {{1,2,3},{4,5,6}};
		System.out.println(arr1[1][2]); 
		System.out.println(arr1[0].length); 
		int[][] arr2= {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(arr1));
	}

}
