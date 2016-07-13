import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Win extends JFrame implements ActionListener
{
	FileReader r_file;
	FileWriter w_file;
	BufferedReader  buf_reader;
	BufferedWriter  buf_writer;
	JTextArea txt;
	JButton btn1,btn2;
	JPanel p;
	Win()
    {
		setSize(200,200);
		setVisible(true);
		txt=new JTextArea(10,10);
		btn1=new JButton("Read");
		btn2=new JButton("Writer");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		p=new JPanel();
		add(txt,"Center");
		add(p,"South");
		p.setLayout(new FlowLayout());
		p.add(btn1);
		p.add(btn2);
		validate();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==btn1)
		   {
		   readFile();

	    }
	   if(e.getSource()==btn2)
		   {
		   writeFile();
		   }
	}
	public void readFile()
		{
	  String s;
	  try
	  {
		File f=new File("D:/javatest/","example.txt");
		r_file=new FileReader(f);
         buf_reader=new BufferedReader(r_file);

	  }
	  catch (IOException e)
	  {
		  System.out.println(e);
	  }
	  try
	  {
		while ((s=buf_reader.readLine())!=null)
		{
			txt.append(s+'\n');
		}
	  }
	  catch (IOException e)
	  {
		  System.out.println(e);
	  }

	}

	public void writeFile()
		{
	 
        try
        {
			w_file=new FileWriter("b.txt");
	 buf_writer=new BufferedWriter(w_file);
	 String str=txt.getText();
	 buf_writer.write(str,0,str.length());
	 buf_writer.flush();
        }
        catch (IOException e)
        {
         System.out.println(e);
        }
		
	}
	
}
public  class Example1
		{
			public static void main (String []args)
				{
			   Win w=new Win();
			}
		}