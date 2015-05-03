package com.hackerrank.warmup;
import java.util.*;


public class SolutionTest1 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		double maxSize = 1000000 ;
		
		int inputSize = in.nextInt();
		
		if(inputSize < 1 || inputSize >100) {
			System.out.println("NO");
			System.exit(-1);
		}
		
		while(inputSize!=0) {
			
			int firstInt = in.nextInt();
			int secondInt = in.nextInt();
			
			if( firstInt < 1 || firstInt > secondInt) {
				System.out.println("NO");
				inputSize--;
				continue;
			}			
			
			if( secondInt < firstInt || secondInt > 10) {
				System.out.println("NO");
				inputSize--;
				continue;
			}
			
			double numberOfPasswords = 0;
			
			int difference = secondInt - firstInt;
			
			for(int i = 0; i <= difference; i++) {
				numberOfPasswords = numberOfPasswords + Math.pow(10, firstInt+difference);
			}
			
			for(int i = 0; i < firstInt; i++) {
				numberOfPasswords = numberOfPasswords - Math.pow(10, i);
			}
			
			if(numberOfPasswords < maxSize) 
				System.out.println("NO");
			else
				System.out.println("YES");
			
			inputSize--;
		}
		
		in.close();
	}

}
