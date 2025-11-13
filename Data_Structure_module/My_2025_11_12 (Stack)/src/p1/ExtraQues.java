package p1;

public class ExtraQues {
	public static void main(String[] args) {
		MainApp app = new MainApp();

		
		//Take an array of integers and reverse it using a stack
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int it = 0; it < arr.length; it++) {
			app.insert(arr[it]);
		}
		System.out.println("Reversing");
		for (int it = 0; it < arr.length; it++) {
			Node popped = MyStack.getObject().pop();
			arr[it] = popped.getData();
		}
		for (int it = 0; it < arr.length; it++) {
			System.out.print(arr[it] + "  ");
		}
		
		//After pushing multiple numbers, find and display the sum of all elements
		//Count how many numbers are even and how many are odd
		//Find the maximum and minimum values in the stack


		int sum=0,evens=0,odds=0,mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
		for (int it = 0; it < arr.length; it++) {
			app.insert(arr[it]);
		}
		System.out.println("Sum");
		for (int it = 0; it < arr.length; it++) {
			Node popped = MyStack.getObject().pop();
			int value=popped.getData();
			sum += value;
			if(value %2 ==0) {
				evens++;
			}
			else {
				odds++;
			}
			
			
			if(value<mini) {
				mini=value;
			}
			if(value > maxi) {
				maxi=value;
			}
		}
		System.out.println("SUM is : "+sum);
		System.out.println("EVEN Count is  : "+evens);
		System.out.println("ODD Count is : "+odds);
		System.out.println("Maximum is : "+maxi);
		System.out.println("Minimum is :"+mini);
		//
	}
}
