import java.io.FileInputStream;
import javax.swing.JOptionPane;
class Example
{
	//ÐÞ¸Ä
	public static void main(String args[])
	{
      byte buffer[]=new byte[1024];
	  String dir="D:/javatest/example.txt";
	   int bytes;
	  String str;
	  try{
		   FileInputStream fis=new FileInputStream(dir);
		   bytes=fis.read(buffer);
		   str=new String (buffer,0,bytes);
	  }catch(Exception e)
		  {
            str=e.toString();
	      }
		  JOptionPane.showMessageDialog(null,str);
		  System.exit(0);
	  
	 

	}
}