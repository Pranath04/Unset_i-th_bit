package unset;

import java.util.Scanner;

public class Unset{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		System.out.println(unsetbits(A,B));
}
	public static int unsetbits(int A,int B) {
		int x = A;
		for(int i=0;i<B;i++) {
			x>>=1;
		}
		if((x&1)==1) {
			return A^(1<<B);
		}
		else {
			return B;
		}
	}
}