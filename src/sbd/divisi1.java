/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author katsuro
 */
public class divisi1 extends javax.swing.JFrame {

    /**
     * Creates new form divisi1
     */
    public divisi1() {
        initComponents();
        comboKaryawan();
        
    }
    
    private void comboKaryawan(){
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
                String id1= rs.getString("Nama");
                comboKaryawan.addItem(id+" || "+id1);
                
            }

            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IDDivisi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        input = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Bidang = new javax.swing.JTextField();
        comboKaryawan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Input Divisi");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(97, 212, 195));
        jLabel2.setText("DIVISI");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("ID Divisi");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 20));

        IDDivisi.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel2.add(IDDivisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 110, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Nama");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 50, 20));

        Nama.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel2.add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 140, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("ID Karyawan");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, 30));

        input.setBackground(new java.awt.Color(36, 47, 65));
        input.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        input.setForeground(new java.awt.Color(255, 255, 255));
        input.setText("INPUT");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        jPanel2.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 70, 40));

        clear.setBackground(new java.awt.Color(36, 47, 65));
        clear.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 70, 40));

        close.setBackground(new java.awt.Color(36, 47, 65));
        close.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("CLOSE");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 70, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Bidang");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 50, 20));

        Bidang.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel2.add(Bidang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, -1));

        jPanel2.add(comboKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 140, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("DIV");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 30, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setText("INPUT");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        try{
            if(comboKaryawan.getSelectedIndex()==0){
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query = "insert into Divisi(IDDivisi,NamaDivisi,Bidang,IDKaryawan) values(?,?,?, NULLIF('',''))";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "DIV"+IDDivisi.getText());
            pst.setString(2, Nama.getText());
            pst.setString(3, Bidang.getText());
            
            pst.executeUpdate();
            }
            else if(comboKaryawan.getSelectedIndex()!=0){
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query = "insert into Divisi(IDDivisi,NamaDivisi,Bidang,IDKaryawan) values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "DIV"+IDDivisi.getText());
            pst.setString(2, Nama.getText());
            pst.setString(3, Bidang.getText());
            pst.setString(4, comboKaryawan.getSelectedItem().toString().substring(0, 5));
            pst.executeUpdate();
            }
            
            
            
            
            
            
            dispose();
            JOptionPane.showMessageDialog(null, "Saved");
            
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }//GEN-LAST:event_inputActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       IDDivisi.setText("");
       Nama.setText("");
       Bidang.setText("");
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
            java.util.logging.Logger.getLogger(divisi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(divisi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(divisi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(divisi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new divisi1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bidang;
    private javax.swing.JTextField IDDivisi;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JComboBox<String> comboKaryawan;
    private javax.swing.JButton input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
