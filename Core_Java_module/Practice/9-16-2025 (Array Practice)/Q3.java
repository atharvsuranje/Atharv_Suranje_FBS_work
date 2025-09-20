//Find sum of all numbers.

import java.util.Scanner;
class Q3{
	public static void main(String[] args){
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		n=sc.nextInt();
		int[] arr=new int[5];
		
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
			sum+=arr[i];
		}
		System.out.println("Sum is : "+sum);
	}
}