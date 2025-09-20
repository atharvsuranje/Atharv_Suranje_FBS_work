// Accept array and print only prime numbers of array.

import java.util.Scanner;

class Q6 {
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
		System.out.print("Prime Numbers are");

        for(int i=0;i<n;i++){
            boolean isPrime=true;
            for(int j=2;j<arr[i]/2;j++){
                if(arr[i]%j == 0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime==true) {
                System.out.print(arr[i]+" , ");
            }
        }
    }
}