// Sort the array

import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        int n;
		System.out.print("Enter array size : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++){
			System.out.print("Enter "+(i+1)+" Element of Array : ");
			arr[i]=sc.nextInt();
		}		
		System.out.print("Array Elements are :");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" , ");
		}
		System.out.println();
        for(int i=0;i<n;i++){
             for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array Elements are :");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" , ");
		}       
    }
}