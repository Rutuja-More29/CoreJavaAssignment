package iofile;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("D://textfile.txt");
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.getAbsolutePath()); //whole path
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.exists());
		System.out.println(f.isHidden());
		System.out.println(f.delete());
		System.out.println(f.createNewFile());
		System.out.println(f.setReadOnly());
	}

}
