import java.util.Scanner;

public class B10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alpha = new int[26];
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			alpha[(int) str.charAt(i) - 97]++;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}

	}

}
