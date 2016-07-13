import java.io.*;
class Example2
{
	public static void main(String []args)
		{
	 try
	 {
		RandomAccessFile f=new RandomAccessFile("a.txt","rw");
		f.writeBytes("Zhang si ming");
		f.close();
	 }
	 catch (IOException e)
	 {
        System.out.println(e);
	 }
	}
}