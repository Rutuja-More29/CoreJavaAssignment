package wriitenAssignment2;

import java.io.File;

public class DirectoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directoryname="myDirectory";
		File directory=new File(directoryname);
		
		if(directory.exists()) {
			System.out.println("directory already exists");
		}
		else
		{
			boolean success =directory.mkdir();
			if(success) {
				System.out.println("Directory created successfully");
			}
			else
			{
				System.out.println(" failed to created directory");
			}
		}

	}

}
