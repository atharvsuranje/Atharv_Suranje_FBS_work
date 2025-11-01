package p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class ReadFile extends Thread{
	public String path;
	public List<String> results;
	
	public ReadFile(String path, List<String> results) {
		this.path = path;
		this.results = results;
	}
	
	public void run() {
		try(FileReader fileReader = new FileReader(this.path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);)
		{
			String str;
			str=bufferedReader.readLine();
			while(str!=null) {
				this.results.add(str);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class TestMultithreading {
	public static void main(String[] args) {
		String firstNamePath="E:\\Firstbit Course\\Core_Java_module\\MyJavaWorkspace\\My_2025_10_30 (Multithreading Assignments)\\src\\files\\first_names.txt";
		String lastNamePath="E:\\Firstbit Course\\Core_Java_module\\MyJavaWorkspace\\My_2025_10_30 (Multithreading Assignments)\\src\\files\\last_names.txt";
		
		LinkedList<String> firstNames = new LinkedList<String>();
		LinkedList<String> lastNames = new LinkedList<String>();
		LinkedList<String> fullNames = new LinkedList<String>();
		long start = System.nanoTime();
		
		ReadFile t1=new ReadFile(firstNamePath,firstNames);
		ReadFile t2=new ReadFile(lastNamePath,lastNames);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<firstNames.size();i++) {
			fullNames.add(firstNames.get(i)+" "+lastNames.get(i));
		}
		
		System.out.println(fullNames);
		
		long end = System.nanoTime();
		System.out.println("Multithreaded Merge Execution time: " + (end - start) / 1_000_000.0 + " ms");
	}

}
