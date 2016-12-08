import java.io.*;
public class test{
	public static void main(String[] args){
		File file = new File(".");
		File[] fileName = file.listFiles();
		for(File name:fileName){
			System.out.println(name.getName() + "     "  + name.length());
		}
	}
}
