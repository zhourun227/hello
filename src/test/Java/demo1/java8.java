package demo1;

public class java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 注意到while循环是先判断循环条件，再循环，因此，有可能一次循环都不做。
		int n = 0;
		int sum = 0;
		while (n <= 100) {
			sum = sum + n;
			n++;
		}
		System.out.println("sum=" + sum);

		// do while循环则是先执行循环，再判断条件，条件满足时继续循环，条件不满足时退出
		int sum1 = 0;
		int n1 = 1;
		do {
			sum1 = sum1 + n1;
			n1++;
		} while (n1 <= 100);
		System.out.println(sum1);

		// for
		int sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("sum2:" + sum2);

		// for each循环 直接对应到数组的每个元素
		int[] arr = { 1, 2, 3, 4 };
		for (int i : arr) {
			System.out.println(i);
		}
		//不能再循环外使用break continue
		// 使用break语句跳出当前循环
		// continue则是提前结束本次循环，直接继续执行下次循环
	}
}
