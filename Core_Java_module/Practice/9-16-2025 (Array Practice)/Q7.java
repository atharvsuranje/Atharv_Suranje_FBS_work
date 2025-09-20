// Take two array and add sum in third array

import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        int n1,n2;
		System.out.print("Enter array 1 size : ");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.print("Enter array 2 size : ");
		n2=sc.nextInt();
        int n3=Math.max(n1,n2);
		int [] arr=new int [n1];
		int [] brr=new int [n2];
        int [] crr=new int [n3];
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
		System.out.print("Array 2 Elements are :");
		for(int i=0;i<n2;i++){
			System.out.print(brr[i]+" , ");
		}
		System.out.println();
        for(int i=0;i<Math.min(n1,n2);i++){
            crr[i]=arr[i]+brr[i];
        }
        for(int i=Math.min(n1,n2);i<n3;i++){
            if(n1<n2){
                crr[i]=brr[i];
            }
            else{
                crr[i]=arr[i];
            }
        }
        System.out.println();
        System.out.print("Sum Array Elements are :");
		for(int i=0;i<n3;i++){
			System.out.print(crr[i]+" , ");
		}
    }
}
