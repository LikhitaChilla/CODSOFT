import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class User extends JFrame {
    JButton button;
    User(){
        this.setSize(1000,1000);
        this.setVisible(true);
        button=new JButton();
        button.setText("hello");
        this.setLayout(null);
        button.setBounds(0,0,120,120);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("hello");
            }
        });
        this.add(button);
        this.setVisible(true);
    }
}
public class Student_management{
    public static void main(String args[]){
        new User();
    }
}