/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question6;

import javax.swing.JOptionPane;

/**
 * Program to capture and display student name, subject code, test1, test2 and test3 marks
 *and then calculates final mark using GUI
 *
 * @author BN Moketa (219030294)
 */
public class StudentForm extends javax.swing.JFrame
{

    Student studentObj;
    int num = 0;
    String[] subjectArray = new String[]
    {
        "ASDSY2A", "EIENP4A", "AIBAY2A", "AIWMY2A"
    };

    /**
     * Creates new form StudentForm
     */
    public StudentForm()
    {
        initComponents();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(subjectArray));

//jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(subjectArray));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnProcessStud = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtName = new javax.swing.JTextField();
        txtTest1 = new javax.swing.JTextField();
        txtTest2 = new javax.swing.JTextField();
        txtTest3 = new javax.swing.JTextField();
        btnClearInput = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Form"));

        jLabel1.setText("Student Name:");

        jLabel2.setText("Subject Code");

        jLabel3.setText("Test1");

        jLabel4.setText("Test2");

        jLabel5.setText("Test3");

        btnProcessStud.setText("Process Student");
        btnProcessStud.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProcessStudActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        txtTest1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtTest1ActionPerformed(evt);
            }
        });

        btnClearInput.setText("Clear Input");
        btnClearInput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearInputActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnProcessStud)
                        .addGap(55, 55, 55)
                        .addComponent(btnClearInput))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtTest1)
                            .addComponent(txtTest2)
                            .addComponent(txtTest3)
                            .addComponent(jComboBox1, 0, 158, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTest3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessStud)
                    .addComponent(btnClearInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTest1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtTest1ActionPerformed
    {//GEN-HEADEREND:event_txtTest1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTest1ActionPerformed

    private void btnProcessStudActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProcessStudActionPerformed
    {//GEN-HEADEREND:event_btnProcessStudActionPerformed

        try
        {
            String name = txtName.getText().trim();
            int test1 = Integer.parseInt(txtTest1.getText().trim());
            int test2 = Integer.parseInt(txtTest2.getText().trim());
            int test3 = Integer.parseInt(txtTest3.getText().trim());
            studentObj = new Student(name, "none", test1, test2, test3);

            int semMark = studentObj.calcSemesterMark(test1, test2, test3);
            if (semMark >= 50)
            {
                String examMark = JOptionPane.showInputDialog("Enter Exam Mark:");
                int exam = Integer.parseInt(examMark);
                int finalMark = studentObj.calcFinalMark(semMark, exam);
                JOptionPane.showMessageDialog(null, "Final mark is mark is: "
                        + "" + finalMark + "\nSemester mark is:" + semMark);
                String status = "";
                if (finalMark >= 75)
                {
                    status = "PD";
                }
                else if (finalMark >= 50 && exam < 40)
                {
                    status = "FM";
                }
                else if (finalMark >= 50 && finalMark < 75)
                {
                    status = "P";
                }
                else if (finalMark < 50)
                {
                    status = "F";
                }

                txtArea.append("Name" + "\tSubj code" + "\tTest1" + "\tTest2"
                        + "\tTest3" + "\tSemMark" + "\tFinalMark" + "\tStatus\n");
                txtArea.append(name + "\t" + subjectArray[num] + "\t" + test1 + "\t" + test2 + "\t"
                        + test3 + "\t" + semMark + "\t" + finalMark + "\t" + status + "\n");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry you don't qualify, "
                        + "your semester mark is: " + semMark);
            }

        }
        catch (IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_btnProcessStudActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBox1ActionPerformed
    {//GEN-HEADEREND:event_jComboBox1ActionPerformed

        if (jComboBox1.getSelectedItem().equals("ASDSY2A"))
        {
            txtName.setText("");
            txtTest1.setText("");
            txtTest2.setText("");
            txtTest3.setText("");

        }
        else if (jComboBox1.getSelectedItem().equals("EIENP4A"))
        {
            num = 1;
            txtName.setText(txtName.getName());
            txtTest1.setText("");
            txtTest2.setText("");
            txtTest3.setText("");
        }
        else if (jComboBox1.getSelectedItem().equals("AIBAY2A"))
        {
            num = 2;
            txtName.setText("");
            txtTest1.setText("");
            txtTest2.setText("");
            txtTest3.setText("");
        }
        else if (jComboBox1.getSelectedItem().equals("AIWMY2A"))
        {
            num = 3;
            txtName.setText("");
            txtTest1.setText("");
            txtTest2.setText("");
            txtTest3.setText("");
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnClearInputActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearInputActionPerformed
    {//GEN-HEADEREND:event_btnClearInputActionPerformed
        txtName.setText("");
        txtTest1.setText("");
        txtTest2.setText("");
        txtTest3.setText("");
    }//GEN-LAST:event_btnClearInputActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new StudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearInput;
    private javax.swing.JButton btnProcessStud;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTest1;
    private javax.swing.JTextField txtTest2;
    private javax.swing.JTextField txtTest3;
    // End of variables declaration//GEN-END:variables
}
