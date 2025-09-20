// Merge two arrays

import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        int n1,n2;
		System.out.print("Enter array 1 size : ");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.print("Enter array 2 size : ");
		n2=sc.nextInt();
        int [] arr=new int [n1];
		int [] brr=new int [n2];
        int [] crr=new int [n1+n2];
        for(int i=0;i<n1;i++){
			System.out.print("Enter "+(i+1)+" Element of Array 1 : ");
			arr[i]=sc.nextInt();
		}		
		for(int i=0;i<n2;i++){
			System.out.print("Enter "+(i+1)+" Element of Array 2 : ");
			brr[i]=sc.nextInt();
		}
		System.out.print("Array 1 Elements are :");
		for(int i=0;i<n1;i++){
			System.out.print(arr[i]+" , ");
		}
		System.out.print("\nArray 2 Elements are :");
		for(int i=0;i<n2;i++){
			System.out.print(brr[i]+" , ");
		}
        for(int i=0;i<n1;i++){
            crr[i]=arr[i];
        }
        for(int i=n1;i<n1+n2;i++){
            crr[i]=brr[i-n1];
        }
        System.out.print("\nMerged Array Elements are :");
		for(int i=0;i<n1+n2;i++){
			System.out.print(crr[i]+" , ");
		}
    }
}
