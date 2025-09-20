//Search the given number in array.

import java.util.Scanner;
class Q2{
	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter "+(i+1)+" Element of Array : ");
			arr[i]=sc.nextInt();
		}		
		
		System.out.print("Array Elements are :");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" , ");
		}
		System.out.println();

		System.out.print("Enter Number to Search : ");
		int k=sc.nextInt();

		for(int i=0;i<n;i++){
			if(arr[i]==k){
				System.out.print(k+" Found at : "+i+" Index");
				break;
			} 
		}
	} //main ends here
}