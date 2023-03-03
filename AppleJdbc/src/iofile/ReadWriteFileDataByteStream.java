package iofile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFileDataByteStream {
	void readFileData(String name) {
		try {
			FileInputStream fis=new FileInputStream(name);
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void writeFiledata(String name) {
		try {
			FileOutputStream fos=new FileOutputStream(name,true);
			String s="advance java session";
			fos.write(System.lineSeparator().getBytes());
			for(int i=0;i<s.length();i++) {
				int x=s.charAt(i);
				fos.write(x);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n done");
	}

	public static void main(String[] args) {
		
		String filename="D://textfile1.txt";
		
		ReadWriteFileDataByteStream fs=new  ReadWriteFileDataByteStream();
		 fs.readFileData(filename);
		 
		 fs.writeFiledata(filename);

	}

}
