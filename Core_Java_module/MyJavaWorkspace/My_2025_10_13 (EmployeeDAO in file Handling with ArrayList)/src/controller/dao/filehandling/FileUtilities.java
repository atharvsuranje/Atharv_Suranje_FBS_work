package controller.dao.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Employee;

public class FileUtilities {
	
	public static void writeToFile(ArrayList<Employee> empArr, String filePath) {
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream(filePath);
			oos=new ObjectOutputStream(fos);
			oos.writeObject(empArr);
			System.out.println("Data saved to the file");
		} 
		catch (IOException e) {
			System.out.println("File Not Found");
		}
		finally {
			try {
				fos.close();
				oos.close();
			} 
			catch (IOException e) {
				System.out.println("File Couldn't be Closed.");
			}
		}
	}
	
	public static ArrayList<Employee> readFromFile(String filePath){
		ArrayList<Employee> empArr=new ArrayList<Employee>();
		FileInputStream fis =null;
		ObjectInputStream ois =null;
		try {
			fis= new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			Object tempObj =ois.readObject();
			if(tempObj instanceof ArrayList) {
				empArr = (ArrayList<Employee>) tempObj;
				return empArr;
			}
			return null;
		} 
		catch (IOException e) {
			System.out.println("File Not Found.\nInitializing an empty Employee array");
			return empArr;
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Class inside file doesn't match to the current class");
			return empArr;
		}
		
	}
}
