/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.GuestQueries;
import javax.swing.table.DefaultTableModel;
import model.ShowRoomBookingsAmount;
import java.sql.SQLException;
import model.ShowRecreationBookingsAmount;

/**
 *
 * @author Shruti
 */
public class AllGuestTransactionJPanel extends javax.swing.JPanel {
    int totalRevenue;
    /**
     * Creates new form AllGuestTransactionJPanel
     */
    public AllGuestTransactionJPanel() {
        initComponents();
         totalRevenue = 0;
    populateTable(); 
    populateTable1(); 
   
    jTextField1.setText(Integer.toString(totalRevenue));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecreationBooking = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRoomBookings = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Total Transactions");

        tblRecreationBooking.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblRecreationBooking.setForeground(new java.awt.Color(255, 153, 51));
        tblRecreationBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Guest Name", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecreationBooking);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Total Revenue from bookings: ");

        jTextField1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 153, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Recreation Bookings");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Room Bookings");

        tblRoomBookings.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblRoomBookings.setForeground(new java.awt.Color(255, 153, 51));
        tblRoomBookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Guest Name", "Checkout Date", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRoomBookings);
        if (tblRoomBookings.getColumnModel().getColumnCount() > 0) {
            tblRoomBookings.getColumnModel().getColumn(1).setHeaderValue("Checkout Date");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel3)
                                .addGap(55, 55, 55)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel7)
                    .addContainerGap(518, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jLabel7)
                    .addContainerGap(460, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

     public void populateTable()  {
        DefaultTableModel model = (DefaultTableModel) tblRoomBookings.getModel();
        model.setRowCount(0);
        GuestQueries q= new GuestQueries();
        
        try {
            
            for(ShowRoomBookingsAmount b1: q.getRoomAmount()){
                Object[] row = new Object[4];
                row[0] = b1;
                //row[1] = b1.getGuest();
                row[1] = b1.getCheckout();
                row[2] = b1.getTotal();
                totalRevenue = totalRevenue + b1.getTotal();
                //row[4] = emp1.getSalary();
                //row[5] = emp1.getRole();
                model.addRow(row);
            }
        } catch (SQLException ex) {
            // Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     
     
     public void populateTable1()  {
        DefaultTableModel model = (DefaultTableModel) tblRecreationBooking.getModel();
        model.setRowCount(0);
        GuestQueries q= new GuestQueries();
        
        try {
            
            for(ShowRecreationBookingsAmount b1: q.getRecAmount()){
                Object[] row = new Object[4];
                row[0] = b1;
                //row[1] = b1.getGuest();
                row[1] = b1.getTotal();
                totalRevenue = totalRevenue + b1.getTotal();
                
                //row[4] = emp1.getSalary();
                //row[5] = emp1.getRole();
                model.addRow(row);
            }
        } catch (SQLException ex) {
            // Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblRecreationBooking;
    private javax.swing.JTable tblRoomBookings;
    // End of variables declaration//GEN-END:variables
}