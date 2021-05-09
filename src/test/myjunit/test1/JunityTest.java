package test1;

import org.junit.jupiter.api.Test;

public class JunityTest {
	@Test
	public void hello() {
		System.out.print("hello world");
	}
	@Test
	public void play1() {
		int n=0;
		int sum=0;
		while(n<=100) {
			sum=sum+n;
			n++;
		}
		System.out.println("sum:"+sum);
	}
}
