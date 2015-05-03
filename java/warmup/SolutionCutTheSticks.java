package com.hackerrank.warmup;
import java.util.Scanner;

public class SolutionCutTheSticks {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		if (N > 1000 || N < 1) {
			in.close();
			throw new Exception("Invalid Input");
		}

		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			int input = in.nextInt();
			if (input > 1000) {
				in.close();
				throw new Exception("Invalid Input");
			}
			array[i] = input;
		}

		quickSort(array, 0, N - 1);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				i = processSticks(array, i);
			}
		}

		in.close();
	}
	
	static int processSticks(int[] array, int start) {
		int endIndex = -1;
		int minimumStick = array[start];
		int count = 0;
		for (int i = start; i < array.length; i++) {
			array[i]  = array[i] - minimumStick;
			count++;
			if(array[i]<=0)
				endIndex = i;
		}
		System.out.println(count);
		return endIndex;
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
		};
		return i;
	}

}
