// Reverse the given array.

import java.util.Scanner;

class Q9 {
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
        int front=0,back=n-1;
        while(front<back){
            int temp=arr[front];
            arr[front]=arr[back];
            arr[back]=temp;
            front++;
            back--;
        }
        System.out.print("Array Elements are :");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" , ");
		}
    }
}