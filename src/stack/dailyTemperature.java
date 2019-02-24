package stack;

import java.util.Arrays;
import java.util.Stack;

// 739
public class dailyTemperature {
	public static void main(String[] args) {
		int[] array = { 73, 74, 75, 71, 69, 72, 76, 73 };
		System.out.println(new dailyTemperature().dailyTemperatures(array));
		// 直接打印只会打印数组的首位置
		// 问题1: 除了通过debug查看数组，如何在控制台直接打印数组来测试下面的method？
		// To do : How to test the method below
	}

	public int[] dailyTemperatures(int[] T) {
		Stack<Integer> stack = new Stack();
		int[] arr = new int[T.length];  // 处理后数组
		int[] result = new int[T.length]; // 储存“处理后数组”中每一个元素在初始数组T里的对应位置并返回

		for (int i = T.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() < T[i])
				stack.pop();

			if (stack.isEmpty())
				arr[i] = 0;
			else
				arr[i] = stack.peek();

			stack.push(T[i]);
		}

		// To do : How to find the index/position of each element of an array on the other array
		// 问题2: 如何找到一个数组中每个元素在另一个数组中的对应位置，未找到返回负值或0
		// index[]: collect index
		// T[] : original array
		// arr[] : given array

		for (int j = 0; j < result.length; j++) {
			result[j] = Arrays.binarySearch(T, arr[j]); // find index of element in T[]
            // Use binarySearch should sort the array before
			// 如果没有对数组进行排序，则结果是不确定的。如果数组包含多个带有指定值的元素，则无法确认找到的是哪一个。
			if (result[j] < 0) { // should return -1 if no element found in T[], then use 0 replace
				result[j] = 0;
			}
		}

		return result;
	}
}
