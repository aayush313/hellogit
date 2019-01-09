import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Temp5 implements ActionListener
{	    JFrame jf;
		JTextField tf;
		JButton jb;
		JTextArea ta;
		Temp5()
		{
			jf=new JFrame();
			jf.setLayout(new FlowLayout());
			jf.add(tf=new JTextField(40));
			jf.add(jb=new JButton("Enter Class Name!!"));
			JScrollPane jsp=new JScrollPane(ta=new JTextArea(25,35));
			jf.add(jsp);
			
			
			
			jf.setSize(500, 500); jf.setVisible(true);
			jf.setLocationRelativeTo(null);
			jb.addActionListener(this);
			tf.addActionListener(this);
		}
		public static void main(String[] args) throws Exception 
		{
			new Temp5();	
		}
			@Override
			public void actionPerformed(ActionEvent ae) 
			{
							if(ae.getSource()==jb)
							{
								
							}
							if(ae.getSource()==tf)
							{
								try {
									Class c=Class.forName(tf.getText());
									
									Constructor con[]=c.getDeclaredConstructors();
									
									for(int i=0;i<con.length;i++)
									{
										ta.append(""+con[i]+"\n");
									}
								} catch (ClassNotFoundException e) {}
							}
			}
		
}
