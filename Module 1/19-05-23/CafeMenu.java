package ExOf_19_05;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class CafeMenu implements ActionListener,WindowListener
{
	JFrame frame,frame2;
	JLabel user,pass;
	JTextField tuser;
	JPasswordField tpass;
	JButton log;
	
	
	public CafeMenu() 
	{
		frame =new JFrame("Login Page");
		
		user =new JLabel("Username");
		user.setBounds(140, 60, 70, 20);
		tuser =new JTextField();
		tuser.setBounds(210, 60, 100, 25);
		
		pass =new JLabel("Password");
		pass.setBounds(140, 90, 70, 20);
		tpass = new JPasswordField();
		tpass.setBounds(210, 90, 100, 25);
		
		log = new JButton("login");
		log.setBounds(180, 120, 100, 25);
		log.addActionListener(this);
		
		frame.add(user);
		frame.add(tuser);
		frame.add(pass);
		frame.add(tpass);
		frame.add(log);
		
		frame.setSize(500, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
	}
	public static void main(String[] args) 
	{
		new CafeMenu();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String suser = tuser.getText().toString();
		String spass = tpass.getText().toString();
		String u="tops";
		String p="1234";
		
		JLabel menu;
		JCheckBox itm1,itm2,itm3,itm4,itm5;
		JButton ord;
		
		
		if(suser.equals(u) && spass.equals(p) )
		{
			
			frame2 = new JFrame("Akki's Cafe");
			
			menu = new JLabel("Menu");
			menu.setFont(new Font(null, Font.BOLD, 25));
			menu.setBounds(150, 35, 100, 20);
			
			itm1 =new JCheckBox("Garlic Bread @ Rs.149");
			itm1.setBounds(100, 100, 250, 20);
			
			itm2 =new JCheckBox("Pizza @ Rs.339");
			itm2.setBounds(100, 130, 250, 20);
			
			itm3 =new JCheckBox("Veg Sandwich @ Rs.179");
			itm3.setBounds(100, 160, 250, 20);
			
			itm4 =new JCheckBox("Burger @ Rs.219");
			itm4.setBounds(100, 190, 250, 20);
			
			itm5 =new JCheckBox("Cappuccino @ Rs.199");
			itm5.setBounds(100, 220, 150, 20);
			
			ord = new JButton("Orde");
			ord.setBounds(130, 250, 100, 20);
			
			ord.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					StringBuffer payble =new StringBuffer("\n      Your order is \n");
					int amount=0;
					
					if(itm1.isSelected())
					{
						payble.append("\n Garlic Bread  Rs.149");
						amount +=149;
					}
					if(itm2.isSelected())
					{
						payble.append("\n Pizza  Rs.339");
						amount +=339;
					}
					if(itm3.isSelected())
					{
						payble.append("\n Veg Sandwich  Rs.179");
						amount +=179;
					}
					if(itm4.isSelected())
					{
						payble.append("\n Burger  Rs.219");
						amount +=219;
					}
					if(itm5.isSelected())
					{
						payble.append("\n Cappuccino  Rs.199");
						amount +=199;
					}
					payble.append("\n Total amount is Rs " + amount);
					
					JOptionPane.showMessageDialog(ord, payble.toString());
					frame2.dispose();
					
				}
			});
			
			frame2.setSize(400, 700);
			frame2.setLayout(null);
			frame2.setVisible(true);
			frame2.add(menu);
			frame2.add(itm1);
			frame2.add(itm2);
			frame2.add(itm3);
			frame2.add(itm4);
			frame2.add(itm5);
			frame2.add(ord);
			frame2.addWindowListener((WindowListener) this);
			frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
		}
		else
		{
			JOptionPane.showMessageDialog(frame, "Invaild Username and Password");
		
		}
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub

		int ans=JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
		
		if(ans == JOptionPane.YES_OPTION)
		{
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(ans == JOptionPane.NO_OPTION)
		{
			
			
		}
		if(ans == JOptionPane.CLOSED_OPTION)
		{
			
		}
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}		
}


