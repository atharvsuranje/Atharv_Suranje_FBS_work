class TestArmstrong{
	public static void main(String [] a){
		int n=1634;
		int temp=n,count=0;
		
		//count no. of digits
		while(temp>0){
			temp=temp/10;
			count++;
		}
		int temp1=n,sum=0;

		//armstrong sum
		while(temp1>0){
			int digit=temp1%10;
			int power=1;
			for(int i=0;i<count;i++){
				power=power*digit;
			}			
			sum=sum+power;
			temp1=temp1/10;
		}
		
		if(sum==n){
			System.out.println(n+" is Armstrong number");
		}
		else{
			System.out.println(n+" is NOT Armstrong number");
		}
	} //main ends here

} //Class TestArmstrong ends here