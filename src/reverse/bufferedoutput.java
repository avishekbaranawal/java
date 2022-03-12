package reverse;
import java.io.*;
public class bufferedoutput {
  
	public static void main(String argm[])throws Exception
	{
		FileOutputStream fout = new FileOutputStream("C:\\Users\\avish\\OneDrive\\Documents\\myself.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "llo";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
	}
}
