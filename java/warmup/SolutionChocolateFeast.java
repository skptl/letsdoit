package com.hackerrank.warmup;
import java.util.Scanner;

public class SolutionChocolateFeast {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		if (T > 1000 || T < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}
		
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			if (N > 100000 || N < 2) {
				in.close();
				throw new Exception("Invalid Input");
			}
			int C = in.nextInt();
			if (C > N || C < 1) {
				in.close();
				throw new Exception("Invalid Input");
			}
			int M = in.nextInt();
			if (M > N || M < 2) {
				in.close();
				throw new Exception("Invalid Input");
			}
			
			int numberOfChocolates = N/C;
			int numberOfWrappers = numberOfChocolates;
			int numberOfExcahngedChocolates = 0;
			int numberOfLeftWrappers = 0;
			while(numberOfWrappers>=M) {
				numberOfExcahngedChocolates = numberOfWrappers/M;
				numberOfLeftWrappers = numberOfWrappers%M;
				numberOfChocolates = numberOfChocolates + numberOfExcahngedChocolates;
				numberOfWrappers = numberOfLeftWrappers + numberOfExcahngedChocolates;
			}
			
			System.out.println(numberOfChocolates);

		}

		in.close();
	}

}
