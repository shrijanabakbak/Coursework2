package coursework3;


import java.awt.Color; 
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
public class Home {
    public static void main(String[] args) {
        Login log = new Login();        
    }
}
class Login {
	ConnectionC db= new ConnectionC();
    Login() {
        JFrame f = new JFrame("Library");
        JLabel lUser, lpsw,lhead,lneed;
        JTextField tfUser;
        JPasswordField tfpsw;
        JButton btnLogin,btnSignUp;
        
        //user label
        lUser = new JLabel("Username");
        f.add(lUser);
        lUser.setBounds(125, 115, 100, 100);
        lUser.setForeground(Color.white);
        
        lpsw = new JLabel("Password");
        f.add(lpsw);
        lpsw.setBounds(125, 165, 100, 100);
        lpsw.setForeground(Color.white);
        
       
        lneed = new JLabel("Don't Have An Account?");
        f.add(lneed);
        lneed.setBounds(50, 340, 150, 150);
        lneed.setForeground(Color.white);
        
        
        tfUser = new JTextField(30);
        f.add(tfUser);
        tfUser.setBounds(200, 150,200,30);
        
        
        tfpsw = new JPasswordField(30);
        f.add(tfpsw);
        tfpsw.setBounds(200, 200,200,30);
        
        
        btnLogin = new JButton("Login");
        f.add(btnLogin);
        btnLogin.setBounds(250,310,100,40);
        
        
        btnSignUp = new JButton("SignUp");
        f.add(btnSignUp);
        btnSignUp.setBounds(250,400,100,40);
        
        
        btnLogin.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {            	
                String user = tfUser.getText();
                String psw = tfpsw.getText();
                int value=userLogin(user,psw);
                
            	
               
					if (value==1) {
						new Dash();
						f.dispose();
					}else if (value==2){
						JOptionPane.showMessageDialog(f, "Password Not Matched ");
						
					}else {
						JOptionPane.showMessageDialog(f, "Username/Password Not Valid ");
					}
           
                
            
            }
            
        });
        
        btnSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Reg();
                f.dispose();
                
            }
        });
        
        
        ImageIcon background_image=new ImageIcon("C:\\Users\\Latitude\\eclipse-workspace\\Coursework2\\src\\coursework3\\lav.jpg");
        
        Image img=background_image.getImage();
        Image temp_img=img.getScaledInstance(1500,800, Image.SCALE_SMOOTH);
        background_image=new ImageIcon(temp_img);
        JLabel background=new JLabel("", background_image,JLabel.CENTER);
        f.add(background);
       
        JLabel jreg=new JLabel(" Book Store Login ");
        background.add(jreg);                                                                           
        jreg.setBounds(50, 50, 1500, 70);
        jreg.setFont(new Font("Serif",Font.BOLD, 60));
        jreg.setForeground(Color.white);
       
       
        background.setBounds(0, 0, 1500, 800);
        
        
        
        
        
        f.setLayout(null);
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    
    public int userLogin(String username, String psw) {
    	String query="Select * from signup where user='"+username+"'";
    	
        try {
			ResultSet result=  db.connection().executeQuery(query);
	 		
			
			
		
			if (result.next() && result.getString(4).equals(psw)) {
				return 1;
			}else if (!result.getString(4).equals(psw)){
				return 2;
				
			}
	
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return 0;
    	
    }
    
    
}




