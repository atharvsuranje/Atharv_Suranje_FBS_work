package bubblesort;

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
		bubbleSort(arr);
		System.out.println("\nElements After Sort are : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+"  ");
		}
		sc.close();
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean isSwapped=false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					isSwapped=true;
				}
			}
			if(!isSwapped) break;
		}
	}
}
