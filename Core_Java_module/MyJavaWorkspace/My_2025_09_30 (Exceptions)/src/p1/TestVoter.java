package p1;

class VoterAgeException extends Exception{
	public String toString() {
		return "Invalid Age";
	}
}
class Voter{
	int age;

	Voter(int age) {
		this.age = age;
	}
	
	void validate() {
		try {
			if(this.age <18) {
				throw new VoterAgeException();
			}
			else {
				System.out.println("You are eligible");
			}
		}
		catch(VoterAgeException vae) {
			vae.printStackTrace();
			System.out.println(vae);
		}
	}
	
}
class TestVoter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter v1=new Voter(17);
		v1.validate();
		Voter v2=new Voter(24);
		v2.validate();
	}

}
