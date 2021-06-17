package dentist;

import java.sql.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class SignIn extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement Pst, Pst1 = null;
    ResultSet Rs, Rs1 = null;
    public SignIn() {
        initComponents();
        String underline = "<html><u>Create your account</u></html>";
        String underline2 = "<html><u>Forgot your password?<u></html>";
        jLabel6.setText(underline);
        jLabel4.setText(underline2);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("CastroSignup.png")));
        this.getContentPane().setBackground(Color.WHITE); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teeth = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        LogIn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Castro Clinic");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(530, 385));
        setResizable(false);
        setSize(new java.awt.Dimension(530, 385));

        teeth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentist/image/teeth.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel1.setText("LOGIN");

        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("EMAIL ADDRESS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("PASSWORD");

        Pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Forgot your password?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        LogIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LogIn.setForeground(new java.awt.Color(255, 255, 255));
        LogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentist/image/gradient.png"))); // NOI18N
        LogIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogInMouseExited(evt);
            }
        });
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        LogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LogInKeyPressed(evt);
            }
        });

        jLabel5.setText("Not a member yet?");

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Create your account");
        jLabel6.setToolTipText("");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(teeth, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teeth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(546, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
   
    }//GEN-LAST:event_EmailActionPerformed

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        con = (Connection) SqlConn.ConnectDB();
        String Sql = "Select * from login where Email=? and Password=?";
        Homepage home = new Homepage();
        AdminAccess admin = new AdminAccess();
            try{
                Pst = con.prepareStatement(Sql);
                Pst.setString(1, Email.getText());
                Pst.setString(2, Pass.getText());
                Rs = Pst.executeQuery();
                if (Email.getText().equals("") || Pass.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter Complete Details", "Access Denied", JOptionPane.ERROR_MESSAGE);
                }
                else if (Email.getText().equals("1") && Pass.getText().equals("1")){
                    String Sql1 = "Select * From appointment";
                    try{ 
                        Pst = con.prepareStatement(Sql1);
                        Rs = Pst.executeQuery();
                        DefaultTableModel tm = (DefaultTableModel)admin.AdminTable.getModel();
                        tm.setRowCount(0);  
                        while(Rs.next()){
                            Object o[] = {Rs.getString("ID"), Rs.getString("Name"), Rs.getString("Date"), Rs.getString("Time"), Rs.getString("Service"), Rs.getString("Concern")};
                            tm.addRow(o);
                        }
                        admin.setVisible(true);
                        dispose();   
                        Pst.close();
                        Rs.close();
                    }
                catch(Exception e){
            
                }
                }
                else if (Rs.next()){
                    String Ln = Rs.getString("LastN"); 
                    String Fn = Rs.getString("FirstN");
                    home.setVisible(true);  
                    dispose();
                    home.Welcome.setText("WELCOME, " + Ln);
                    home.FN.setText(Fn+" "+Ln); 
                    Email.setText("");
                    Pass.setText("");
                    
                    String Sql1 = "Select count(*) as totalCount From appointment where Name like '%"+ Fn +"%'";
                    Pst1 = con.prepareStatement(Sql1);
                    Rs1 = Pst1.executeQuery();
                    if(Rs1.next()){ 
                        int count = Rs1.getInt("totalCount");
                        home.appointments.setText("You have " + count + " appointments");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong Email or Password", "Access Denied", JOptionPane.ERROR_MESSAGE);
                    Email.setText("");
                    Pass.setText("");
            }
            }catch(Exception e){
            JOptionPane.showMessageDialog(null , e);     
            }
            finally {
        if(Rs != null){
             try{
                  Rs.close();
             } catch(Exception e){
                 e.printStackTrace();
             }
        }
        if(Pst != null){
            try{
                Pst.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        if(Pst1 != null){
            try{
                Pst1.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        }
    }//GEN-LAST:event_LogInActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        SignUp sign = new SignUp();
        sign.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void LogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LogInKeyPressed
        
    }//GEN-LAST:event_LogInKeyPressed

    private void PassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            con = (Connection) SqlConn.ConnectDB();
            String Sql = "Select * from login where Email=? and Password=?";
            Homepage home = new Homepage();
            AdminAccess admin = new AdminAccess();
            try{
                Pst = con.prepareStatement(Sql);
                Pst.setString(1, Email.getText());
                Pst.setString(2, Pass.getText());
                Rs = Pst.executeQuery();
                if (Email.getText().equals("") || Pass.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter Complete Details", "Access Denied", JOptionPane.ERROR_MESSAGE);
                }
                else if (Email.getText().equals("1") && Pass.getText().equals("1")){
                    String Sql1 = "Select * From appointment";
                    try{ 
                        Pst = con.prepareStatement(Sql1);
                        Rs = Pst.executeQuery();
                        DefaultTableModel tm = (DefaultTableModel)admin.AdminTable.getModel();
                        tm.setRowCount(0);  
                        while(Rs.next()){
                            Object o[] = {Rs.getString("ID"), Rs.getString("Name"), Rs.getString("Date"), Rs.getString("Time"), Rs.getString("Service"), Rs.getString("Concern")};
                            tm.addRow(o);
                        }
                        admin.setVisible(true);
                        dispose();   
                        Pst.close();
                        Rs.close();
                    }
                catch(Exception e){
            
                }
                }
                else if (Rs.next()){
                    String Ln = Rs.getString("LastN"); 
                    String Fn = Rs.getString("FirstN");
                    home.setVisible(true);  
                    dispose();
                    home.Welcome.setText("WELCOME, " + Ln);
                    home.FN.setText(Fn+" "+Ln); 
                    Email.setText("");
                    Pass.setText("");
                    String Sql1 = "Select count(*) as totalCount From appointment where Name like '%"+ Fn +"%'";
                    Pst1 = con.prepareStatement(Sql1);
                    Rs1 = Pst1.executeQuery();
                    if(Rs1.next()){ 
                        int count = Rs1.getInt("totalCount");
                        home.appointments.setText("You have " + count + " appointments");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong Email or Password", "Access Denied", JOptionPane.ERROR_MESSAGE);
                    Email.setText("");
                    Pass.setText("");
            }
            }catch(Exception e){
            JOptionPane.showMessageDialog(null , e);     
            }
            finally {
        if(Rs != null){
             try{
                  Rs.close();
             } catch(Exception e){
                 e.printStackTrace();
             }
        }
        if(Pst != null){
            try{
                Pst.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        if(Pst1 != null){
            try{
                Pst1.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        if(Rs1 != null){
            try{
                Rs1.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
            }
        }
    }//GEN-LAST:event_PassKeyPressed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel6MouseExited

    private void LogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_LogInMouseEntered

    private void LogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_LogInMouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel4MouseExited

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Email;
    private javax.swing.JButton LogIn;
    public javax.swing.JPasswordField Pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel teeth;
    // End of variables declaration//GEN-END:variables

    private void setPreferredSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
