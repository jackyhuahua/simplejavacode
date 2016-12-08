import java.io.*;
public class Example10_6{
	public static void main(String[] args){
		File sourceFile = new File("a.txt");
		File targetFile = new File("b.txt");
		char[] a = new char[19];
		try{
			Writer out = new FileWriter(targetFile,true);
			Reader in = new FileReader(sourceFile);
			int n = -1;
			while((n = in.read(a)) != -1){
				out.write(a,0,n);
			}
			out.flush();
			out.close();
		}catch (Exception e){}
	}
}
