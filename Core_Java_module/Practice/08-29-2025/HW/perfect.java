class TestPerfect{
	public static void main(String [] args){
		int n=1,sum=0;

		for(int i=1;i<=n/2;i++){
			if(n%i == 0){
				sum=sum+i;
			}
		}

		if(sum==n){
			System.out.println(n+" is a PERFECT Number");
		}
		
		else{
			System.out.println(n+" is NOT a PERFECT Number");
		}
	} //main ends here

} //Class TestPerfect ends here