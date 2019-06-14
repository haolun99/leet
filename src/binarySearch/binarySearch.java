package binarySearch;

import java.util.Arrays;

public class binarySearch {
	public static void main(String[] args) {
		int[] test = {0, 1, 3, 4, 7, 8, 10, 15, 20, 21, 23, 42};
		System.out.println(Arrays.toString(test));
		
		System.out.println();
		System.out.println("Searching for 21");
		int result = binarySearch(test, 21);
		System.out.println(result);
		result = binarySearchNonRec(test, 21);
		System.out.println(result);
	}
	
	public static int binarySearchNonRec(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2; // Wait for improve
			if(target == arr[mid]) {
				return mid;
			}
			else if(target < arr[mid]) {
				end  = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	
	
	private static int binarysearchAlt(int[] arr, int target, int start, int end) {
		while(start <= end) {
//			if(start > end) {
//				return -1;
//			}
			
			int mid = (start + end) / 2;
			if(target == arr[mid]) {
				return mid;
			}
			else if(target < arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	private static int binarySearchNonRec(int[] arr, int target, int start, int end) {
		while(true) {
			if(start > end) {
				return -1;
			}
			
			int mid = (start + end) / 2;
			
			if(target == arr[mid]) {
				return mid;
			}
			else if(target < arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
	}
	
	
	public static int binarySearch(int[] arr, int target) {
		return binarySearch(arr, target, 0, arr.length - 1);
	}
	
	private static int binarySearch(int[] arr, int target, int start, int end) {
		if(start > end) {
			return -1;
		}
		
		int mid = (start + end) / 2;
		
		if(target == arr[mid]) {
			return mid;
		}
		
		else if(target < arr[mid]) {
			return binarySearch(arr, target, start, mid - 1);
		}
		else {
			return binarySearch(arr, target, mid + 1, end);
		}
	}
	
}
