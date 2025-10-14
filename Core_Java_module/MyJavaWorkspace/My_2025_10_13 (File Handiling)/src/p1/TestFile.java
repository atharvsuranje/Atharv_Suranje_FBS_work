package p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestFile {

	public static void mainWrite(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("E://Firstbit Course//Core_Java_module//MyJavaWorkspace//My_2025_10_13 (File Handiling)//src//files//Data.txt");
			DataOutputStream dos=new DataOutputStream(fos);
			ObjectOutputStream oos =new ObjectOutputStream(dos);
			oos.writeObject(new Student(101,"Atharv",80));
			System.out.println("Written Successfully!!!!!!");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	} // mainWrite ends here

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E://Firstbit Course//Core_Java_module//MyJavaWorkspace//My_2025_10_13 (File Handiling)//src//files//Data.txt");
			DataInputStream dis = new DataInputStream(fis);
			ObjectInputStream ois =new ObjectInputStream(dis);
			Student s1 = (Student) ois.readObject();
			System.out.println(s1);
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
