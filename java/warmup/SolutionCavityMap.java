package com.hackerrank.warmup;
import java.util.Scanner;

public class SolutionCavityMap {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		if (n > 100 || n < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}
		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			String string = in.next();
			if (string.length() != n) {
				in.close();
				throw new Exception("Invalid Input");
			}
			array[i] = string;
		}

		for (int i = 1; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - 1; j++) {
				char targetChar = array[i].charAt(j);
				char up = array[i - 1].charAt(j);
				char down = array[i + 1].charAt(j);
				char left = array[i].charAt(j - 1);
				char right = array[i].charAt(j + 1);
				if (targetChar > up && targetChar > down && targetChar > left
						&& targetChar > right) {
					StringBuilder replacement = new StringBuilder(array[i]);
					replacement.setCharAt(j, 'X');
					array[i] = replacement.toString();
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		in.close();
	}

}
