import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RandWin extends JFrame implements ActionListener
{
	File file=new File("Ӣ��С�ʵ�.txt");
	JButton writeBtn=new JButton("¼��");
	JButton viewBtn=new JButton("��ʾ");
	JTextField word=new JTextField(8);
	JTextField note=new JTextField(8);
	JTextArea txt=new JTextArea(5,30);
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();

	RandWin()
	{
		setTitle("Ӣ��С�ʵ�");
		setVisible(true);
		setBounds(100,50,400,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(p1,"North");
		p1.setBackground(Color.cyan);
		p1.add(new JLabel("���뵥��"));
		p1.add(word);
		p1.add(new JLabel("�������"));
		p1.add(note);
		p1.add(writeBtn);
		writeBtn.addActionListener(this);

		add(p2,"Center");
		p2.add(viewBtn);
		p2.add(txt);
		viewBtn.addActionListener(this);
		validate();
	}

	public void actionPerformed(ActionEvent e)
	{
	  if (e.getSource()==writeBtn)
	  {
		  inputWord();
	  }
	  if (e.getSource()==viewBtn)
	  {
		  viewWord();
	  }
	}
	public void viewWord()
	{
	  int number=1;
	  try
	  {
		RandomAccessFile infile=new RandomAccessFile(file,"r");
		String ����=null;
		while ((����=infile.readUTF())!=null)
		{
			txt.append("\n"+number+" "+����);
            txt.append("  "+infile.readUTF());
			txt.append("\n-----------------------------------");
			number++;
		}
		infile.close();
	  }
	  catch (Exception e)
	  {
		  System.out.println(e);
	  }
	}
	public void inputWord()
		
	{
		try
		{
			RandomAccessFile outfile=new RandomAccessFile(file,"rw");
			if (file.exists())
			{
				long length=file.length();
				outfile.seek(length);
			}
			outfile.writeUTF("���ʣ�"+word.getText());
			outfile.writeUTF("���ͣ�"+note.getText());
			outfile.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
public class Example3
{
	public static void main(String args[])
	{
		new RandWin();

	}
}