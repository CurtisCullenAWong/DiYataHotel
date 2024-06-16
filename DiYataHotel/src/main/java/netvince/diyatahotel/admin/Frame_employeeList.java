/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package netvince.diyatahotel.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import netvince.diyatahotel.connect;

/**
 *
 * @author Curtis
 */
public class Frame_employeeList extends javax.swing.JFrame {

    /**
     * Creates new form admin_dash
     */
    public Frame_employeeList() {
        initComponents();
        setLocationRelativeTo(null);
        employeeTable();
    }

    public void employeeTable(){
        TableCellRenderer rendererFromHeader = employeetbl.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer align = new DefaultTableCellRenderer();
        align.setHorizontalAlignment(JLabel.CENTER);
        employeetbl.getColumnModel().getColumn(0).setCellRenderer(align);
        employeetbl.getColumnModel().getColumn(1).setCellRenderer(align);
        employeetbl.getColumnModel().getColumn(2).setCellRenderer(align);
        employeetbl.getColumnModel().getColumn(3).setCellRenderer(align);
        employeetbl.getColumnModel().getColumn(4).setCellRenderer(align);
        employeetbl.getColumnModel().getColumn(5).setCellRenderer(align);
        employeetbl.getColumnModel().getColumn(6).setCellRenderer(align);
        employeetbl.getColumnModel().getColumn(7).setCellRenderer(align);
        employeetbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        int[] columnWidths = {100, 150, 150, 300, 250, 300, 250, 180}; // Adjust these widths as per your preference
        for (int i = 0; i < employeetbl.getColumnCount(); i++) {
            employeetbl.getColumnModel().getColumn(i).setPreferredWidth(columnWidths[i]);
        }
        retrieveData();
    }
    void retrieveData() {
        DefaultTableModel retrievemodel = (DefaultTableModel) employeetbl.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(retrievemodel);
        employeetbl.setRowSorter(sorter);
        retrievemodel.setRowCount(0);
        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM `employee table`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int a = resultSet.getInt("employee_id");
                String b = resultSet.getString("employee_firstname");
                String c = resultSet.getString("employee_lastname");
                String d = resultSet.getString("employee_email");
                String e = resultSet.getString("employee_address");
                String f = resultSet.getString("employee_phone");
                String g = resultSet.getString("employee_position");
                String h = resultSet.getString("employee_department");
                retrievemodel.addRow(new Object[]{a, b, c, d, e, f, g, h});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    void deleteData(int employeeID) {
        try {
            Connection connection = connect.getConnection();
            String checkQuery = "SELECT employee_id FROM `employee table` WHERE employee_id = ?";
            
            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
            checkStatement.setInt(1, employeeID);
            ResultSet checkResultSet = checkStatement.executeQuery();
            if (checkResultSet.next()) {
                String deleteQuery = "DELETE FROM `employee table` WHERE employee_id = ?";
                PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                deleteStatement.setInt(1, employeeID);
                deleteStatement.executeUpdate();
            } else {
                System.out.println("Employee ID does not exist.");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeetbl = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Dashboard");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee List");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 30, 580, 100);

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
        jButton1.setBounds(630, 720, 160, 70);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(null);

        jScrollPane1.setRowHeaderView(null);

        employeetbl.setBackground(new java.awt.Color(0, 204, 204));
        employeetbl.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        employeetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee First Name", "Employee Last Name", "Employee Email", "Employee Address", "Employee Phone", "Employee Position", "Employee Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeetbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        employeetbl.setColumnSelectionAllowed(true);
        employeetbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        employeetbl.setRowHeight(50);
        employeetbl.setSelectionBackground(new java.awt.Color(0, 102, 102));
        employeetbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        employeetbl.getTableHeader().setResizingAllowed(false);
        employeetbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(employeetbl);
        employeetbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (employeetbl.getColumnModel().getColumnCount() > 0) {
            employeetbl.getColumnModel().getColumn(0).setResizable(false);
            employeetbl.getColumnModel().getColumn(1).setResizable(false);
            employeetbl.getColumnModel().getColumn(2).setResizable(false);
            employeetbl.getColumnModel().getColumn(3).setResizable(false);
            employeetbl.getColumnModel().getColumn(4).setResizable(false);
            employeetbl.getColumnModel().getColumn(5).setResizable(false);
            employeetbl.getColumnModel().getColumn(6).setResizable(false);
            employeetbl.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 760, 450);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("PURGE ACCOUNT");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(490, 470, 280, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 170, 780, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Dash_admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = employeetbl.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel delmodel = (DefaultTableModel) employeetbl.getModel();
            int employeeid = (int) delmodel.getValueAt(selectedRow, 0);

            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this employee?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                JTextField usernameField = new JTextField();
                JPasswordField passwordField = new JPasswordField();
                Object[] message = {
                    "Admin Username:", usernameField,
                    "Admin Password:", passwordField
                };
                int adminConfirm = JOptionPane.showConfirmDialog(null, message, "Admin Authentication", JOptionPane.OK_CANCEL_OPTION);
                if (adminConfirm == JOptionPane.OK_OPTION) {
                    String adminUsername = usernameField.getText();
                    String adminPassword = new String(passwordField.getPassword());

                    if (adminUsername.equals(netvince.diyatahotel.Frame_login.superuser) && adminPassword.equals(netvince.diyatahotel.Frame_login.superpass)) {
                        delmodel.removeRow(selectedRow);
                        deleteData(employeeid);
                        retrieveData();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid admin credentials. Employee removal cancelled.");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No employees selected.");
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
            java.util.logging.Logger.getLogger(Frame_employeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_employeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_employeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_employeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Frame_employeeList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable employeetbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
