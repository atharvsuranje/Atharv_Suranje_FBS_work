package quicksort;

import java.util.Scanner;

public class MainApp {
	public static int passNo=1;

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
		quick(arr);
		System.out.println("\nElements After Sort are : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+"  ");
		}
		sc.close();
	}
	
	public static void quick(int[] arr) {
		sort(arr,0,arr.length-1); 
	}

	private static void sort(int[] arr, int low, int high) {
		if(low<high) {
			int partationIdx=partation(arr,low,high);
			
			System.out.println("\nPass " + (passNo) + " : ");
	        for (int ctr = 0; ctr < arr.length; ctr++) {
	            System.out.print(arr[ctr] + "  ");
	        }
	        passNo++;
	        
			sort(arr,low,partationIdx-1);
			sort(arr,partationIdx+1,high);	
		}
	}

	private static int partation(int[] arr, int low, int high) {
		int pivot=arr[high];
		int positionOfpivot=low-1;
		
		for(int ctr=low;ctr<high;ctr++) {
			if(arr[ctr] <= pivot) {
				positionOfpivot++;
				int temp=arr[positionOfpivot];
				arr[positionOfpivot] = arr[ctr];
				arr[ctr]=temp;
			}
		}
		int temp=arr[positionOfpivot+1];
		arr[positionOfpivot+1]=arr[high];
		arr[high]=temp;
		return positionOfpivot+1;
	}
}
