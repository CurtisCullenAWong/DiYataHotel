/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package netvince.diyatahotel.reception;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import netvince.diyatahotel.connect;
import netvince.diyatahotel.receipt_function;
import netvince.diyatahotel.reception.Dash_reception;

/**
 *
 * @author Curtis
 */
public class Frame_checkout extends javax.swing.JFrame {

    /**
     * Creates new form reservation_frame
     */
    public Frame_checkout() {
        initComponents();
        setLocationRelativeTo(null);
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        amount = new javax.swing.JComboBox<>();
        roomID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        paymentMode = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guest Checkout");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 30, 600, 100);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("RETURN");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 660, 160, 70);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(null);

        amount.setBackground(new java.awt.Color(0, 204, 204));
        amount.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        amount.setForeground(new java.awt.Color(0, 0, 0));
        amount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1500", "2000", "2500", "3000", "4000", "4500", "5000" }));
        jPanel2.add(amount);
        amount.setBounds(60, 190, 260, 90);

        roomID.setBackground(new java.awt.Color(0, 204, 204));
        roomID.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        roomID.setForeground(new java.awt.Color(0, 0, 0));
        roomID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(roomID);
        roomID.setBounds(240, 40, 310, 90);

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Room #");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 40, 140, 90);

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Check Out");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(50, 340, 500, 90);

        paymentMode.setBackground(new java.awt.Color(0, 204, 204));
        paymentMode.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        paymentMode.setForeground(new java.awt.Color(0, 0, 0));
        paymentMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit", "Debit" }));
        jPanel2.add(paymentMode);
        paymentMode.setBounds(330, 190, 220, 90);

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Room Rates:");
        jLabel3.setToolTipText("");
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 140, 160, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 160, 600, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void selected(String mode, int room, int amt){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        try {
            Connection connection = netvince.diyatahotel.connect.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT `guest_id` FROM `transaction overview table` WHERE room_id = ? ORDER BY room_id DESC LIMIT 1");
            preparedStatement.setString(1,Integer.toString(room));
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM `transaction overview table`");
                ResultSet resultSet1 = preparedStatement1.executeQuery();
                while(resultSet1.next()){
                    String id = resultSet.getString("guest_id");
                    Date checkin = resultSet1.getDate("checkin_date");
                    PreparedStatement upd = connection.prepareStatement("UPDATE `room table` SET `room_status`='Checkout' WHERE `room_id`=?");
                    upd.setString(1, Integer.toString(room));
                    upd.executeUpdate();
                    receipt_function.transaction_overview(receipt_function.login_name, id, mode, room, checkin, Date.valueOf(formattedDate),"Checkout");
                    receipt_function.transaction(mode,Date.valueOf(formattedDate),amt,amt,0);
                    return;
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void loadData(){
        try (Connection connection = DriverManager.getConnection(connect.url, connect.user, connect.password)) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM `room table` WHERE `room_status` = 'Occupied' ORDER BY `room_id`");
            ResultSet resultSet = preparedStatement.executeQuery();
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            while(resultSet.next()) {
                String value1 = resultSet.getString("room_id");
                String value = resultSet.getString("room_type");
                model.addElement(value1 + "  - "+value);
            }
            roomID.setModel(model);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Are you sure you want to return? Fill-up data will be lost.", "Returning to dashboard.", JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
            new Dash_reception().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String mode = (String) paymentMode.getSelectedItem().toString();
        int room = Integer.parseInt((String)roomID.getSelectedItem().toString().substring(0,2).trim());
        String amt = (String) amount.getSelectedItem().toString();
        if(amt.equals("Amount")){
            JOptionPane.showMessageDialog(null, "Please fill in all the fields","Invalid Input",DO_NOTHING_ON_CLOSE);
        }
        else{
            selected(mode,room,Integer.parseInt(amt));
            receipt_function.transaction_type(mode, "Checkout", "Paid");
            new Frame_checkout().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> amount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> paymentMode;
    private javax.swing.JComboBox<String> roomID;
    // End of variables declaration//GEN-END:variables
}
