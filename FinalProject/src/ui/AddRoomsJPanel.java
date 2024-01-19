/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.AddRoomsQuery;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Shruti
 */
public class AddRoomsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddROomsJPanel
     */
    public AddRoomsJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRoomNo = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboBoxType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        lblRoomNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblRoomNo.setForeground(new java.awt.Color(51, 153, 255));
        lblRoomNo.setText("Room No.:");

        txtRoomNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRoomNo.setForeground(new java.awt.Color(51, 153, 255));
        txtRoomNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRoomNoFocusLost(evt);
            }
        });

        lblType.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblType.setForeground(new java.awt.Color(51, 153, 255));
        lblType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4200473_address_location_map_navigation_icon.png"))); // NOI18N
        lblType.setText("Type:");

        lblPrice.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(51, 153, 255));
        lblPrice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/290143_cash_money_payment_wallet_icon.png"))); // NOI18N
        lblPrice.setText("Price:");

        txtPrice.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(51, 153, 255));

        btnAdd.setBackground(new java.awt.Color(255, 153, 51));
        btnAdd.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Room Details");

        comboBoxType.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        comboBoxType.setForeground(new java.awt.Color(51, 153, 255));
        comboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Delux", "Suite", "Villa", "Presidential Suite" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrice)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblType)
                                .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxType, lblPrice, lblRoomNo, lblType, txtPrice, txtRoomNo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblType))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(lblPrice)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(81, 81, 81)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(85, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxType, lblPrice, lblRoomNo, lblType, txtPrice, txtRoomNo});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtRoomNo.getText().isBlank()&&
             txtPrice.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please enter data in all the fields.");
            return;
        }  
        
        Pattern numberRegex = Pattern.compile("\\d+");
        if(txtRoomNo.getText().isBlank()  || !numberRegex.matcher(txtRoomNo.getText()).matches()){
            JOptionPane.showMessageDialog(null, "Please enter a valid salary");
            return;
        }
        int roomNo = Integer.parseInt(txtRoomNo.getText());
        
        AddRoomsQuery In= new AddRoomsQuery();
        boolean res=In.CheckRoomNo(roomNo);
        if(res==true)
        {
            JOptionPane.showMessageDialog(this, "Room No entered already exists.");
            return;
        }
        String roomType= (String)comboBoxType.getSelectedItem();
        int room_price=Integer.parseInt(txtPrice.getText());
        
        AddRoomsQuery Insert= new AddRoomsQuery();
        boolean result=Insert.addRooms(roomNo,roomType,room_price);
        if (result==true){
            JOptionPane.showMessageDialog(this, "Room added succcessfully!!!!");
                txtRoomNo.setText("");
                txtPrice.setText(""); 
        }
        else{
            JOptionPane.showMessageDialog(this, "Some error occurred. Please try again");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtRoomNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRoomNoFocusLost
        // TODO add your handling code here:
        int roomNo = Integer.parseInt(txtRoomNo.getText());
        AddRoomsQuery Insert= new AddRoomsQuery ();
        boolean res=Insert.CheckRoomNo(roomNo);
        if(res==true)
        {
            JOptionPane.showMessageDialog(this, "This  Room No already exists.");
        }
    }//GEN-LAST:event_txtRoomNoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> comboBoxType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblRoomNo;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomNo;
    // End of variables declaration//GEN-END:variables
}