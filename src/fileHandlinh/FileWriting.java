package fileHandlinh;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\Sharatkumar G Hulli\\Desktop\\FileHandling\\First.txt");
//		FileWriter fw=new FileWriter(f1); // normal Mode
		FileWriter fw=new FileWriter(f1,true); // append Mode
		
		fw.write("Hell");
		fw.write("HI");
		fw.flush();
		System.out.println("data is written");
		
		
	}

}
