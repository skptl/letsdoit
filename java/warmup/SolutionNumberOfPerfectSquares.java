package com.hackerrank.warmup;
import java.util.Scanner;

public class SolutionNumberOfPerfectSquares {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		if (T > 100 || T < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}

		for (int i = 0; i < T; i++) {
			long A, B;
			A = in.nextLong();
			B = in.nextLong();
			if (A > B) {
				in.close();
				throw new Exception("Invalid Input");
			}
			int noOfSquareroots = (int) Math.sqrt(B) - (int) Math.sqrt(A-1);
			System.out.println(noOfSquareroots);
		}

		in.close();
	}
}
