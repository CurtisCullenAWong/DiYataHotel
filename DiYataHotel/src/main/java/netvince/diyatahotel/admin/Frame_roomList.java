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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import netvince.diyatahotel.connect;

/**
 *
 * @author Curtis
 */
public class Frame_roomList extends javax.swing.JFrame {

    /**
     * Creates new form Frame_roomList
     */
    public Frame_roomList() {
        initComponents();
        setLocationRelativeTo(null);
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void table(){
        TableCellRenderer rendererFromHeader = roomtbl.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer align = new DefaultTableCellRenderer();
        align.setHorizontalAlignment(JLabel.CENTER);
        roomtbl.getColumnModel().getColumn(0).setCellRenderer(align);
        roomtbl.getColumnModel().getColumn(1).setCellRenderer(align);
        roomtbl.getColumnModel().getColumn(2).setCellRenderer(align);
        roomtbl.getColumnModel().getColumn(3).setCellRenderer(align);
        int[] columnWidths = {100, 200, 300, 100}; // Adjust these widths as per your preference
        for (int i = 0; i < roomtbl.getColumnCount(); i++) {
            roomtbl.getColumnModel().getColumn(i).setPreferredWidth(columnWidths[i]);
        }
        retrieveData();
    }
    void retrieveData() {
        DefaultTableModel retrievemodel = (DefaultTableModel) roomtbl.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(retrievemodel);
        roomtbl.setRowSorter(sorter);
        retrievemodel.setRowCount(0);
        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM `room table`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int a = resultSet.getInt("room_id");
                String b = resultSet.getString("room_type");
                String c = resultSet.getString("room_status");
                int d = resultSet.getInt("room_capacity");
                retrievemodel.addRow(new Object[]{a, b, c, d});
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomtbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room List");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 90);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(null);

        jScrollPane1.setRowHeaderView(null);

        roomtbl.setBackground(new java.awt.Color(204, 255, 255));
        roomtbl.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        roomtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room Type", "Room Status", "Room Capacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomtbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        roomtbl.setColumnSelectionAllowed(true);
        roomtbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        roomtbl.setRowHeight(50);
        roomtbl.setSelectionBackground(new java.awt.Color(0, 102, 102));
        roomtbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        roomtbl.getTableHeader().setResizingAllowed(false);
        roomtbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(roomtbl);
        roomtbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (roomtbl.getColumnModel().getColumnCount() > 0) {
            roomtbl.getColumnModel().getColumn(0).setResizable(false);
            roomtbl.getColumnModel().getColumn(1).setResizable(false);
            roomtbl.getColumnModel().getColumn(2).setResizable(false);
            roomtbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 660, 420);

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
        jPanel3.add(jButton1);
        jButton1.setBounds(10, 440, 170, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 100, 680, 490);

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
            java.util.logging.Logger.getLogger(Frame_roomList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_roomList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_roomList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_roomList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_roomList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable roomtbl;
    // End of variables declaration//GEN-END:variables
}
