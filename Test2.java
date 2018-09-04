package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author dadaya
 */
public class Test2 extends javax.swing.JFrame {
    JTextField field;
    JPasswordField field2;
    
    public Test2(String str) {
        avper (str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
            JLabel label = new JLabel ("My Label");
            label.setToolTipText("Label test");
            label.setText("Text");
            c.add (label);
            
            
            field1 = new JLabelField("Text");
            c.add (field1);
          
            field2 = new JPasswordField ("Hidden text");
            c.add (field2);
            
            setSize(400,150);
            setVisible (true);
            
       FieldHandler handler = new FieldHandler ();
       field1.addActionListener (handler);
       field2.addActionListener (handler);
       
            
                      
    }
    
    
    
}
