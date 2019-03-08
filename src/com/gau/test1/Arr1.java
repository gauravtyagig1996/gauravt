package com.gau.test1;

public class Arr1 {
	static int[] get() {
		return new int[] { 10, 30, 50, 90, 60 };
	}

	public static void main(String args[]) {
		int arr[] = get();
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
