package work11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileCopy {
 
	public static void main(String[] args) {
		String in = "/Users/chnyl/eclipse-workspace/homework/src/work11/input.txt";
		String out = "/Users/chnyl/eclipse-workspace/homework/src/work11/output.txt";
		System.out.println("starting copy...");
		copy(in, out);
		System.out.println("copy success!");
	}
	
	private static void copy(String src,String target) {
		
		try {
			FileInputStream in = new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(target);
//			BufferedReader inf = new BufferedReader(new FileReader(in));
			byte[] bytes = new byte[1024];
			int len = -1;
			while((len = in.read(bytes))!=-1) {
				out.write(bytes,0,len);
			}
//			String name = "Python";
//			String str;
//			while((str = inf.readLine()) != null) {
//				String s[] = str.split(" ");
//				String ss = s[0];
//				if(name.equals(ss)) {
//					System.out.println("failed");
//				}
//				else{
//					System.out.println(ss);
//				}
//			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				if(in != null) in.close();
//				if(out != null) out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
 
}