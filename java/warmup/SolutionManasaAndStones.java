package com.hackerrank.warmup;
import java.util.Scanner;

public class SolutionManasaAndStones {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		if (T > 10 || T < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}

		for (int i = 0; i < T; i++) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			if (n > 1000 || n < 1) {
				in.close();
				throw new Exception("Invalid Input");
			}
			if (a > 1000 || a < 1) {
				in.close();
				throw new Exception("Invalid Input");
			}
			if (b > 1000 || b < 1) {
				in.close();
				throw new Exception("Invalid Input");
			}
			if (a > b) {
				a = a + b;
				b = a - b;
				a = a - b;
			}
			int difference = b - a;
			int startInt = a * (n - 1);
			if (a == b)
				System.out.print(startInt + " ");
			else {
				while (startInt <= b * (n - 1)) {
					System.out.print(startInt + " ");
					startInt = startInt + difference;
				}
			}
			System.out.println();
		}

		in.close();
	}

}
