package com.hackerrank.warmup;
import java.util.Scanner;

public class SolutionMinimumFairness {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		if (N > 100000 || N < 2) {
			in.close();
			throw new Exception("Invalid Input");
		}

		int K = in.nextInt();
		if (K > N || K < 2) {
			in.close();
			throw new Exception("Invalid Input");
		}

		long[] array = new long[N];
		for (int i = 0; i < N; i++) {
			long data = in.nextLong();
			array[i] = data;
		}

		quickSort(array, 0, N - 1);

		int minIndex = -1;
		long minimumDifference = Long.MAX_VALUE;
		for (int i = 0; i <= array.length - K; i++) {
			long temp = array[i + K - 1] - array[i];
			if (temp < minimumDifference) {
				minimumDifference = temp;
				minIndex = i;
			}
		}

		System.out.println(array[minIndex + K - 1] - array[minIndex]);

		in.close();
	}

	static void quickSort(long arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	static int partition(long arr[], int left, int right) {
		int i = left, j = right;
		long tmp;
		long pivot = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		;
		return i;
	}
}
