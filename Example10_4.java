import java.io.*;
public class Example10_4{
	public static void main(String[] args){
		int n = -1;
		byte[] b = new byte[100];
		try{
			File file = new File("Example10_4.java");
			FileInputStream in = new FileInputStream(file);
			while((n = in.read(b)) != -1){
				String str = new String(b,0,n);
				System.out.println(str);
			}
		in.close();
		}
		catch (Exception e){}
	}
}
