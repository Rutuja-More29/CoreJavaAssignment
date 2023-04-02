package wriitenAssignment2;

import java.io.File;

public class FilePathExample {

	public static void main(String[] args) {
		
		//absolute path
		File absoluteFile=new File("D://textfile1.txt");
		System.out.println("Absolute Path:"+absoluteFile.getAbsolutePath());
		
		//relative path
		File relativeFile=new File("textfile1.txt");
		System.out.println("Relative Path:"+relativeFile.getAbsolutePath());

	}

}
