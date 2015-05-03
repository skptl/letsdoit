package com.hackerrank.warmup;
import java.util.*;

public class SolutionLoveLetterMystery {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		if (T > 10 || T < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}

		ArrayList<String> testCases = new ArrayList<String>();
		for (int i = 0; i < T; i++) {
			String input = in.next();
			if (input.length() > 10000) {
				in.close();
				throw new Exception("Invalid Input");
			}
			testCases.add(i, input);
		}

		for (int i = 0; i < testCases.size(); i++) {

			String testString = testCases.get(i);
			int stringLength = testString.length();

			int count = 0;

			for (int j = 0; j < stringLength; j++) {
				char charOne = testString.charAt(j);
				char charTwo = testString.charAt(stringLength - (j + 1));
				while (charOne != charTwo) {
					if (charOne > charTwo) {
						charOne--;
					}
					if (charOne < charTwo) {
						charTwo--;
					}
					count++;
				}
				if(stringLength%2==0 && j==((stringLength/2)-1))
					break;
				if(stringLength%2==1 && j==(stringLength/2))
					break;
			}

			System.out.println(count);

		}

		in.close();
	}

}
