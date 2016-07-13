import java.io.*;
import javax.swing.JOptionPane;
class FileRw
{
	byte[]buffer=new byte[6550];
	String dirIn="D:/javatest/home_sleep_tip.png";
	String dirOut="D:/javatest/copy/b.png";
	FileInputStream fis;
	FileOutputStream fos;
	int bytes;
	public void taking()
	{
		try
		{
			fis=new FileInputStream(dirIn);
			bytes=fis.read(buffer);

		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

	}
	public void loading()
		{
		try
		{
			fos=new FileOutputStream(dirOut);
        fos.write(buffer,0,bytes);
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		
	}
	FileRw()
		{
		taking();
		loading();
		JOptionPane.showMessageDialog(null,"¸´ÖÆÍê±Ï£¡");
	}
}
class ExampleCopyPhoto
{
	public static  void main(String args[])
		{
		new FileRw();
	}
}