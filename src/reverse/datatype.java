package reverse;


	import java.util.*;
	import java.io.*;

public class datatype{

	    public static void main(String []argh)
	    {



	        Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                
	                if(x==(byte)x)System.out.println("* Byte");
	                if(x==(short)x)System.out.println("* short");
	                if(x==(int)x)System.out.println("* int");
	                if(x==(long)x)System.out.println("* long");
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }
	        
	        }
	        sc.close();
	    }
	}


