import java.io.*;
public class Example10_3{
	public static void main(String[] args){
		try{
			Runtime ce = Runtime.getRuntime();
			File file = new File("C:/windows","Notepad.exe");
			ce.exec(file.getAbsolutePath());
			}
		catch(Exception e){}
	}
}
