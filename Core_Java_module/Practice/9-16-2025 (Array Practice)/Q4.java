//Find odd and even among the numbers.
import java.util.Scanner;

class Q4{
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
		int [] even=new int [n];
		int [] odd=new int [n];
        int e=0,o=0;
		for(int i=0;i<n;i++){
			if(arr[i]%2 == 0){
                even[e]=arr[i];
                e++;
            }
            else{
                odd[o]=arr[i];
                o++;
            }
		}
        System.out.print("Even Numbers are : ");
        for(int i=0;i<e;i++){
            System.out.print(even[i]+" , ");
        }
        System.out.println();
        System.out.print("Odd Numbers are : ");
        for(int i=0;i<o;i++){
            System.out.print(odd[i]+" , ");
        }
	} //main ends here
}