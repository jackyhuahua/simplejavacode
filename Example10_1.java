import java.io.*;
public class Example10_1{
	public static void main(String[] args){
		//File f = new File("Example10_1.java");
		File file = new File("F:\\jacky","Example10_1.java");
		System.out.println(file.getName() + " read?:" + file.canRead());
		System.out.println(file.getName() + " length:" + file.length());
		System.out.println(file.getName() + " absolutePath:" + file.getAbsolutePath());
		File file1 = new File("new.txt");
		if(!file1.exists()){
			try{
				file1.createNewFile();
				System.out.println("creat new file:" + file1.getName());
			}catch(IOException e){}
		}
	}
}
