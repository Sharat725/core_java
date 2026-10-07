package fileHandlinh;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\Sharatkumar G Hulli\\Desktop\\FileHandling\\First.txt");
		FileReader fr = new FileReader(f1);
		char[] arr=new char[(int) f1.length()]; //f1.length() return long we have to narrow it by explicitly
		fr.read(arr);
		
		//converting array to String
		String s1=new String(arr);
		System.out.println(s1);
	}

}
