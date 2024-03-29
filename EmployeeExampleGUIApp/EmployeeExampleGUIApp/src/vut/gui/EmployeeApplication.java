/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import vut.Employee;

/**
 * Accept an employee's data and allow processing on the employee object
 * (increases on the salary)
 *
 * @author Mrs S Ribeiro
 */
public class EmployeeApplication extends javax.swing.JFrame
{

    private Employee objEmp;

    /**
     * Creates new form EmployeeApplication
     */
    public EmployeeApplication()
    {
        initComponents();
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

        pnlAddEmployee = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        lblSaveMsg = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        pnlProcessEmp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIncrease = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        btnIncrease = new javax.swing.JButton();
        lblIncreaseMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Form -  XXXXXXX");

        pnlAddEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Employee Data"));

        jLabel1.setText("Name:");

        txtName.setColumns(20);

        jLabel2.setText("Salary:");

        txtSalary.setColumns(20);

        lblSaveMsg.setForeground(new java.awt.Color(51, 102, 255));
        lblSaveMsg.setText("Enter the data and click on the Save button");

        btnSave.setText("Save Employee");
        btnSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddEmployeeLayout = new javax.swing.GroupLayout(pnlAddEmployee);
        pnlAddEmployee.setLayout(pnlAddEmployeeLayout);
        pnlAddEmployeeLayout.setHorizontalGroup(
            pnlAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddEmployeeLayout.createSequentialGroup()
                .addGroup(pnlAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddEmployeeLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblSaveMsg))
                    .addGroup(pnlAddEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave))
                    .addGroup(pnlAddEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlAddEmployeeLayout.setVerticalGroup(
            pnlAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddEmployeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(lblSaveMsg)
                .addGap(30, 30, 30)
                .addComponent(btnSave)
                .addGap(25, 25, 25))
        );

        pnlProcessEmp.setBorder(javax.swing.BorderFactory.createTitledBorder("Process Employee"));
        pnlProcessEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Increase:");

        txtIncrease.setColumns(20);
        txtIncrease.setEnabled(false);

        jLabel6.setText("Name:");

        lblName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Salary:");

        lblSalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnIncrease.setText("Increase Salary:");
        btnIncrease.setEnabled(false);
        btnIncrease.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIncreaseActionPerformed(evt);
            }
        });

        lblIncreaseMsg.setForeground(new java.awt.Color(51, 102, 255));
        lblIncreaseMsg.setOpaque(true);

        javax.swing.GroupLayout pnlProcessEmpLayout = new javax.swing.GroupLayout(pnlProcessEmp);
        pnlProcessEmp.setLayout(pnlProcessEmpLayout);
        pnlProcessEmpLayout.setHorizontalGroup(
            pnlProcessEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcessEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProcessEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIncrease)
                    .addGroup(pnlProcessEmpLayout.createSequentialGroup()
                        .addGroup(pnlProcessEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnlProcessEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIncrease, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                    .addComponent(lblIncreaseMsg))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlProcessEmpLayout.setVerticalGroup(
            pnlProcessEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcessEmpLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlProcessEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlProcessEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(pnlProcessEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblIncreaseMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnIncrease)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnlAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlProcessEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlProcessEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveActionPerformed
    {//GEN-HEADEREND:event_btnSaveActionPerformed
        String name;
        double salary;

        name = txtName.getText();
        salary = Double.parseDouble(txtSalary.getText());

        objEmp = new Employee(name, salary);

        //display the data and enable the components:
        lblSaveMsg.setText("Saved employee successful: " + name);
        lblIncreaseMsg.setText("");
        txtIncrease.setEnabled(true);
        btnIncrease.setEnabled(true);
        txtIncrease.requestFocus();           //put the focus 
        txtName.setText("");                  //clear the text
        txtSalary.setText("");                //clear the text
        showEmployee();                       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void showEmployee()
    {
        lblName.setText(objEmp.getName());
        lblSalary.setText(String.format("%3.2f", objEmp.getSalary()));
    }
    
    private void btnIncreaseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIncreaseActionPerformed
    {//GEN-HEADEREND:event_btnIncreaseActionPerformed
        double increase;
        
        increase = Double.parseDouble(txtIncrease.getText());
        objEmp.increaseSalary(increase);
        
        txtIncrease.setText("");   //clear the text
        lblIncreaseMsg.setText("Increased successful for " + objEmp.getName());
        lblSaveMsg.setText("");
        showEmployee();
        
    }//GEN-LAST:event_btnIncreaseActionPerformed

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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new EmployeeApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncrease;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblIncreaseMsg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblSaveMsg;
    private javax.swing.JPanel pnlAddEmployee;
    private javax.swing.JPanel pnlProcessEmp;
    private javax.swing.JTextField txtIncrease;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
