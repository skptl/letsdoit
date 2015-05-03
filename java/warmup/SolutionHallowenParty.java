package com.hackerrank.warmup;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SolutionHallowenParty {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		if (T > 10 || T < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}

		for (int i = 0; i < T; i++) {
			long K = in.nextLong();
			if (K > 10000000 || K < 2) {
				in.close();
				throw new Exception("Invalid Input");
			}
			double half = Math.floor(K / 2);
			double result = 0;
			if ((K & 1) == 0) {
				result = half * half;
			} else {
				result = half * (half + 1);
			}
			DecimalFormat decimalFormat = new DecimalFormat("#");
			System.out.println(decimalFormat.format(result));
		}

		in.close();
	}

}
