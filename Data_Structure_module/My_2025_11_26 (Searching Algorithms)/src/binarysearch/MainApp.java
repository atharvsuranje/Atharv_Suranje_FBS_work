package binarysearch;

import java.util.Scanner;

public class MainApp {

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

		System.out.println("\nElements are : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		System.out.print("\nEnter Element you want to Search : ");
		int target=sc.nextInt();
		
		int idx=app.binarySearch(arr,target);
		
		if(idx!=-1) {
			System.out.println("Element "+target+" Found at index "+idx);			
		}
		else {
			System.out.println("Element "+target+" NOT Found");
		}
		
		sc.close();
	}
	
	public int binarySearch(int[] arr,int target) {
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int mid = left + (right-left)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] < target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}

}
