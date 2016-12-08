import java.io.*;
public class Example10_5{
	public static void main(String[] args){
		byte[] a = "happy new year".getBytes();
		byte[] b = "gei hong bao".getBytes();
		File file = new File("a.txt");
		try{
			OutputStream out = new FileOutputStream(file);
			System.out.println(file.getName() + " length:" + file.length() + " bytes");
			out.write(a);
			out.close();
			out = new FileOutputStream(file,true);
			System.out.println(file.getName() + " length:" + file.length() + " bytes");
			out.write(b,0,b.length);
			System.out.println(file.getName() + " length:" + file.length() + " bytes");
		        out.close();
		}catch(Exception e){}
	}
}
