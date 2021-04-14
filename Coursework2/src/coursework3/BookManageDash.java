
package coursework3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class BookManageDash {
    public static void main(String[] args) {
        Dash log = new Dash();
    }
}


class Dash {
    Dash() {
        JFrame f=new JFrame("Dashboard");
        JButton btnAdd,btnView,btnViewS;
        JLabel lZean;
                  
                
        btnAdd = new JButton("Add books");
        f.add(btnAdd);
        btnAdd.setBounds(200,150,150,50); 
        btnView = new JButton("View Available Books");
        f.add(btnView);
        btnView.setBounds(200,250,170,50); 
        
        btnViewS = new JButton("View Sold Books");
        f.add(btnViewS);
        btnViewS.setBounds(200,350,150,50); 
        
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new bookSt();
                f.dispose();
                
            }
        });
        btnView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new View();
                f.dispose();
                
            }
        });
        
        btnViewS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SoldBooks();
                f.dispose();
                
            }
        });
        
        
        ImageIcon background_image=new ImageIcon("C:\\Users\\Latitude\\eclipse-workspace\\Coursework2\\src\\coursework3\\aurora.jpg");
        
        Image img=background_image.getImage();
        Image temp_img=img.getScaledInstance(1500,800, Image.SCALE_SMOOTH);
        background_image=new ImageIcon(temp_img);
        JLabel background=new JLabel("", background_image,JLabel.CENTER);
        f.add(background);
       
        JLabel jreg=new JLabel("Book Store");
        background.add(jreg);
        jreg.setBounds(200, 50, 1500, 70);
        jreg.setFont(new Font("Serif",Font.BOLD, 60));
        jreg.setForeground(Color.white);
       
       
        background.setBounds(0, 0, 1500, 800);
        
        
        
        f.setLayout(null);
        f.setSize(600,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);  
    }
}

