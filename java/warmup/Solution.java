package com.hackerrank.warmup;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();

		long[] jars = new long[N];
		for (int i = 0; i < jars.length; i++) {
			jars[i] = 0;
		}

		for (int i = 0; i < M; i++) {
			long k;
			int a, b;
			a = in.nextInt();
			b = in.nextInt();
			k = in.nextLong();
			for (int j = a - 1; j < b; j++) {
				jars[j] = jars[j] + k;
			}
		}
		long total = 0;
		for (int i = 0; i < jars.length; i++) {
			total = total + jars[i];
		}

		DecimalFormat decimalFormat = new DecimalFormat("#");
		System.out.println(decimalFormat.format(Math.floor(total / N)));

		in.close();
	}

}