import java.util.*;
import java.io.*;
public class Example10_7{
	public static void main(String[] args){
		File read = new File("english.txt");
		File write = new File("englishCount.txt");
		try{
			Writer out = new FileWriter(write);
			BufferedWriter bufferedWriter = new BufferedWriter(out);
			Reader in = new FileReader(read);
			BufferedReader bufferedReader = new BufferedReader(in);
			String str = null;
			while((str = bufferedReader.readLine()) != null){
				StringTokenizer fenxi  = new StringTokenizer(str);
				int count = fenxi.countTokens();
				str = str + " words count: " + count;
				bufferedWriter.write(str);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			out.close();
			in = new FileReader(write);
			String s = null;
			System.out.println(write.getName() + " nei rong ");
			bufferedReader = new BufferedReader(in);
			while((str = bufferedReader.readLine()) != null){
				System.out.println(str);
			}
			bufferedReader.close();
			//read.close();
		}catch(Exception e){}
	}
}
