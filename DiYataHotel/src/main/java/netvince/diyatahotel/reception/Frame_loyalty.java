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
import netvince.diyatahotel.reception.Dash_reception;

/**
 *
 * @author Curtis
 */
public class Frame_loyalty extends javax.swing.JFrame {

    /**
     * Creates new form loyalty_frame
     */
    public Frame_loyalty() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        loyaltytbl = new javax.swing.JTable();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guest Loyalty Overview");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 100);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("RETURN");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 460, 160, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        jScrollPane1.setRowHeaderView(null);

        loyaltytbl.setBackground(new java.awt.Color(255, 204, 204));
        loyaltytbl.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        loyaltytbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Membership ID", "Guest ID", "Guest Last Name", "Loyalty Level", "Loyalty Points", "Loyalty Registration Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        loyaltytbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        loyaltytbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loyaltytbl.setRowHeight(50);
        loyaltytbl.setSelectionBackground(new java.awt.Color(0, 102, 102));
        loyaltytbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        loyaltytbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        loyaltytbl.getTableHeader().setResizingAllowed(false);
        loyaltytbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(loyaltytbl);
        if (loyaltytbl.getColumnModel().getColumnCount() > 0) {
            loyaltytbl.getColumnModel().getColumn(0).setResizable(false);
            loyaltytbl.getColumnModel().getColumn(1).setResizable(false);
            loyaltytbl.getColumnModel().getColumn(2).setResizable(false);
            loyaltytbl.getColumnModel().getColumn(3).setResizable(false);
            loyaltytbl.getColumnModel().getColumn(4).setResizable(false);
            loyaltytbl.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 430, 450);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 110, 450, 470);

        jComboBox.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jComboBox.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox);
        jComboBox.setBounds(520, 230, 140, 50);

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Guest ID #");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 170, 140, 50);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Apply Loyalty");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(500, 360, 180, 60);

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
    public void loadData(){
        try (Connection connection = DriverManager.getConnection(connect.url, connect.user, connect.password)) {
            String query = "SELECT `guest_id`, `guest_lastname` FROM `guest table` WHERE `membership_id` IS NULL";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            while (resultSet.next()) {
                String value = resultSet.getString("guest_id");
                String value1 = resultSet.getString("guest_lastname");
                model.addElement(value+"  - "+value1);
            }
            jComboBox.setModel(model);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void table(){
        TableCellRenderer rendererFromHeader = loyaltytbl.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer align = new DefaultTableCellRenderer();
        align.setHorizontalAlignment(JLabel.CENTER);
        loyaltytbl.getColumnModel().getColumn(0).setCellRenderer(align);
        loyaltytbl.getColumnModel().getColumn(1).setCellRenderer(align);
        loyaltytbl.getColumnModel().getColumn(2).setCellRenderer(align);
        loyaltytbl.getColumnModel().getColumn(3).setCellRenderer(align);
        loyaltytbl.getColumnModel().getColumn(4).setCellRenderer(align);
        loyaltytbl.getColumnModel().getColumn(5).setCellRenderer(align);
        loyaltytbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        int[] columnWidths = {150, 150, 150, 100, 200, 300}; // Adjust these widths as per your preference
        for (int i = 0; i < loyaltytbl.getColumnCount(); i++) {
            loyaltytbl.getColumnModel().getColumn(i).setPreferredWidth(columnWidths[i]);
        }
        retrieveData();
    }
    void retrieveData() {
        DefaultTableModel retrievemodel = (DefaultTableModel) loyaltytbl.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(retrievemodel);
        loyaltytbl.setRowSorter(sorter);
        retrievemodel.setRowCount(0);
        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM `loyalty program table`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int a = resultSet.getInt("membership_id");
                int b = resultSet.getInt("guest_id");
                String c = resultSet.getString("loyalty_level");
                int d = resultSet.getInt("loyalty_points");
                Date e = resultSet.getDate("loyalty_registration_date");
                PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM `guest table` WHERE guest_id = ?");
                preparedStatement1.setInt(1, b);
                ResultSet resultSet1 = preparedStatement1.executeQuery();
                while(resultSet1.next()){
                String f = resultSet1.getString("guest_lastname");
                retrievemodel.addRow(new Object[]{a, b, f, c, d, e});
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Dash_reception().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "Apply for loyalty program?", "Applying for loyalty.", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.OK_OPTION) {
            int index = (int) Integer.parseInt(jComboBox.getSelectedItem().toString().substring(0,3).trim());
            System.out.println(index);
            try {
                    Connection connection = netvince.diyatahotel.connect.getConnection();
                    PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT `guest_id` FROM `guest table` WHERE guest_id = ?");
                    preparedStatement1.setInt(1,index);
                    ResultSet resultSet = preparedStatement1.executeQuery();
                    PreparedStatement count = connection.prepareStatement("SELECT COUNT(*) AS rowCount FROM `loyalty program table`");
                    ResultSet Count = count.executeQuery();
                    while(Count.next()){
                        int rowCount = Count.getInt("rowCount");
                        if(resultSet.next()){
                            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `loyalty program table`"
                            + "(`membership_id`, `loyalty_level`, `loyalty_points`, `loyalty_registration_date`, `guest_id`)"
                            + "VALUES (?,?,?,?,?)");
                            LocalDate currentDate = LocalDate.now();
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            String formattedDate = currentDate.format(formatter);
                            preparedStatement.setInt(1,rowCount+1);
                            preparedStatement.setString(2,"Bronze");
                            preparedStatement.setInt(3,1);
                            preparedStatement.setDate(4,Date.valueOf(formattedDate));
                            preparedStatement.setInt(5,index);
                            preparedStatement.executeUpdate();
                            PreparedStatement update = connection.prepareStatement("UPDATE `guest table` SET `membership_id`=?,`loyalty_level`=? WHERE `guest_id`=?");
                            update.setInt(1,rowCount+1);
                            update.setString(2,"Bronze");
                            update.setInt(3,index);
                            update.executeUpdate();
                            new Frame_loyalty().setVisible(true);
                            dispose();
                        }
                    }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_loyalty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_loyalty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_loyalty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_loyalty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_loyalty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable loyaltytbl;
    // End of variables declaration//GEN-END:variables
}
