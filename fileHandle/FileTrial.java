package fileHandle;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTrial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Drive  Name :");
		String drive=sc.next();
		System.out.println("Enter Folder name : ");
		String folder=sc.nextLine();
		System.out.println("Enter File Name with extension : ");
		String filename=sc.nextLine();
		System.out.println("Enter location where to save the file : ");
		String saveloc=sc.nextLine();
		File f=new File(drive+":\\"+folder+"\\"+filename);
		File f2=new File(saveloc);
		try
		{
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos =new FileOutputStream(f2);
			int k=0;
			while((k=fis.read())!=-1)
			{
				System.out.print((char)k);
				fos.write(k);
			}
			fis.close();
			fos.close();
		}
		catch(Exception e){}
		
	}
}
