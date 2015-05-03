package com.hackerrank.warmup;
import java.util.ArrayList;
import java.util.Scanner;

public class SolutionAngryProfessor {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		if (T > 10 || T < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}

		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int K = in.nextInt();
			if (N > 1000 || N < 1) {
				in.close();
				throw new Exception("Invalid Input");
			}
			if (K > N || N < 1) {
				in.close();
				throw new Exception("Invalid Input");
			}
			ArrayList<Integer> array = new ArrayList<Integer>();
			for (int j = 0; j < N; j++) {
				int arrivalTime = in.nextInt();
				if (arrivalTime > 100 || arrivalTime < -100) {
					in.close();
					throw new Exception("Invalid Input");
				}
				if(arrivalTime<1)
					array.add(arrivalTime);
			}
			if(array.size()<K)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}

		in.close();
	}

}
