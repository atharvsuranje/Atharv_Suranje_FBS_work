package p1;

public class TestStudent {

	public static void main(String[] args) {
//		payFees stud1 =new OnlineStudent();
//		stud1.payOnline();
//		payFees stud2 =new DemoStudent();
//		stud2.payOnline();
		
		payFees[] students= {new OnlineStudent(),new DemoStudent(),new OfflineStudent()};
		for(payFees student:students) {
			student.payOffline();
		}
	}

}
