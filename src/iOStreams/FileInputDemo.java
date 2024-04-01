package iOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Anvesh\\Desktop\\STIGENTECH\\mydata.txt");
		int ch;
		do {
			ch=fis.read();
			if(ch!=-1)
			{
				System.out.print((char)ch);
			}
		}
		while(ch!=-1);
	}
}
