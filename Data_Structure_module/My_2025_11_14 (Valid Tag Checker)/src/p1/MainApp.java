package p1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {

	public static void main(String[] args) {
		
		String input = "";
		
		try {
			Path path=Paths.get("E:\\Firstbit Course\\Data_Structure_module\\My_2025_11_14 (Valid Tag Checker)\\src\\p1\\input.txt");
			input=Files.readString(path);
		}
		catch(Exception e) {
			System.out.println("Error reading File.");
			return;
		}
		
		Checker c1=new Checker();
		boolean valid=c1.isValid(input);
		if(valid) {
			System.out.println("Tags are Valid");
		}
		else {
			System.out.println("Tags are Invalid");
		}
		
		CheckerWithMessage c2=new CheckerWithMessage();
		String result=c2.validate(input);
		System.out.println(result);
	}

}
