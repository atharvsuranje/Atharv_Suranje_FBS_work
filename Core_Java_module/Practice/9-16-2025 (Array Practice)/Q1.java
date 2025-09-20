//Find minimum and maximum number in array.
import java.util.Scanner;

class Q1{
	public static void main(String[] args){
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
		int mini=arr[0],maxi=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]<mini) mini=arr[i];
			if(arr[i]>maxi) maxi=arr[i];
		}

		System.out.println("Minimum in Array is : "+mini);
		System.out.println("Maximum in Array is : "+maxi);		
	} //main ends here
}