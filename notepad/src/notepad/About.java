package notepad;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener{
    
    About(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(60, 40, 400, 100);
        add(headerIcon);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(20, 200, 70, 70);
        add(icon);
        
        JLabel text = new JLabel("<html><p>Hello, My name is Nihar Walwalkar</p><br><p>I have created this Notepad Clone using pure Java.</p></html>");
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        text.setBounds(110, 85, 500, 300);
        add(text);
        
        JButton b1 = new JButton("OK");
        b1.setBounds(370, 500, 70, 35);
        b1.setFocusable(false);
        b1.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        b1.addActionListener(this);
        add(b1);
        
        setTitle("About");
        ImageIcon notepadIcon = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image logo = notepadIcon.getImage();
        setIconImage(logo);
        
        setBounds(500, 100, 500, 600);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }

}
