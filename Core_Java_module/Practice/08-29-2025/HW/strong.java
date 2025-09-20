class TestStrong{
	public static void main(String[] args){
		int n=123,temp=n,sum=0;
		
		while(temp>0){
			int digit=temp%10;
			
			int fact=1;
			while(digit>0){
				fact=fact*digit;
				digit--;
			}

			sum=sum+fact;
			temp=temp/10;
		}

		if(sum==n) System.out.println(n+" is a STRONG Number");
		else System.out.println(n+" is not a STRONG Number");
	} //main ends here

} //Class TestStrong ends here