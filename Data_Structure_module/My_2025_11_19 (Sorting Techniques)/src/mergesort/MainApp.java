package mergesort;

import java.util.Scanner;

public class MainApp {
	static int passNo=1;

	public static void main(String[] args) {
		MainApp app = new MainApp();
		int size;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("\nEnter " + size + " Elements : ");
		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}

		System.out.println("\nElements Before Sort are : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "  ");
		}

		app.sort(arr, 0, arr.length - 1);
		System.out.println("\nAfter Sorting Are : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "  ");
		}
		sc.close();
	}

	public void sort(int[] arr, int left, int right) {
		if (left == right) {
			return;
		} 
		else {
			int mid = left + ((right - left) / 2);

			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, right, mid);
			
			System.out.println();
			System.out.println("After Pass No : "+passNo);
			for(int ctr=0;ctr<arr.length;ctr++) {
				System.out.print(arr[ctr]+"  ");
			}
			passNo++;
		}
	}

	public void merge(int[] arr, int left, int right, int mid) {
		int leftSize = mid - left + 1;
		int rightSize = right - mid;

		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];

		for (int ctr = 0; ctr < leftSize; ctr++) {
			leftArray[ctr] = arr[left + ctr];
		}

		for (int ctr = 0; ctr < rightSize; ctr++) {
			rightArray[ctr] = arr[mid + 1 + ctr];
		}

		int leftCtr = 0;
		int rightCtr = 0;
		int mergeCtr = left;

		while (leftCtr < leftSize && rightCtr < rightSize) {
			if (leftArray[leftCtr] <= rightArray[rightCtr]) {
				arr[mergeCtr] = leftArray[leftCtr];
				leftCtr++;
			} else {
				arr[mergeCtr] = rightArray[rightCtr];
				rightCtr++;
			}
			mergeCtr++;
		}

		while (leftCtr < leftSize) {
			arr[mergeCtr] = leftArray[leftCtr];
			leftCtr++;
			mergeCtr++;
		}

		while (rightCtr < rightSize) {
			arr[mergeCtr] = rightArray[rightCtr];
			rightCtr++;
			mergeCtr++;
		}
	}
}
