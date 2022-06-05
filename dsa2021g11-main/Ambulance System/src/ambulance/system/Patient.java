/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ambulance.system;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amiga
 */
public class Patient extends javax.swing.JFrame {

    public String Name;
    public String Address;
    public String AddressId;
    public String ContactNumber;

//    DefaultTableModel model;
    /**
     * Creates new form Patient
     */
    public Patient() {
        initComponents();
//        this.model = new DefaultTableModel();
//        model.addColumn("Name");
//        model.addColumn("Address");
//        model.addColumn("AddressId");
//        model.addColumn("ContactNumber");
//        jTable1.setModel(model);
    }
    // Linked List Implementation gave errors due to table model handling

//     private LinkedList<PatientInfo> PatientLinkedList = new LinkedList<StudentEmail> ();
//     private int editIndex;
//     private boolean isStudentIdInLinkedList (String idStr)
//   {
//      boolean inList = false;
//
//      for (PatientInfo stud : PatientLinkedList)
//      {
//         if (Patient.getId ().compareToIgnoreCase (idStr) == 0)
//         {
//            inList = true;
//         }
//      }
//
//      return inList;
//   }
//
//   private void addPatient ()
//   {
//      if (isStudentIdInLinkedList (TextField.getText()) == true)
//      {
//         JOptionPane.showMessageDialog (Patient.this,
//                              "Error: student ID is already in the database.");
//      }
//      else
//      {
//         try
//         {
//            Patient stud = new StudentEmail (nameTextField.getText(),
//                                                  idTextField.getText());
//
//            PatientLinkedList.add (stud);
//
//            displayAll ();
//
//            TextField.setText("");
//            TextField.setText("");
//
//
//         }
//         catch (Patient error)
//         {
//            JOptionPane.showMessageDialog (Patient.this, error.toString ());
//            
//
//
//         }
//
//      }
//   }
//
//   private void deletePatient ()
//   {
//      if (PatienttLinkedList.size() == 0)
//      {
//         JOptionPane.showMessageDialog (Patient.this,
//                                        "Error: Database is empty.");
//      }
//      else if (isPatientIdInLinkedList (idTextField.getText()) == false)
//      {
//         JOptionPane.showMessageDialog (PatientEmailGUI.this,
//                                       "Error: student ID is not in the database.");
//      }
//      else
//      {
//         for (int s = 0; s < PatientLinkedList.size(); s++)
//         {
//            String currId = PatientLinkedList.get (s).getId ();
//
//            if (currId.compareToIgnoreCase (TextField.getText()) == 0)
//            {
//              PatientLinkedList.remove (s);
//            }
//         }
//
//         displayAll ();
//
//         nameTextField.setText("");
//         idTextField.setText("");
//      }
//   }
//
//   private void editStudent ()
//   {
//      if (PatientLinkedList.size() == 0)
//      {
//         JOptionPane.showMessageDialog (StudentEmailGUI.this,
//                                        "Error: Database is empty.");
//      }
//      else if (isPatientInLinkedList (idTextField.getText()) == false)
//      {
//         JOptionPane.showMessageDialog (StudentEmailGUI.this,
//                                        "Error: student ID is not in the database.");
//      }
//      else
//      {
//         editIndex = -1;
//
//         for (int s = 0; s < PatientLinkedList.size(); s++)
//         {
//            String currId = PatientLinkedList.get (s).getId ();
//
//            if (currId.compareToIgnoreCase (idTextField.getText()) == 0)
//            {
//               editIndex = s;
//               s = PatientLinkedList.size(); // Exit Loop
//            }
//         }
    // index cannot be less than 0, because we checked if the Stud Id was in
    // the linked list before we looped above.
//         if (editIndex >= 0)
//         {
//            editSaveButton.setEnabled   (true);
//
//            editButton.setEnabled       (false);
//            testDataButton.setEnabled   (false);
//            addButton.setEnabled        (false);
//            deleteButton.setEnabled     (false);
//            displayAllButton.setEnabled (false);
//            exitButton.setEnabled       (false);
//
//            nameTextField.setText (PatientLinkedList.get (editIndex).getName () );
//            //idTextField.setText   (studentLinkedList.get (editIndex).getId () );
//         }
//
//
//      }
//
//   }
//
//   private void editSaveStudent ()
//   {
    // This code will preserve the changes the user made to the student
    // they were editing - and save them back into the Linked List.
//      PatientLinkedList.get (editIndex).setName (nameTextField.getText() );
//      PatientLinkedList.get (editIndex).setId   (idTextField.getText() );
//
//      displayAll ();
//
//      nameTextField.setText ("");
//      idTextField.setText   ("");
//
//      editSaveButton.setEnabled   (false);
//
//      editButton.setEnabled       (true);
//      testDataButton.setEnabled   (true);
//      addButton.setEnabled        (true);
//      deleteButton.setEnabled     (true);
//      displayAllButton.setEnabled (true);
//      exitButton.setEnabled       (true);
//   }
//
//   private void addTestData ()
//   {
//      nameTextField.setText ("Moose");
//      idTextField.setText   ("s123");
//      addPatient ();
//
//      nameTextField.setText ("Frankie");
//      idTextField.setText   ("s111");
//      addPatient ();
//
//      nameTextField.setText ("Bella");
//      idTextField.setText   ("s789");
//      addPatient();
//   }
//
//   private void displayAll ()
//   {
//      PatientTextArea.setText ("");
//
//      for (PatientEmail stud : PatientLinkedList)
//      {
//         PatientTextArea.append (stud + "\n");
//      }
//   }
    //ArrayList
//    public ArrayList ListForm(String Name, String Address, String AddressId, String ContactNumber)
//    {
//        ArrayList<PatientInfo> list = new ArrayList<>() ;
//        PatientInfo P = new PatientInfo (Name, Address, AddressId, ContactNumber);
//        list.add(P);
//        return list;
//      }
    //Add list to table
//     public void addRow(String Name, String Address, int AddressId, int ContactNumber)
//    {
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//         ArrayList<PatientInfo> list = ListPatientInfo(Name,Address, AddressId,ContactNumber);
//         Object rowData[] = new Object[4];
//         for (int i =0 ;i < list.size(); i++)
//         {
//             rowData[0] = list.get(i).Name;
//             rowData[1] = list.get(i).Address;
//             rowData[2] = list.get(i).AddressId;
//             rowData[3] = list.get(i).ContactNumber;
//             model.addRow(rowData);
//         }
//    }
//    private void addRow(String Name, String Address, String AddressId, String ContactNumber) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private ArrayList<PatientInfo> ListPatientInformation(String Name, String Address, int AddressId, int ContactNumber) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(827, 557));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setMaximumSize(new java.awt.Dimension(50, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ambulance/system/images/ambulance_48px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTable1.setForeground(new java.awt.Color(204, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Address", "AddressId", "ContactNumber"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            model.removeRow(jTable1.getSelectedRow());
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(null, "Please select any row!");
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {

            jTable1.setValueAt(Name, jTable1.getSelectedRow(), 0);
            jTable1.setValueAt(Address, jTable1.getSelectedRow(), 1);
            jTable1.setValueAt(AddressId, jTable1.getSelectedRow(), 2);
            jTable1.setValueAt(ContactNumber, jTable1.getSelectedRow(), 3);

            JOptionPane.showMessageDialog(null, " Now Update Accordingly!");
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(null, "Please select any row!");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        Dashboard form = new Dashboard();
        form.setVisible(true);
        form.setVisible(true);
        form.toFront();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        // TODO add your handling code here:
//        //ADD
//             String Name = nameField.getText();
//             String Address = addressField.getText();
//             String AddressId = addressId.getText();
//             String ContactNumber  = ContactField.getText();
//            
//             addRow( Name,Address,AddressId,ContactNumber);                  
//             
//             nameField.setText("");
//             addressField.setText("");
//             addressId.setText("");
//             ContactField.setText("");
        Name = evt.getActionCommand();
        Address = evt.getActionCommand();
        AddressId = evt.getActionCommand();
        ContactNumber = evt.getActionCommand();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Name = jButton1.getText();
        Address = jButton1.getText();
        AddressId = jButton1.getText();
        ContactNumber = jButton1.getText();

        model.addRow(new Object[]{Name, Address, AddressId, ContactNumber});

        JOptionPane.showMessageDialog(null, "Patient Added Successfully!");

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private ArrayList<PatientInfo> ListPatientInfo(String Name, String Address, int AddressId, int ContactNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
