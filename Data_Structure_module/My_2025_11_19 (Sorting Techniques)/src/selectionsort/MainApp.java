package selectionsort;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("\nEnter "+size+" Elements : ");
		for(int i=0;i<size;i++) {
			System.out.print("arr["+i+"] = ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("\nElements Before Sort are : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+"  ");
		}
		selectionSort(arr);
		System.out.println("\nElements After Sort are : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+"  ");
		}
		sc.close();
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int miniIdx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[miniIdx]) {
					miniIdx=j;
				}
			}
			int temp= arr[i];
			arr[i]=arr[miniIdx];
			arr[miniIdx]=temp;
			System.out.print("\n\nPass "+(i+1)+" :");
			for(int k=0;k<arr.length;k++) {
				System.out.print(arr[k]+"  ");
			}
		}
	}
}
