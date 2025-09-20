// Find second max element from array

import java.util.Scanner;

class Q11 {
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

        int maxi=Integer.MIN_VALUE,smaxi=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                smaxi=maxi;
                maxi=arr[i];
            }
            else if(arr[i]<maxi && arr[i]>smaxi){
                smaxi=arr[i];
            }
        }
        System.out.println("\nThe Second Maximum element is: " + smaxi);
    }
}
