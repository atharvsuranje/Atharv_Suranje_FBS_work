package linearsearch;

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
		
		int idx=app.linearSearch(arr,target);
		
		if(idx!=-1) {
			System.out.println("Element "+target+" Found at index "+idx);			
		}
		else {
			System.out.println("Element "+target+" NOT Found");
		}
		
		sc.close();
	}
	
	public int linearSearch(int[]arr,int target) {
		for(int it=0;it<arr.length;it++) {
			if(arr[it] == target) {
				return it;
			}
		}
		return -1;
	}

}
