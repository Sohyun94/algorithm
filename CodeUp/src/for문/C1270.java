package for문;

import java.util.Scanner;

public class C1270 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 10 == 1) {
				cnt++;
			}
		}//for문
		System.out.println(cnt);
	}

}
