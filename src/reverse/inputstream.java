package reverse;
import java.io.FileInputStream;
public class inputstream {

	public static void main(String[] args)
	{
		try{
			FileInputStream fin = new FileInputStream("C:\\Users\\avish\\OneDrive\\Documents\\myself.txt");
			int i ;
			while((i = fin.read())!=-1)
			{
			System.out.print((char)i);
			}
			fin.close();
			
		   }
		catch(Exception e) {System.out.println(e);}
	}
}
