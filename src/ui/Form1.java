/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.User;

/**
 *
 * @author Breeze
 */
public class Form1 extends javax.swing.JPanel {

    /**
     * Creates new form Form
     */
    private JPanel bottomPanel;

    public Form1(JPanel inputPanel) {
        initComponents();
        this.bottomPanel = inputPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Upload_button = new javax.swing.JButton();
        Upload_image_field = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        patientTypeDropBox = new javax.swing.JComboBox<>();
        patientType = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageField = new javax.swing.JTextArea();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        uploadImageField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        None = new javax.swing.JRadioButton();
        ageErrorField = new javax.swing.JLabel();
        lastNameErrorField = new javax.swing.JLabel();
        firstNameErrorField = new javax.swing.JLabel();
        emailErrorField = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        Upload_button.setText("Upload");
        Upload_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upload_buttonActionPerformed(evt);
            }
        });

        Upload_image_field.setText("image path");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Patient Registration");

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        ageLabel.setText("Age");

        emailLabel.setText("Email");

        messageLabel.setText("Message");

        patientTypeDropBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Guest" }));

        patientType.setText("Patient Type");

        messageField.setColumns(20);
        messageField.setRows(5);
        jScrollPane1.setViewportView(messageField);

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyTyped(evt);
            }
        });

        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyReleased(evt);
            }
        });

        ageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageFieldKeyReleased(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailFieldKeyReleased(evt);
            }
        });

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        uploadImageField.setText("image path");

        submitButton.setBackground(new java.awt.Color(153, 153, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        genderLabel.setText("Gender");

        buttonGroup1.add(Male);
        Male.setText("Male");

        buttonGroup1.add(Female);
        Female.setText("Female");

        buttonGroup1.add(None);
        None.setText("Prefer not to say");
        None.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoneActionPerformed(evt);
            }
        });

        ageErrorField.setForeground(new java.awt.Color(255, 51, 51));

        lastNameErrorField.setForeground(new java.awt.Color(255, 51, 51));

        firstNameErrorField.setForeground(new java.awt.Color(255, 51, 51));

        emailErrorField.setForeground(new java.awt.Color(255, 51, 51));

        jLabel2.setText("DATE OF BIRTH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(genderLabel)
                            .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientType)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(uploadImageField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Male)
                                    .addGap(31, 31, 31)
                                    .addComponent(Female))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lastNameErrorField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(ageErrorField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstNameErrorField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(309, 309, 309))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(None)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(emailErrorField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(uploadButton)
                                    .addComponent(patientTypeDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(lastNameLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(Male)
                            .addComponent(Female)
                            .addComponent(None)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageLabel)
                            .addComponent(ageErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(emailErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientTypeDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientType))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uploadImageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadButton))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void Upload_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upload_buttonActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        Upload_image_field.setText(filename);
//        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(filename);
//        int a = JOptionPane.showConfirmDialog(this, "Is this the same image?", "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
    }//GEN-LAST:event_Upload_buttonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:

//        filename = f.getAbsolutePath();
//        Upload_image_field.setText(filename);
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGE", "png", "jpg", "jpeg");
        chooser.addChoosableFileFilter(fnef);
        int showOpenDialogue = chooser.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = chooser.getSelectedFile();
            filename = selectedImageFile.getAbsolutePath();
            uploadImageField.setText(filename);

        }


    }//GEN-LAST:event_uploadButtonActionPerformed

    private void firstNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyPressed
        // TODO add your handling code here:      
    }//GEN-LAST:event_firstNameFieldKeyPressed

    private void firstNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume(); // Consume the event, preventing the character from being typed
        }
    }//GEN-LAST:event_firstNameFieldKeyTyped

    private void NoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoneActionPerformed

    private void firstNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{1,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(firstNameField.getText());
        if (!match.matches()) {
            firstNameErrorField.setText("First name is Invalid");
        } else {
            firstNameErrorField.setText(null);
        }
    }//GEN-LAST:event_firstNameFieldKeyReleased

    private void lastNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{1,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(lastNameField.getText());
        if (!match.matches()) {
            lastNameErrorField.setText("Last name is Invalid");
        } else {
            lastNameErrorField.setText(null);
        }
    }//GEN-LAST:event_lastNameFieldKeyReleased

    private void ageFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || Character.isISOControl(c)) {
            ageField.setEditable(true);
        } else {
            ageField.setEditable(false);
        }
    }//GEN-LAST:event_ageFieldKeyPressed

    private void ageFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^(1[0-1][0-9]|[1-9][0-9]|[1-9])$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(ageField.getText());
        if (!match.matches()) {
            ageErrorField.setText("Age is Invalid");
        } else {
            ageErrorField.setText(null);
        }
    }//GEN-LAST:event_ageFieldKeyReleased

    private void emailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(emailField.getText());
        if (!match.matches()) {
            emailErrorField.setText("Email is invalid");
        } else {
            emailErrorField.setText(null);
        }
    }//GEN-LAST:event_emailFieldKeyReleased

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
//
//        User newUser = new User();
//        newUser.setFirstname(firstNameField.getText());
//        newUser.setLastname(lastNameField.getText());
//        newUser.setAge(ageField.getText());
//        newUser.setEmail(emailField.getText());
//        newUser.setType(patientTypeDropBox.getSelectedItem().toString());
//        newUser.setMessage(messageField.getText());
//        newUser.setfilename(filename);
////        Date date = jDateChooser1.getDate();
////        String strDate = DateFormat.getDateInstance().format(date);
////        newUser.setDate(strDate);
//
//        if (Male.isSelected() == true) {
//            newUser.setGender("Male");
//        } else if (Female.isSelected() == true) {
//            newUser.setGender("Female");
//        } else {
//            newUser.setGender("Prefer not to say");
//        }

//        ViewPanel newViewPanel = new ViewPanel(newUser);
//        bottomPanel.add(newViewPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);

    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JRadioButton None;
    private javax.swing.JButton Upload_button;
    private javax.swing.JTextField Upload_image_field;
    private javax.swing.JLabel ageErrorField;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JLabel emailErrorField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel firstNameErrorField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameErrorField;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextArea messageField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel patientType;
    private javax.swing.JComboBox<String> patientTypeDropBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    private javax.swing.JTextField uploadImageField;
    // End of variables declaration//GEN-END:variables
        String filename;
}
