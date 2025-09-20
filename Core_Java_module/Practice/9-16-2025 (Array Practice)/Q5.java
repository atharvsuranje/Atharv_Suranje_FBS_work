// Print alternate elements in array.
import java.util.Scanner;

class Q5 {
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
        
        for(int i=0;i<n;i=i+2){
            System.out.print(arr[i]+" , ");
        }
        System.out.println();

        for(int i=1;i<n;i=i+2){
            System.out.print(arr[i]+" , ");
        }
    }
}
