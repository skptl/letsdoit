package com.hackerrank.warmup;
import java.util.Scanner;

public class SolutionLonelyInteger {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		if (N >= 100 || N < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}

		if (N % 2 != 1) {
			in.close();
			throw new Exception("Invalid Input");
		}

		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			int input = in.nextInt();
			if (input > 100) {
				in.close();
				throw new Exception("Invalid Input");
			}
			array[i] = input;
		}

		quickSort(array, 0, N - 1);

		for (int i = 0; i < N; i = i + 2) {

			if (i >= N-1) {
				System.out.print(array[i] + " ");
				in.close();
				return;
			}
			
			if (array[i] != array[i + 1]) {
				System.out.print(array[i] + " ");
				in.close();
				return;
			}

		}

		in.close();
	}

	static void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
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
