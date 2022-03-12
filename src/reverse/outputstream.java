package reverse;
import java.io.FileOutputStream;
public class outputstream {

	public static void main(String[] args)
	{
		  
	           try{    
	             FileOutputStream fout=new FileOutputStream("./relative.txt");    
	             String s = "welcome to ttworld";
	             byte b[] = s.getBytes();
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
}
