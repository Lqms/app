
package app;

import TestActions.*;

import javax.swing.*;  // импорт свинг
import java.awt.*;  // импорт пакетов awt

import java.awt.event.ActionListener;




public class App {

  
    public static void main(String[] args) {
       
    }
 
    public class MainFormAppearance {
        public JPanel createContentPane (){
            
           // создается панель, на которой размещаются остальные компоненты
            JPanel totalGUI = new JPanel (); // создаем поверхность
            totalGUI.setLayout (null);
            
            //Создаем надпись синего цвета
            JLabel blueLabel = new JLabel("надпись");
            blueLabel.setLocation(10, 10); /* надпись синего цвета*/
            blueLabel.setSize(300, 100); // размер области надписи
            blueLabel.setHorizontalAlignment(0);
            
        }
    }
    
    
    
}
