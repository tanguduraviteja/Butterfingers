import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login  {
		public Login() {
			JFrame f=new JFrame("Login");
			JLabel title=new JLabel("XYZ Hospital");
			JLabel l1=new JLabel("Username :");
			JLabel l2=new JLabel("Password :");
			JLabel l3=new JLabel("Role :");
			JTextField tf1=new JTextField();
			JPasswordField pf=new JPasswordField();
			String []roles = {"Doctor","Receptionist","Admin"};
			JComboBox jb=new JComboBox(roles);
			JButton b1=new JButton("Login");
			JButton b2 = new JButton("Exit");
			title.setBounds(100,10,150,30);
	        title.setFont(new Font("Verdana", Font.BOLD, 18));
			title.setForeground(Color.RED);
			l1.setBounds(40,50,100,30);
			l1.setForeground(Color.blue);
			l2.setBounds(40,90,100,30);
			l2.setForeground(Color.blue);
			l3.setBounds(40,130,100,30);
			l3.setForeground(Color.blue);
			tf1.setBounds(150,50,150,30);
			pf.setBounds(150,90,150,30);
			jb.setBounds(150,130,150,30);
			b1.setBounds(70,170,100,30);
			b2.setBounds(175,170,100,30);
			f.setBounds(500,350,500,250);
			f.setLayout(null);
			f.setVisible(true);
			f.add(title);
			f.add(l1);
			f.add(l2);
			f.add(l3);
			f.add(tf1);
			f.add(pf);
			f.add(jb);
			f.add(b1);
			f.add(b2);
			b1.setBackground(Color.green);
			b2.setBackground(Color.red);
			b2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					f.setVisible(false);
		    }  
			});
		}
	
}
