/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author katsuro
 */
public class berpang1 extends javax.swing.JFrame {

    /**
     * Creates new form berpang1
     */
    public berpang1() {
        initComponents();
        comboIDPangkat();
        comboIDKaryawan();
    }

    private void comboIDPangkat(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="select * from Pangkat";
            PreparedStatement pst =con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            comboPangkat.addItem("");
            while(rs.next()){
                String id = rs.getString("IDPangkat");
                String name=rs.getString("NamaKepangkatan");
                comboPangkat.addItem(id+" || "+name);
                
            }

            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }
    private void comboIDKaryawan(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="select * from Karyawan";
            PreparedStatement pst =con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            comboKaryawan.addItem("");
            while(rs.next()){
                String id = rs.getString("IDKaryawan");
                String id1=rs.getString("Nama");
                comboKaryawan.addItem(id+" || "+id1);
                
            }

            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboPangkat = new javax.swing.JComboBox<>();
        comboKaryawan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        close = new javax.swing.JButton();
        tglJabat = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Input Data Berpangkat");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(97, 212, 195));
        jLabel2.setText("BERPANGKAT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 230, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("ID Pangkat");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 130, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("ID Karyawan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 30));

        jPanel1.add(comboPangkat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 30));

        jPanel1.add(comboKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Tanggal Jabat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 30));

        jButton1.setBackground(new java.awt.Color(36, 47, 65));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INPUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel9.setText("INPUT");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 40));

        clear.setBackground(new java.awt.Color(36, 47, 65));
        clear.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 70, 40));

        close.setBackground(new java.awt.Color(36, 47, 65));
        close.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("CLOSE");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 70, 40));
        jPanel1.add(tglJabat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="insert into Berpangkat values (?,?,?)";
            PreparedStatement pst =con.prepareStatement(query);
            
            String comboKar = comboKaryawan.getSelectedItem().toString().substring(0, 5);
            pst.setString(1,comboKar);
            String comboPang= comboPangkat.getSelectedItem().toString().substring(0,4);
            pst.setString(2, comboPang);
            
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(3, sdf.format(tglJabat.getDate()));
            
            pst.executeUpdate();
            dispose();
            JOptionPane.showMessageDialog(null, "Saved");
            
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        comboPangkat.setSelectedIndex(0);
        comboKaryawan.setSelectedIndex(0);
    }//GEN-LAST:event_clearActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose();
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(berpang1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(berpang1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(berpang1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(berpang1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new berpang1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JComboBox<String> comboKaryawan;
    private javax.swing.JComboBox<String> comboPangkat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser tglJabat;
    // End of variables declaration//GEN-END:variables
}
