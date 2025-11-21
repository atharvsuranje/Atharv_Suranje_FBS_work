package insertionsort;

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
		insertionSort(arr);
		System.out.println("\nElements After Sort are : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+"  ");
		}
		sc.close();
	}

	public static void insertionSort(int[] arr) {
		
		for(int outerCtr=1;outerCtr<arr.length;outerCtr++) {
			int key=arr[outerCtr];
 
			int innerCtr;
			for(innerCtr=outerCtr-1;innerCtr>=0;innerCtr--) {
				
				if(arr[innerCtr]>key){
					arr[innerCtr+1] = arr[innerCtr];
				}
				else{
					break;
				}
			}
			arr[innerCtr+1]=key;
			System.out.println("\nPass " + outerCtr + " :");
	        for(int ctr=0;ctr<arr.length;ctr++){
	        	System.out.print(arr[ctr] + "  ");	        	
	        }
		}
	}

}
