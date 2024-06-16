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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import netvince.diyatahotel.connect;

/**
 *
 * @author Curtis
 */
public class Frame_reserve extends javax.swing.JFrame {

    /**
     * Creates new form Frame_reserve
     */
    public Frame_reserve() {
        initComponents();
        setLocationRelativeTo(null);
        table();
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
        amount = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservetbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservation");
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
        amount.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(0, 0, 0));
        amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount.setText("Amount");
        amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountFocusLost(evt);
            }
        });
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountKeyPressed(evt);
            }
        });
        jPanel2.add(amount);
        amount.setBounds(50, 110, 200, 50);

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

        jComboBox.setBackground(new java.awt.Color(0, 204, 204));
        jComboBox.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jComboBox.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox);
        jComboBox.setBounds(350, 110, 200, 50);

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Room #");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(260, 110, 80, 50);

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Reserve The Room");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(50, 360, 500, 70);

        jScrollPane1.setRowHeaderView(null);

        reservetbl.setBackground(new java.awt.Color(0, 204, 204));
        reservetbl.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        reservetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Room ID", "Guest First Name", "Guest Last Name", "Transaction Date", "Transaction Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservetbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        reservetbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reservetbl.setRowHeight(50);
        reservetbl.setSelectionBackground(new java.awt.Color(0, 102, 102));
        reservetbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        reservetbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        reservetbl.getTableHeader().setResizingAllowed(false);
        reservetbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(reservetbl);
        if (reservetbl.getColumnModel().getColumnCount() > 0) {
            reservetbl.getColumnModel().getColumn(0).setResizable(false);
            reservetbl.getColumnModel().getColumn(1).setResizable(false);
            reservetbl.getColumnModel().getColumn(2).setResizable(false);
            reservetbl.getColumnModel().getColumn(3).setResizable(false);
            reservetbl.getColumnModel().getColumn(4).setResizable(false);
            reservetbl.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(50, 190, 500, 150);

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
    public void reserve(int index,String name1,String name2, double amount){
        try {
                Connection connection = netvince.diyatahotel.connect.getConnection();
                    PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT COUNT(*) AS rowCount FROM `reservation table`");
                    ResultSet resultSet = preparedStatement1.executeQuery();
                    while(resultSet.next()){
                    int rowCount = resultSet.getInt("rowCount");
                    PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO `reservation table`"
                    + "(`reservation_id`, `room_id`, `guest_firstname`, `guest_lastname`, `transaction_date`, `transaction_amount`)"
                    + "VALUES (?,?,?,?,?,?)");
                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String formattedDate = currentDate.format(formatter);
                    preparedStatement.setInt(1,rowCount+1);
                    preparedStatement.setInt(2,index);
                    preparedStatement.setString(3,name1);
                    preparedStatement.setString(4,name2);
                    preparedStatement.setDate(5,Date.valueOf(formattedDate));
                    preparedStatement.setDouble(6,amount);
                    preparedStatement.executeUpdate();
                    PreparedStatement update = connection.prepareStatement("UPDATE `room table` SET `room_status`=? WHERE `room_id`=?");
                    update.setString(1,"Reserved");
                    update.setInt(2,index);
                    update.executeUpdate();
                    preparedStatement.close();
                    connection.close();
                    new Frame_reserve().setVisible(true);
                    dispose();
                    }
            }
            catch (SQLException e) {
            e.printStackTrace();
            }
    }
    public void loadData(){
        try (Connection connection = DriverManager.getConnection(connect.url, connect.user, connect.password)) {
            String query = "SELECT * FROM `room table` WHERE `room_status` = 'Unoccupied'";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            while (resultSet.next()) {
                String value1 = resultSet.getString("room_id");
                String value = resultSet.getString("room_status");
                model.addElement(value1 + "  - "+value);
            }
            jComboBox.setModel(model);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void table(){
        TableCellRenderer rendererFromHeader = reservetbl.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer align = new DefaultTableCellRenderer();
        align.setHorizontalAlignment(JLabel.CENTER);
        reservetbl.getColumnModel().getColumn(0).setCellRenderer(align);
        reservetbl.getColumnModel().getColumn(1).setCellRenderer(align);
        reservetbl.getColumnModel().getColumn(2).setCellRenderer(align);
        reservetbl.getColumnModel().getColumn(3).setCellRenderer(align);
        reservetbl.getColumnModel().getColumn(4).setCellRenderer(align);
        reservetbl.getColumnModel().getColumn(5).setCellRenderer(align);
        reservetbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        int[] columnWidths = {100, 200, 200, 200, 100, 150, 150}; // Adjust these widths as per your preference
        for (int i = 0; i < reservetbl.getColumnCount(); i++) {
            reservetbl.getColumnModel().getColumn(i).setPreferredWidth(columnWidths[i]);
        }
        retrieveData();
    }
    void retrieveData() {
        DefaultTableModel retrievemodel = (DefaultTableModel) reservetbl.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(retrievemodel);
        reservetbl.setRowSorter(sorter);
        retrievemodel.setRowCount(0);
        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM `reservation table`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int a = resultSet.getInt("reservation_id");
                Date b = resultSet.getDate("transaction_date");
                Double c = resultSet.getDouble("transaction_amount");
                int d = resultSet.getInt("room_id");
                String e = resultSet.getString("guest_firstname");
                String f = resultSet.getString("guest_lastname");
                retrievemodel.addRow(new Object[]{a, d, e, f, c, b});
            }
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String name1 = fname.getText();
        String name2 = lname.getText();
        String amt = amount.getText();
        double amount = Double.parseDouble(amt);
        int index = (int) Integer.parseInt(jComboBox.getSelectedItem().toString().substring(0,3).trim());
        if(name1.equals("First Name")
            ||name2.equals("Last Name")
            ||amt.equals("Amount")){
            JOptionPane.showMessageDialog(null, "Please fill in all the fields","Invalid Input",DO_NOTHING_ON_CLOSE);
        }
        else if(!name1.equals("First Name")
            ||!name2.equals("Last Name")
            ||!amt.equals("Amount")){
            int confirmation = JOptionPane.showConfirmDialog(null, "Are the credentials entered final?", "Checking in.", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.OK_OPTION) {
                reserve(index,name1,name2,amount);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void amountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusGained
        // TODO add your handling code here:
        if(amount.getText().equals("Amount")){
            amount.setText("");
        }
    }//GEN-LAST:event_amountFocusGained

    private void amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusLost
        // TODO add your handling code here:
        if(amount.getText().isEmpty()){
            amount.setText("Amount");
        }
    }//GEN-LAST:event_amountFocusLost

    private void amountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyPressed
        // TODO add your handling code here:
        String pn = amount.getText();
        int l = pn.length();
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            if(l<6){
                amount.setEditable(true);
            }
            else{
                amount.setEditable(false);
            }
        }
        else{
            if(Character.isISOControl(c)){
                amount.setEditable(true);
            }
            else{
                amount.setEditable(false);
            }
        }
    }//GEN-LAST:event_amountKeyPressed

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
            java.util.logging.Logger.getLogger(Frame_reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_reserve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTable reservetbl;
    // End of variables declaration//GEN-END:variables
}
