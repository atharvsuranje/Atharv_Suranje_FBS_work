interface Discounts{
	void discount();
} //interface Discounts ends here

class Mall implements Discounts{
	@Override
	public void discount() {
		System.out.println("30% discount given");
	}
	
}
public class TestAnonymous {
	public static void main(String[] args) {
		Mall m1 = new Mall();
		m1.discount();
		
//		Discounts m2=new Discounts() {
//			@Override
//			public void discount() {
//				System.out.println("80% discount given");
//			}
//		};
//		m2.discount();
		
		//We can also use the anonymous class in the below way:
		
		new Discounts() {
			@Override
			public void discount() {
				System.out.println("80% discount given");
			}
		}.discount();
		Mall m3 = new Mall();
		m3.discount();
		
		
	}

}
