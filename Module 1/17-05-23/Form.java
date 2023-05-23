package ExOf_17_05;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Form implements ActionListener
{
	JFrame frame;
	JLabel l,l1,l2,l3,l4,l5,l6,lr1;
	JTextField t1,t2,t3;
	JPasswordField p1,p2;
	JButton b1;
	JRadioButton r1,r2;
	
	
	public Form() 
	{
		ButtonGroup bg = new ButtonGroup();
		
		frame = new JFrame("Student Registration Form");
		
		
		
		l = new JLabel("Register A New Student");
		l.setBounds(50, 20, 300, 35);
		l.setFont(new Font(null, Font.BOLD, 20));
		frame.add(l);
		
		l1 = new JLabel("Name");
		l1.setBounds(50, 100, 100, 20);
		t1 =new JTextField();
		t1.setBounds(140, 100, 200, 30);
		frame.add(l1);
		frame.add(t1);
		
		lr1 = new JLabel("Gender");
		lr1.setBounds(50, 145, 100, 20);
		r1 = new JRadioButton("Male");
		r1.setBounds(140, 145, 80, 20);
		r2 = new JRadioButton("Female");
		r2.setBounds(220, 145, 90, 20);
		frame.add(r1);bg.add(r1);
		frame.add(r2);bg.add(r2);
		frame.add(lr1);
		
		l2 = new JLabel("Mail Id");
		l2.setBounds(50, 190, 100, 20);
		t2 =new JTextField();
		t2.setBounds(140, 190, 200, 30);
		frame.add(l2);
		frame.add(t2);
		
		l3 = new JLabel("Mobile No");
		l3.setBounds(50, 235, 100, 20);
		t3 =new JTextField();
		t3.setBounds(140, 235, 200, 30);
		frame.add(l3);
		frame.add(t3);
		
		l4 = new JLabel("Password");
		l4.setBounds(50, 280, 100, 20);
		p1 =new JPasswordField();
		p1.setBounds(140, 280, 200, 30);
		frame.add(l4);
		frame.add(p1);
		
		l5 = new JLabel("Re Password");
		l5.setBounds(50, 325, 100, 20);
		p2 =new JPasswordField();
		p2.setBounds(140, 325, 200, 30);
		frame.add(l5);
		frame.add(p2);
		
		
		b1 =new JButton("Register");
		b1.setBounds(140, 370, 200, 30);
		frame.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String s1=t1.getText().toString();
				String s2=r1.getText().toString();
				String s3=t2.getText().toString();
				String s4=t3.getText().toString();
				String sp1 = p1.getText().toString();
				String sp2 =p2.getText().toString();
			
				//String s5=r2.getText();
				
				if(sp1.equals(sp2))
				{
					try 
					{
						FileWriter f =new FileWriter("E:\\Form Data.txt",true);
						
						f.write("Name :- " + s1 + "\n");
						f.write("Gender :-" + s2 + "\n");
						f.write("Mail id :-" + s3 + "\n");
						f.write("Phone number :-" + s4 + "\n");
						//f.write(s5);
						f.close();
					} 
					catch (IOException e1) 
					{
						
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(frame, "Your registration is done.");
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Password and Repassword doesn't match.");
					frame.dispose();
				}
				
				
			}
		});
	
		frame.setSize(700,900);
		frame.setLayout(null);
		frame.setVisible(true);
	
		
	}
	public static void main(String[] args) 
	{
		new Form();
		
		//Form form =new Form();
		
		//System.out.println(form.sp1);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
