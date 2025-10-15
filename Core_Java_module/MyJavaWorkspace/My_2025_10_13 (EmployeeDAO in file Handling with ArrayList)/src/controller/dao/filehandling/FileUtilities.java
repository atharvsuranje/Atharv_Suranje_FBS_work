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
		try {
			FileOutputStream fos =new FileOutputStream(filePath);
			DataOutputStream dos =new DataOutputStream(fos);
			ObjectOutputStream oos=new ObjectOutputStream(dos);
			oos.writeObject(empArr);
			System.out.println("Data saved to the file");
		} 
		catch (IOException e) {
			System.out.println("File Not Found");
		}
	}
	
	public static ArrayList<Employee> readFromFile(String filePath){
		ArrayList<Employee> empArr=new ArrayList<Employee>();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			DataInputStream dis = new DataInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(dis);
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
