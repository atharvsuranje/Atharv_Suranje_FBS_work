import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	
	public static void main(String[] args) {
//		FileReader fileReader;
//		try {
//			fileReader= new FileReader("E:\\Firstbit Course\\Core_Java_module\\MyJavaWorkspace\\My_2025_10_14 (File Handling via text)\\src\\file1.txt");
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//			String str=bufferedReader.readLine();
//			FileWriter fileWriter = new FileWriter("E:\\Firstbit Course\\Core_Java_module\\MyJavaWorkspace\\My_2025_10_14 (File Handling via text)\\src\\file2.txt");
//			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//			while(str!=null) {
//				System.out.println(str);
//				bufferedWriter.write(str);
//				bufferedWriter.newLine();
//				str=bufferedReader.readLine();
//			}
//		} 
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			fileReader.close();
//			bufferedWriter.close();
//			fileWriter.close();
//		}
//		try(FileReader fileReader= new FileReader("E:\\Firstbit Course\\Core_Java_module\\MyJavaWorkspace\\My_2025_10_14 (File Handling via text)\\src\\file1.txt")){
//			
						
//					}
		
		try(FileReader fileReader= new FileReader("E:\\Firstbit Course\\Core_Java_module\\MyJavaWorkspace\\My_2025_10_14 (File Handling via text)\\src\\file1.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter("E:\\Firstbit Course\\Core_Java_module\\MyJavaWorkspace\\My_2025_10_14 (File Handling via text)\\src\\file2.txt",true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			){
			String str=bufferedReader.readLine();
			while(str != null) {
				System.out.println(str);
				bufferedWriter.write(str);
				bufferedWriter.newLine();
				str=bufferedReader.readLine();
			}
			System.out.println("\nRead form first File and Written into Second one.");
		} 
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} 
		catch (IOException e) {
			System.out.println("Some Error Occured.");
		}
		
	}
	

}
