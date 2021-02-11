package com.ashish.SIS.GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        Toolkit thekit = getToolkit();
        Dimension dim = thekit.getScreenSize();
        setSize(dim);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        filemenu = new javax.swing.JMenu();
        chnageMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        addUserMenuItem = new javax.swing.JMenuItem();
        addStudentMenuItem = new javax.swing.JMenuItem();
        searchuserMenuItem = new javax.swing.JMenuItem();
        searchStudentMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        filemenu.setText("File");

        chnageMenuItem.setText("Change Username and Password");
        chnageMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chnageMenuItemActionPerformed(evt);
            }
        });
        filemenu.add(chnageMenuItem);

        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        filemenu.add(logoutMenuItem);

        jMenuBar1.add(filemenu);

        editMenu.setText("Edit");

        addUserMenuItem.setText("Add User");
        addUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(addUserMenuItem);

        addStudentMenuItem.setText("Add Student");
        addStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(addStudentMenuItem);

        searchuserMenuItem.setText("Search User");
        searchuserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchuserMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(searchuserMenuItem);

        searchStudentMenuItem.setText("Search Student");
        searchStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(searchStudentMenuItem);
        editMenu.add(jSeparator1);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(exitMenuItem);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchuserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchuserMenuItemActionPerformed
        // TODO add your handling code here:
        setContentPane(new userSearch());
        revalidate();
    }//GEN-LAST:event_searchuserMenuItemActionPerformed

    private void searchStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentMenuItemActionPerformed
        // TODO add your handling code here:
        setContentPane(new StudentSearc());
        revalidate();
    }//GEN-LAST:event_searchStudentMenuItemActionPerformed

    private void addUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserMenuItemActionPerformed
        // TODO add your handling code here:
        setContentPane(new AddUser());
        revalidate();
    }//GEN-LAST:event_addUserMenuItemActionPerformed

    private void addStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentMenuItemActionPerformed
        // TODO add your handling code here:
        setContentPane(new AddStudent());
        revalidate();
    }//GEN-LAST:event_addStudentMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        // TODO add your handling code here:
        int dialogBttn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(
                null, "Are you sure", "Warning", dialogBttn);
        if (dialogResult == JOptionPane.YES_OPTION) {
            setVisible(false);
            new LoginDialog();
        }
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void chnageMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chnageMenuItemActionPerformed
        // TODO add your handling code here:
        new ChangeUsernameAndPassword();
    }//GEN-LAST:event_chnageMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addStudentMenuItem;
    private javax.swing.JMenuItem addUserMenuItem;
    private javax.swing.JMenuItem chnageMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu filemenu;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuItem searchStudentMenuItem;
    private javax.swing.JMenuItem searchuserMenuItem;
    // End of variables declaration//GEN-END:variables
}
