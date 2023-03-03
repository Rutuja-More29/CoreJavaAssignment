package iofile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFileDataCharacterStream {

	void readFileData(String name) {
		try {
			FileReader fr=new FileReader(name);
			BufferedReader br= new BufferedReader(fr);
			String s;
			
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void writeFileData(String name) throws IOException {
		FileWriter fw=new FileWriter(name,true);
		String s="Backend developing";
		
		fw.write(System.lineSeparator());
		fw.write(s);
		fw.close();
		System.out.println("\n done");
		
	}
	void filewriter(String name) {
		try {
			// if file is not there it will create that an then it will write data to file
			FileWriter fw=new FileWriter("D://textfile2.txt",true);
			String s="backend developing/ core java";
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
		
	}
	public static void main(String[] args) throws IOException {
	
		String filename="D://textfile1.txt";
		
		ReadWriteFileDataCharacterStream obj=new ReadWriteFileDataCharacterStream();
		obj.readFileData(filename);
		obj.writeFileData(filename);
		obj.filewriter(filename);
		
	}

}
