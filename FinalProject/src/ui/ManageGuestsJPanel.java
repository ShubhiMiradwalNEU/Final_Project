/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.EmployeeQueries;
import databaseconnection.GuestQueries;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.Guest;

/**
 *
 * @author Shruti
 */
public class ManageGuestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageGuestsJPanel
     */
    Guest guest = new Guest();
    public ManageGuestsJPanel() {
        initComponents();
        populateTable();
    }
    public void switchPanels(JPanel panel){
            layeredPane.removeAll();
            layeredPane.add(panel);
            layeredPane.repaint();
            layeredPane.revalidate();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPane = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGuests = new javax.swing.JTable();
        btnUpdateGuests = new javax.swing.JButton();
        btnDeleteGuests = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAddGuests = new javax.swing.JButton();

        layeredPane.setBackground(new java.awt.Color(255, 255, 255));
        layeredPane.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblGuests.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblGuests.setForeground(new java.awt.Color(255, 153, 51));
        tblGuests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Contact", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGuests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGuestsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGuests);

        btnUpdateGuests.setBackground(new java.awt.Color(255, 153, 51));
        btnUpdateGuests.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnUpdateGuests.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateGuests.setText("Update");
        btnUpdateGuests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateGuestsActionPerformed(evt);
            }
        });

        btnDeleteGuests.setBackground(new java.awt.Color(255, 153, 51));
        btnDeleteGuests.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnDeleteGuests.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteGuests.setText("Delete");
        btnDeleteGuests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteGuestsActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 153, 255));
        lblName.setText("Name:");

        txtName.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 153, 255));

        lblPhoneNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPhoneNo.setForeground(new java.awt.Color(51, 153, 255));
        lblPhoneNo.setText("Phone No.:");

        txtPhoneNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtPhoneNo.setForeground(new java.awt.Color(51, 153, 255));

        lblAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(51, 153, 255));
        lblAddress.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Guests");

        btnAddGuests.setBackground(new java.awt.Color(255, 153, 51));
        btnAddGuests.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddGuests.setForeground(new java.awt.Color(255, 255, 255));
        btnAddGuests.setText("Add Guests");
        btnAddGuests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGuestsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateGuests)
                        .addGap(59, 59, 59)
                        .addComponent(btnDeleteGuests)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoneNo)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                                .addComponent(btnAddGuests)))
                        .addGap(14, 14, 14))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddress, lblName, lblPhoneNo, txtAddress, txtName, txtPhoneNo});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdateGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(lblPhoneNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAddress, lblName, lblPhoneNo, txtAddress, txtName, txtPhoneNo});

        layeredPane.add(jPanel3, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateGuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateGuestsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblGuests.getModel();
        int selectedRowIndex = tblGuests.getSelectedRow();
        
        Guest selectedGuest = (Guest) model.getValueAt(selectedRowIndex, 0);
        if (tblGuests.getSelectedRowCount()==1){
            //-- if single row is selected than update--
            String name = txtName.getText();
            String email = selectedGuest.getEmailAddress();
            Long phone_no = Long.parseLong(txtPhoneNo.getText());
            String address = txtAddress.getText();
            
            
            if (name.equals("") || phone_no.equals("") || 
                    address.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter all the fields");
              return;   
            }
            
            GuestQueries updateSelectedGuest = new GuestQueries();  
            try{
                updateSelectedGuest.updateGuest(name, phone_no, address, email);
                System.out.print("Updated!!");
            }
            catch (SQLException ex) {
                  Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            guest.updateGuest(selectedGuest, selectedRowIndex);
            JOptionPane.showMessageDialog(this, "Guest Updated Successfully ");
            populateTable();

        }
    }//GEN-LAST:event_btnUpdateGuestsActionPerformed

    private void btnDeleteGuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteGuestsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblGuests.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblGuests.getModel();
        Guest selectedGuest = (Guest) model.getValueAt(selectedRowIndex, 0);
        guest.deleteGuest(selectedGuest);
        String email = selectedGuest.getEmailAddress();
        
        GuestQueries deleteGuest = new GuestQueries();            
              try {
                  deleteGuest.deleteSelectedGuest(email);
                  System.out.print("Deleted!!");
              } 
              catch (SQLException ex) {
                  Logger.getLogger(ManageGuestsJPanel.class.getName()).log(Level.SEVERE, null, ex);
              }
        JOptionPane.showMessageDialog(this,"Guest deleted");
        txtName.setText("");
        txtPhoneNo.setText("");
        txtAddress.setText("");
 
        
        populateTable();
    }//GEN-LAST:event_btnDeleteGuestsActionPerformed

    private void btnAddGuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGuestsActionPerformed
        // TODO add your handling code here:
        AddGuestsJPanel addGuests = new AddGuestsJPanel();
        switchPanels(addGuests);
    }//GEN-LAST:event_btnAddGuestsActionPerformed

    private void tblGuestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGuestsMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblGuests.getSelectedRow(); 
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblGuests.getModel();
        
        Guest selectedGuest = (Guest) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedGuest);
        
        txtName.setText(selectedGuest.getName());
//        txtEmail.setText(selectedGuest.getEmailAddress());
        txtPhoneNo.setText(Long.toString(selectedGuest.getPhoneNumber()));
        txtAddress.setText(selectedGuest.getAddress());
    }//GEN-LAST:event_tblGuestsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGuests;
    private javax.swing.JButton btnDeleteGuests;
    private javax.swing.JButton btnUpdateGuests;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JTable tblGuests;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
    
    public void populateTable()  {
        DefaultTableModel model = (DefaultTableModel) tblGuests.getModel();
        model.setRowCount(0);
        GuestQueries guests= new GuestQueries();

        try {
            for(Guest guests1: guests.getGuest()){
                Object[] row = new Object[4];
                row[0] = guests1;
                row[1] = guests1.getEmailAddress();
                row[2] = guests1.getPhoneNumber();
                row[3] = guests1.getAddress();
                
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageGuestsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
