
package com.ashish.SIS.main;

import com.ashish.SIS.GUI.LoginDialog;
import javax.swing.UIManager;


public class StudentInformationSystem {

   
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        new LoginDialog();
        
        
    }
    
}
