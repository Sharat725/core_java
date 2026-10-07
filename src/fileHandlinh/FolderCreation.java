package fileHandlinh;

import java.io.File;

public class FolderCreation {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\Sharatkumar G Hulli\\Desktop\\FileHandling");
		if(f1.mkdir()) {
			System.out.println("Folder created");
		}

	else {
		System.out.println("Folder not created");
	}
//		if(f1.exists()) {
//			System.out.println("Foldeer exists...");
//		}
//		else {
//			System.out.println("Folder does not exists...");
//		}
//		if(f1.delete()) {
//			System.out.println("Folder is deleted..");
//		}
//		else {
//			System.out.println("Folder not deleted");
//		}
//		
	}
	

}
