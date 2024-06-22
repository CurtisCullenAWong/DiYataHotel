/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package netvince.diyatahotel;

import netvince.diyatahotel.admin.Dash_admin;
import netvince.diyatahotel.reception.Dash_reception;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Curtis
 */
public class Frame_login extends javax.swing.JFrame {
public static int attempts = 3;
public static boolean loginAttempted = false;
public static String superuser = "admin", superpass = "admin";
    /**
     * Creates new form login_frame
     */
    public Frame_login() {
        initComponents();
        setLocationRelativeTo(null);
        passpf.setEchoChar((char)0);
        pb1.setVisible(false);
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
        usertf = new javax.swing.JTextField();
        passpf = new javax.swing.JPasswordField();
        pb1 = new javax.swing.JProgressBar();
        CLOSE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        showbtn = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DiYata Hotel");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 768));
        jPanel1.setLayout(null);

        usertf.setBackground(new java.awt.Color(255, 255, 255));
        usertf.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        usertf.setForeground(new java.awt.Color(0, 0, 0));
        usertf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usertf.setText("USERNAME");
        usertf.setBorder(null);
        usertf.setCaretColor(new java.awt.Color(255, 255, 255));
        usertf.setName(""); // NOI18N
        usertf.setPreferredSize(new java.awt.Dimension(1000, 1000));
        usertf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usertfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usertfFocusLost(evt);
            }
        });
        usertf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usertfKeyPressed(evt);
            }
        });
        jPanel1.add(usertf);
        usertf.setBounds(990, 200, 280, 50);

        passpf.setBackground(new java.awt.Color(255, 255, 255));
        passpf.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        passpf.setForeground(new java.awt.Color(0, 0, 0));
        passpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passpf.setText("PASSWORD");
        passpf.setBorder(null);
        passpf.setPreferredSize(new java.awt.Dimension(1000, 1000));
        passpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passpfFocusLost(evt);
            }
        });
        passpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passpfKeyPressed(evt);
            }
        });
        jPanel1.add(passpf);
        passpf.setBounds(990, 300, 280, 50);

        pb1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(pb1);
        pb1.setBounds(910, 620, 400, 30);

        CLOSE.setBackground(new java.awt.Color(204, 0, 0));
        CLOSE.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(0, 0, 0));
        CLOSE.setText("CLOSE APP");
        CLOSE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        jPanel1.add(CLOSE);
        CLOSE.setBounds(1010, 520, 200, 50);

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("LOGIN");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1010, 410, 200, 50);

        showbtn.setBackground(new java.awt.Color(0, 0, 0));
        showbtn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });
        jPanel1.add(showbtn);
        showbtn.setBounds(1280, 300, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 860, 900);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(880, 210, 110, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(880, 310, 110, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(990, 110, 240, 70);

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
    public void superlogin(){
        pb1.setVisible(true);
        jButton1.setEnabled(false);
        usertf.setEditable(false);
        passpf.setEditable(false);
        Timer tmr = new Timer(5, new ActionListener() {
                    int progress = 0;
                    public void actionPerformed(ActionEvent e) {
                        progress++;
                        pb1.setString(Integer.toString(progress)+"%");
                        pb1.setValue(progress);
                        if (progress == 101) {
                            ((Timer)e.getSource()).stop();
                            new Dash_admin().setVisible(true);
                            dispose();
                        }
                    }
                });
        tmr.start();
    }
    public void endlogin(){
        pb1.setVisible(true);
        jButton1.setEnabled(false);
        usertf.setEditable(false);
        passpf.setEditable(false);
        Timer tmr = new Timer(5, new ActionListener() {
                    int progress = 0;
                    public void actionPerformed(ActionEvent e) {
                        progress++;
                        pb1.setString(Integer.toString(progress)+"%");
                        pb1.setValue(progress);
                        if (progress == 101) {
                            ((Timer)e.getSource()).stop();
                            new Dash_reception().setVisible(true);
                            dispose();
                        }
                    }
                });
        tmr.start();
    }
    public void verify(String user, String pass){
        if (!loginAttempted) {
            loginAttempted = true;
            if (pass.length() < 6) {
                JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long.");
                return;
            }
            String selectQuery = "SELECT * FROM `accounts table` WHERE username = ? AND password = ?";
            try (PreparedStatement selectStatement = netvince.diyatahotel.connect.getConnection().prepareStatement(selectQuery)) {
            selectStatement.setString(1, user);
            selectStatement.setString(2, pass);
                try (ResultSet resultSet = selectStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // Login successful logic
                        endlogin();
                    } else {
                        // Login failed logic
                        attempts--;
                        if (attempts > 0) {
                            JOptionPane.showMessageDialog(null, "Invalid Username or Password. Remaining attempts: " + attempts);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Max login attempts reached. Exiting application.");
                            System.exit(0);
                        }
                    }
                }
                catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Error occurred while executing query: ");
                                System.out.println("Error occurred while executing query: " + e.getMessage());
                                e.printStackTrace();
                }
            }
            catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Database connection error: ");
                        System.out.println("Database connection error: " + e.getMessage());
                        e.printStackTrace();
            }
        }
    }
    private void usertfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usertfFocusGained
        // TODO add your handling code here:
        if(usertf.getText().equals("USERNAME")){
            usertf.setText("");
        }
    }//GEN-LAST:event_usertfFocusGained

    private void usertfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usertfFocusLost
        // TODO add your handling code here:
        if(usertf.getText().isEmpty()){
            usertf.setText("USERNAME");
        }
    }//GEN-LAST:event_usertfFocusLost

    private void passpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passpfFocusGained
        // TODO add your handling code here:
        if(passpf.getText().equals("PASSWORD")){
            passpf.setEchoChar('•');
            passpf.setText("");
            showbtn.setSelected(false);
        }
    }//GEN-LAST:event_passpfFocusGained

    private void passpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passpfFocusLost
        // TODO add your handling code here:
        if(passpf.getText().isEmpty()){
            passpf.setText("PASSWORD");
            passpf.setEchoChar((char)0);
            showbtn.setSelected(false);
        }
    }//GEN-LAST:event_passpfFocusLost
public void login(){
    String user = usertf.getText();
    String pass = passpf.getText();
        if (user.equals("USERNAME")||pass.equals("PASSWORD")) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields","Invalid Input",DO_NOTHING_ON_CLOSE);
        }
        else if(user.equals(superuser)&&pass.equals(superuser)){
            superlogin();
        }
        else{
            verify(user,pass);
            receipt_function.login_name = user;
        }
        loginAttempted = false;
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passpfKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_passpfKeyPressed

    private void usertfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertfKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_usertfKeyPressed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed
        // TODO add your handling code here:
        if (showbtn.isSelected()) {
            passpf.setEchoChar((char)0);
        }
        else {
            if(!passpf.getText().equals("PASSWORD")){
                passpf.setEchoChar('•');
                showbtn.setSelected(false);
            }
        }
    }//GEN-LAST:event_showbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passpf;
    private javax.swing.JProgressBar pb1;
    private javax.swing.JToggleButton showbtn;
    private javax.swing.JTextField usertf;
    // End of variables declaration//GEN-END:variables
}
