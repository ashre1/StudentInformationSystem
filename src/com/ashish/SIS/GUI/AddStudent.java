/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashish.SIS.GUI;

import com.ashish.SIS.DAO.StudentDAO;
import coml.ashish.SIS.DTO.StudentDTO;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JPanel {

    ButtonGroup grp;
    String gender;
    String semester;

    public AddStudent() {
        initComponents();
        grp = new ButtonGroup();
        grp.add(maleRadio);
        grp.add(femaleRadio);
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        addBttn = new javax.swing.JButton();
        editBttn = new javax.swing.JButton();
        DeleteBttn = new javax.swing.JButton();
        clearBttn = new javax.swing.JButton();
        cancelBttn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stdIdTxt = new javax.swing.JTextField();
        firstnameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        programTxt = new javax.swing.JTextField();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        peraddressTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tempaddressTxt = new javax.swing.JTextField();
        lastnameTxt = new javax.swing.JTextField();
        mobileTxt = new javax.swing.JTextField();
        middlenameTxt = new javax.swing.JTextField();
        sectionTxt = new javax.swing.JTextField();
        semesterCombo = new javax.swing.JComboBox();

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table);

        addBttn.setText("Add");
        addBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttnActionPerformed(evt);
            }
        });

        editBttn.setText("Edit");
        editBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBttnActionPerformed(evt);
            }
        });

        DeleteBttn.setText("Delete");
        DeleteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBttnActionPerformed(evt);
            }
        });

        clearBttn.setText("Clear");
        clearBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBttnActionPerformed(evt);
            }
        });

        cancelBttn.setText("Cancel");

        jLabel14.setText("FirstName");

        jLabel15.setText("Gender");

        jLabel16.setText("Email");

        jLabel17.setText("Program");

        jLabel13.setText("StudentID");

        stdIdTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stdIdTxtFocusLost(evt);
            }
        });
        stdIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdIdTxtActionPerformed(evt);
            }
        });

        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        femaleRadio.setText("Female");
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        jLabel1.setText("Permanent Address");

        jLabel2.setText("MiddleName");

        jLabel3.setText("Temporary Address");

        jLabel4.setText("Mobile");

        jLabel5.setText("Semester");

        jLabel6.setText("LastName");

        jLabel7.setText("Section");

        tempaddressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempaddressTxtActionPerformed(evt);
            }
        });

        semesterCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","First", "Second", "Third", "Forth", "Fifth", "Sixth", "Seventh", "Eighth" }));
        semesterCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(63, 63, 63)
                                .addComponent(stdIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(maleRadio)
                                    .addGap(18, 18, 18)
                                    .addComponent(femaleRadio))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(peraddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(64, 64, 64)
                                .addComponent(firstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(programTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tempaddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(middlenameTxt)
                                                    .addComponent(semesterCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(64, 64, 64)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(sectionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel4)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(editBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56)
                                                .addComponent(DeleteBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(78, 78, 78)
                                                .addComponent(clearBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(71, 71, 71)
                                        .addComponent(cancelBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailTxt, firstnameTxt, programTxt, stdIdTxt});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {middlenameTxt, mobileTxt, tempaddressTxt});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lastnameTxt, sectionTxt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(stdIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(firstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(lastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middlenameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maleRadio)
                        .addComponent(femaleRadio)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(peraddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tempaddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(mobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel7)
                        .addComponent(sectionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(semesterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(programTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBttn)
                    .addComponent(DeleteBttn)
                    .addComponent(clearBttn)
                    .addComponent(cancelBttn)
                    .addComponent(addBttn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed
        // TODO add your handling code here:
        StudentDTO std = new StudentDTO();

        std.setStdId(Integer.parseInt(stdIdTxt.getText()));
        std.setFirstName(firstnameTxt.getText());
        std.setMiddleName(middlenameTxt.getText());
        std.setLastName(lastnameTxt.getText());
        std.setGender(gender);
        std.setPerAddress(peraddressTxt.getText());
        std.setTempAddress(tempaddressTxt.getText());
        std.setEmail(emailTxt.getText());
        std.setMobile(mobileTxt.getText());
        std.setProgram(programTxt.getText());
        std.setSemester(semester);
        std.setSection(sectionTxt.getText());

        new StudentDAO().addStudent(std);
        loadData();
        clearField();

    }//GEN-LAST:event_addBttnActionPerformed

    private void tempaddressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempaddressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempaddressTxtActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
        gender = "male";
    }//GEN-LAST:event_maleRadioActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        // TODO add your handling code here:
        gender = "female";
    }//GEN-LAST:event_femaleRadioActionPerformed

    private void DeleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBttnActionPerformed
        // TODO add your handling code here:
        StudentDAO std = new StudentDAO();
        //    if (validBttn()) {
        std.deleteStudent(String.valueOf(Table.getValueAt(
                Table.getSelectedRow(), 0)));
        loadData();
    //    } else {
        //        JOptionPane.showMessageDialog(null, "Invalid");
        //    }

    }//GEN-LAST:event_DeleteBttnActionPerformed

    private void semesterComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterComboActionPerformed
        // TODO add your handling code here:
        semester = semesterCombo.getSelectedItem().toString();
    }//GEN-LAST:event_semesterComboActionPerformed

    private void editBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBttnActionPerformed
        // TODO add your handling code here:
        //   if (validBttn()) {
        if (editBttn.getText().equalsIgnoreCase("Edit")) {
            editBttn.setText("Update");
            StudentDTO std = new StudentDAO().editStudent(Table);

            stdIdTxt.setText(String.valueOf(std.getStdId()));
            stdIdTxt.setEditable(false);
            firstnameTxt.setText(std.getFirstName());
            middlenameTxt.setText(std.getMiddleName());
            lastnameTxt.setText(std.getLastName());
            emailTxt.setText(std.getEmail());
            mobileTxt.setText(std.getMobile());
            programTxt.setText(std.getProgram());
            sectionTxt.setText(std.getSection());
            peraddressTxt.setText(std.getPerAddress());
            tempaddressTxt.setText(std.getTempAddress());
            if (std.getGender().equalsIgnoreCase("Male")) {
                maleRadio.setSelected(true);
            } else {
                femaleRadio.setSelected(true);
            }
            semesterCombo.setSelectedItem(std.getSemester());

        } else {
            editBttn.setText("Edit");
            StudentDTO std = new StudentDTO();
            std.setStdId(Integer.parseInt(stdIdTxt.getText()));
            std.setFirstName(firstnameTxt.getText());
            std.setMiddleName(middlenameTxt.getText());
            std.setLastName(lastnameTxt.getText());
            std.setPerAddress(peraddressTxt.getText());
            std.setTempAddress(tempaddressTxt.getText());
            std.setEmail(emailTxt.getText());
            std.setMobile(mobileTxt.getText());
            std.setProgram(programTxt.getText());
            std.setSection(sectionTxt.getText());
            if (maleRadio.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            std.setGender(gender);

            semester = semesterCombo.getSelectedItem().toString();
            std.setSemester(semester);

            new StudentDAO().updateStudent(std);
            stdIdTxt.setEditable(true);
            loadData();
            clearField();
        }
        //   } else {
        //      JOptionPane.showMessageDialog(null, "Invalid");
        //   }
    }//GEN-LAST:event_editBttnActionPerformed

    private void stdIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdIdTxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_stdIdTxtActionPerformed

    private void stdIdTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stdIdTxtFocusLost
        // TODO add your handling code here:
        String id = stdIdTxt.getText();

        boolean valid = new StudentDAO().checkId(id);

        if (!valid) {
            JOptionPane.showMessageDialog(null, "Duplicate id");
            stdIdTxt.setText("");
            // stdIdTxt.requestFocus();
        } else {

        }

    }//GEN-LAST:event_stdIdTxtFocusLost

    private void clearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBttnActionPerformed

    public void loadData() {
        StudentDAO std = new StudentDAO();
        try {
            Table.setModel(std.builtTableModel(std.getQueryResult()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validBttn() {
        int index = Table.getSelectedRowCount();
        if (index == 1) {
            return true;
        }
        return false;
    }

    public void clearField() {
        stdIdTxt.setText("");
        firstnameTxt.setText("");
        middlenameTxt.setText("");
        lastnameTxt.setText("");
        emailTxt.setText("");
        mobileTxt.setText("");
        peraddressTxt.setText("");
        tempaddressTxt.setText("");
        programTxt.setText("");
        sectionTxt.setText("");
        grp.clearSelection();
        semesterCombo.setSelectedItem("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBttn;
    private javax.swing.JTable Table;
    private javax.swing.JButton addBttn;
    private javax.swing.JButton cancelBttn;
    private javax.swing.JButton clearBttn;
    private javax.swing.JButton editBttn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnameTxt;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField middlenameTxt;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField peraddressTxt;
    private javax.swing.JTextField programTxt;
    private javax.swing.JTextField sectionTxt;
    private javax.swing.JComboBox semesterCombo;
    private javax.swing.JTextField stdIdTxt;
    private javax.swing.JTextField tempaddressTxt;
    // End of variables declaration//GEN-END:variables
}
