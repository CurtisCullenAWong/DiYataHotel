/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package netvince.diyatahotel.reception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import netvince.diyatahotel.connect;
import netvince.diyatahotel.reception.Dash_reception;

/**
 *
 * @author Curtis
 */
public class Frame_checkin extends javax.swing.JFrame {

    /**
     * Creates new form reservation_frame
     */
    public Frame_checkin() {
        initComponents();
        setLocationRelativeTo(null);
        loadData();
        jButton2.setEnabled(false);
    }
public static String level;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void loadData(){
        try (Connection connection = DriverManager.getConnection(connect.url, connect.user, connect.password)) {
            String query = "SELECT * FROM `room table` WHERE `room_status` = 'Unoccupied' OR `room_status` = 'Reserved'";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            while (resultSet.next()) {
                String value = resultSet.getString("room_status");
                String value1 = resultSet.getString("room_id");
                model.addElement(value1+"  - "+value);
            }
            jComboBox.setModel(model);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void guestTable(String name1, String name2, String em, String add){
        try {
                Connection connection = netvince.diyatahotel.connect.getConnection();
                    PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT COUNT(*) AS rowCount FROM `guest table`");
                    ResultSet resultSet = preparedStatement1.executeQuery();
                    while(resultSet.next()){
                    int rowCount = resultSet.getInt("rowCount");
                    PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO `guest table`(`guest_id`, `guest_firstname`, `guest_lastname`, `guest_email`, `guest_address`, `membership_id`, `loyalty_level`)"
                    + "VALUES (?,?,?,?,?,NULL,NULL)");
                    preparedStatement.setInt(1,rowCount+1);
                    preparedStatement.setString(2,name1);
                    preparedStatement.setString(3,name2);
                    preparedStatement.setString(4,em);
                    preparedStatement.setString(5,add);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    connection.close();
                    jButton2.setEnabled(true);
                    jButton3.setEnabled(false);
                    fname.setEditable(false);
                    lname.setEditable(false);
                    address.setEditable(false);
                    email.setEditable(false);
                    jComboBox.setEnabled(false);
                    }
                }
                catch (SQLException e) {
                e.printStackTrace();
                }
    }
    public void checkin(int index){
        try {
            Connection connection = netvince.diyatahotel.connect.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE `room table` SET `room_status`='Occupied' WHERE `room_id`=?");
            preparedStatement.setInt(1,index);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
        e.printStackTrace();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guest Checkin");
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

        fname.setBackground(new java.awt.Color(0, 204, 204));
        fname.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 0, 0));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setText("First Name");
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });
        jPanel2.add(fname);
        fname.setBounds(50, 30, 230, 50);

        lname.setBackground(new java.awt.Color(0, 204, 204));
        lname.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 0));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setText("Last Name");
        lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnameFocusLost(evt);
            }
        });
        jPanel2.add(lname);
        lname.setBounds(320, 30, 230, 50);

        email.setBackground(new java.awt.Color(0, 204, 204));
        email.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setText("Email");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        jPanel2.add(email);
        email.setBounds(50, 120, 230, 50);

        address.setColumns(20);
        address.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        address.setLineWrap(true);
        address.setRows(5);
        address.setText("Address");
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(address);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(50, 210, 500, 100);

        jComboBox.setBackground(new java.awt.Color(0, 204, 204));
        jComboBox.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jComboBox.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox);
        jComboBox.setBounds(390, 120, 160, 50);

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Room #");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(320, 120, 70, 50);

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Apply for Loyalty");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(50, 360, 230, 70);

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Check In");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(320, 360, 230, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 160, 600, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Are you sure you want to return? Fill-up data will be lost.", "Returning to dashboard.", JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
            new Dash_reception().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
        // TODO add your handling code here:
        if(fname.getText().equals("First Name")){
            fname.setText("");
        }
    }//GEN-LAST:event_fnameFocusGained

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
        // TODO add your handling code here:
        if(fname.getText().isEmpty()){
            fname.setText("First Name");
        }
    }//GEN-LAST:event_fnameFocusLost

    private void lnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusGained
        // TODO add your handling code here:
        if(lname.getText().equals("Last Name")){
            lname.setText("");
        }
    }//GEN-LAST:event_lnameFocusGained

    private void lnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusLost
        // TODO add your handling code here:
        if(lname.getText().isEmpty()){
            lname.setText("Last Name");
        }
    }//GEN-LAST:event_lnameFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
        if(email.getText().equals("Email")){
            email.setText("");
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
        if(email.getText().isEmpty()){
            email.setText("Email");
        }
    }//GEN-LAST:event_emailFocusLost

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        // TODO add your handling code here:
        if(address.getText().equals("Address")){
            address.setText("");
        }
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        // TODO add your handling code here:
        if(address.getText().isEmpty()){
            address.setText("Address");
        }
    }//GEN-LAST:event_addressFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Frame_loyalty().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String name1 = fname.getText();
        String name2 = lname.getText();
        String em = email.getText();
        String add = address.getText();
        String room = jComboBox.getSelectedItem().toString().substring(0,3).trim();
        int roomindex = Integer.parseInt(room);
        if(name1.equals("First Name")
        ||name2.equals("Last Name")
        ||em.equals("Email")
        ||add.equals("Address")){
            JOptionPane.showMessageDialog(null, "Please fill in all the fields","Invalid Input",DO_NOTHING_ON_CLOSE);
        }
        else if(jComboBox.getSelectedItem().toString().contains("Reserved")
            ||!name1.equals("First Name")
            ||!name2.equals("Last Name")
            ||!em.equals("Email")
            ||!add.equals("Address")){
            System.out.println(room);
            System.out.println(roomindex);
//            try {
//                    Connection connection = netvince.diyatahotel.connect.getConnection();
//                    PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT `room_status`"
//                    + "FROM `room table` WHERE `room_id` = ?");
//                    preparedStatement1.setInt(1,Room);
//                    ResultSet resultSet = preparedStatement1.executeQuery();
//                    if(resultSet.next()){
//                        JOptionPane.showMessageDialog(null, "This room is reserved for someone else","This room is already reserved",DO_NOTHING_ON_CLOSE);
//                    }
//                    else{
//                    
//                        }
//                    }
//            catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
        else if(!name1.equals("First Name")
                ||!name2.equals("Last Name")
                ||!em.equals("Email")
                ||!add.equals("Address")){
                    int confirmation = JOptionPane.showConfirmDialog(null, "Are the credentials entered final?", "Checking in.", JOptionPane.YES_NO_OPTION);
                    if (confirmation == JOptionPane.OK_OPTION) {
                    try {
                    Connection connection = netvince.diyatahotel.connect.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT `guest_firstname`,`guest_lastname`"
                            + "FROM `guest table` WHERE `guest_firstname` = ? AND `guest_lastname` = ?");
                    preparedStatement.setString(1,name1);
                    preparedStatement.setString(2,name2);
                    ResultSet resultSet1 = preparedStatement.executeQuery();
                        if(resultSet1.next()){
                            JOptionPane.showMessageDialog(null, "This guest has checked in before!");
                            checkin(jComboBox.getSelectedIndex());
                        }
                        else{
                            guestTable(name1, name2, em, add);
                            checkin(Integer.parseInt(room.trim()));
                        }
                    }
                    catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
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
            java.util.logging.Logger.getLogger(Frame_checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    // End of variables declaration//GEN-END:variables
}
