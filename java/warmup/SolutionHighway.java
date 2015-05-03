package com.hackerrank.warmup;
import java.util.*;

public class SolutionHighway {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		if (N > 100000 || N < 2) {
			in.close();
			throw new Exception("Invalid Input");
		}

		int T = in.nextInt();

		if (T > 1000 || T < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}

		int[] freeWay = new int[N];
		for (int i = 0; i < freeWay.length; i++) {
			int input = in.nextInt();
			freeWay[i] = input;
		}
		
		int[][] testCases = new int[T][2];
		for (int k = 0; k < T; k++) {
			int i = in.nextInt();
			int j = in.nextInt();
			testCases[k][0] = i;
			testCases[k][1] = j;
		}
		
		for (int k = 0; k < testCases.length; k++) {
			int testResult = 4;
			for (int l = testCases[k][0]; l <= testCases[k][1]; l++) {
				if(freeWay[l] < testResult) {
					testResult = freeWay[l];
				}
			}
			System.out.println(testResult);
		}

		in.close();
	}

}
