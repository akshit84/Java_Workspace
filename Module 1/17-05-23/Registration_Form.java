package ExOf_17_05;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Registration_Form implements ActionListener
{
	
	JFrame frame;
	JLabel title,name,gender,mob,email,pass,repass;
	JTextField tname,tmob,temail;
	JPasswordField p1,p2;
	JButton register;
	
	public Registration_Form() 
	{
		frame =new JFrame("Student Register Form");
		
		title =new JLabel("Register a new Student");
		title.setFont(new Font(null,Font.BOLD , 20));
		title.setBounds(60, 10, 245, 28);
		
		name =new JLabel("Name");
		name.setBounds(60, 70, 50, 25);
		tname = new JTextField();
		tname.setBounds(145, 70, 200, 30);
		
		email =new JLabel("Email id");
		email.setBounds(60, 110, 50, 25);
		temail = new JTextField();
		temail.setBounds(145, 110, 200, 30);
		
		mob =new JLabel("Mobile No");
		mob.setBounds(60, 160, 70, 25);
		tmob = new JTextField();
		tmob.setBounds(145, 160, 200, 30);
		
		pass =new JLabel("Password");
		pass.setBounds(60, 210, 80, 25);
		p1 = new JPasswordField();
		p1.setBounds(145, 210, 200, 30);
		
		repass =new JLabel("Re Password");
		repass.setBounds(60, 260, 100, 25);
		p2 = new JPasswordField();
		p2.setBounds(145, 260, 200, 30);
		
		register = new JButton("Register");
		register.setBounds(145, 310, 200, 30);
		register.addActionListener(this);
		
		
		
		frame.add(title);
		frame.add(name);
		frame.add(tname);
		frame.add(email);
		frame.add(temail);
		frame.add(mob);
		frame.add(tmob);
		frame.add(pass);
		frame.add(p1);
		frame.add(repass);
		frame.add(p2);
		frame.add(register);
		frame.setSize(700, 800);
		frame.setLayout(null);
		frame.setVisible(true);

				
	}
	

	public static void main(String[] args) 
	{
		new Registration_Form();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==register)
		{
			String myname ="\n Name is :-";
			String myemail = "\n Email id is :-";
			String mymob = "\n Mobile no is :-";
			String mypass = "\n Password id :-";
		
			String sname = tname.getText().toString();
			String semail = temail.getText().toString();
			String smob = tmob.getText().toString();
			String spass = p1.getText().toString();
			String srepass = p2.getText().toString();
			
			if(spass.equals(srepass))
			{
				try 
				{
					FileOutputStream fout =  new FileOutputStream("E://Registration Form.txt");
					
					fout.write(myname.getBytes());
					fout.write(sname.getBytes());
					fout.write(myemail.getBytes());
					fout.write(semail.getBytes());
					fout.write(mymob.getBytes());
					fout.write(smob.getBytes());
					fout.write(mypass.getBytes());
					fout.write(spass.getBytes());
					fout.close();
					
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				JOptionPane.showMessageDialog(frame, "Your Registration is done");
				frame.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(frame, "Sorry! Password and Repassword dosen't match");
				frame.dispose();
			}
		}
		
		
	}

}
