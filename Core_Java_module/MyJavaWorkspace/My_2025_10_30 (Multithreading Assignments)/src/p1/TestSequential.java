package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestSequential {
	public static void main(String[] args) {
		
		String firstNamePath="E:\\Firstbit Course\\Core_Java_module\\MyJavaWorkspace\\My_2025_10_30 (Multithreading Assignments)\\src\\files\\first_names.txt";
		String lastNamePath="E:\\Firstbit Course\\Core_Java_module\\MyJavaWorkspace\\My_2025_10_30 (Multithreading Assignments)\\src\\files\\last_names.txt";
		long start = System.nanoTime();
		
		System.out.println("First Names");
		readFile(firstNamePath);
		
		System.out.println();
		System.out.println();
		System.out.println("Last Names");
		readFile(lastNamePath);
		
		long end = System.nanoTime();
		System.out.println("Sequential Execution time: " + (end - start) / 1_000_000.0 + " ms");

	}
	
	public static void readFile(String path) {
		try(FileReader fileReader = new FileReader(path);
				BufferedReader bufferedReader= new BufferedReader(fileReader);
			){
				String str=bufferedReader.readLine();
				while(str!=null) {
					System.out.println(str);
					try {
						Thread.sleep(1);
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					str=bufferedReader.readLine();
				}
			}
			catch (IOException e) {
				System.out.println("File Not Found");
			}
	}
}
