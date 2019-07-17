
package sbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class karyawan1 extends javax.swing.JFrame {

    
    public karyawan1() {
        initComponents();
        keahlian();
        Divisi();
        karyawan();
       
    }
    private void keahlian(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="select * from Keahlian";
            PreparedStatement pst =con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            keahlian.addItem(null);
            while(rs.next()){
                String id = rs.getString("IDKeahlian");
                String name=rs.getString("NamaKeahlian");
                keahlian.addItem(id+" || "+name);
                
                
            }

            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }
    private void Divisi(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="select * from Divisi";
            PreparedStatement pst =con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            divisiP.addItem(null);
            divisiS.addItem(null);
            while(rs.next()){
                String id = rs.getString("IDDivisi");
                String name=rs.getString("NamaDivisi");
                
                divisiP.addItem(id+" || "+name);
                divisiS.addItem(id+" || "+name);
                
            }

            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }
     private void karyawan(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="select *  from Karyawan";
            PreparedStatement pst =con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            supervisior.addItem(null);
            while(rs.next()){
                String id = rs.getString("IDKaryawan");
                String name=rs.getString("Nama");
                supervisior.addItem(id+" || "+name);
                
            }

            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        divisiP = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        supervisior = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        divisiS = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        tgl = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        keahlian = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Input Karyawan");
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(97, 212, 195));
        jLabel2.setText("KARYAWAN");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        id.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel6.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 120, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Nama");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        nama.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel6.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 150, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Alamat");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        alamat.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel6.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 150, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Tgl Lahir");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Keahlian");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("D. Pengawas");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jPanel6.add(divisiP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 150, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Supervisor");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jPanel6.add(supervisior, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 150, 20));

        jButton1.setBackground(new java.awt.Color(36, 47, 65));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INPUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 70, 40));

        jButton2.setBackground(new java.awt.Color(36, 47, 65));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 70, 40));

        jButton3.setBackground(new java.awt.Color(36, 47, 65));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 70, 40));

        jPanel6.add(divisiS, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 150, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Divisi");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));
        jPanel6.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 150, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("KR");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jPanel6.add(keahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 150, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setText("INPUT");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("ID Karyawan");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        id.setText(null);
        nama.setText(null);
        alamat.setText(null);
        supervisior.setSelectedIndex(0);
        divisiP.setSelectedIndex(0);
        divisiS.setSelectedIndex(0);
        keahlian.setSelectedIndex(0);
        tgl.setDate(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            if(keahlian.getSelectedIndex()==0){
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="insert into Karyawan(IDKaryawan,Nama,Alamat,TglLahir,IDKeahlian,IDDivisiP,IDDivisiS,IDKaryawanS) "
                    + "values (?,?,?,?,NULLIF('',''),?,?,?)";
            PreparedStatement pst =con.prepareStatement(query);
            
            pst.setString(1, "KR"+id.getText());
            pst.setString(2, nama.getText());
            pst.setString(3, alamat.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(4, sdf.format(tgl.getDate()));
            //pst.setString(5, keahlian.getSelectedItem().toString().substring(0,4));
            pst.setString(6, divisiP.getSelectedItem().toString().substring(0, 6));
            pst.setString(7,divisiS.getSelectedItem().toString().substring(0, 6));
            pst.setString(8, supervisior.getSelectedItem().toString().substring(0, 5));
            
            
            
           
            pst.executeUpdate();
            }
            else if(keahlian.getSelectedIndex()==0&&divisiP.getSelectedIndex()==0){
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="insert into Karyawan(IDKaryawan,Nama,Alamat,TglLahir,IDKeahlian,IDDivisiP,IDDivisiS,IDKaryawanS) "
                    + "values (?,?,?,?,NULLIF('',''),NULLIF('',''),?,?)";
            PreparedStatement pst =con.prepareStatement(query);
            
            pst.setString(1, "KR"+id.getText());
            pst.setString(2, nama.getText());
            pst.setString(3, alamat.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(4, sdf.format(tgl.getDate()));
            //pst.setString(5, keahlian.getSelectedItem().toString().substring(0,4));
            //pst.setString(6, divisiP.getSelectedItem().toString().substring(0, 6));
            pst.setString(7,divisiS.getSelectedItem().toString().substring(0, 6));
            pst.setString(8, supervisior.getSelectedItem().toString().substring(0, 5));
            
            }
            else if(keahlian.getSelectedIndex()==0&&divisiS.getSelectedIndex()==0){
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="insert into Karyawan(IDKaryawan,Nama,Alamat,TglLahir,IDKeahlian,IDDivisiP,IDDivisiS,IDKaryawanS) "
                    + "values (?,?,?,?,NULLIF('',''),?,NULLIF('',''),?)";
            PreparedStatement pst =con.prepareStatement(query);
            
            pst.setString(1, "KR"+id.getText());
            pst.setString(2, nama.getText());
            pst.setString(3, alamat.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(4, sdf.format(tgl.getDate()));
            //pst.setString(5, keahlian.getSelectedItem().toString().substring(0,4));
            pst.setString(6, divisiP.getSelectedItem().toString().substring(0, 6));
            //pst.setString(7,divisiS.getSelectedItem().toString().substring(0, 6));
            pst.setString(8, supervisior.getSelectedItem().toString().substring(0, 5));
            
            }
            else if(keahlian.getSelectedIndex()==0&&supervisior.getSelectedIndex()==0){
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="insert into Karyawan(IDKaryawan,Nama,Alamat,TglLahir,IDKeahlian,IDDivisiP,IDDivisiS,IDKaryawanS) "
                    + "values (?,?,?,?,NULLIF('',''),?,?,NULLIF('',''))";
            PreparedStatement pst =con.prepareStatement(query);
            
            pst.setString(1, "KR"+id.getText());
            pst.setString(2, nama.getText());
            pst.setString(3, alamat.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(4, sdf.format(tgl.getDate()));
            //pst.setString(5, keahlian.getSelectedItem().toString().substring(0,4));
            pst.setString(6, divisiP.getSelectedItem().toString().substring(0, 6));
            pst.setString(7,divisiS.getSelectedItem().toString().substring(0, 6));
            //pst.setString(8, supervisior.getSelectedItem().toString().substring(0, 5));
            
            }
            else if(keahlian.getSelectedIndex()==0&&supervisior.getSelectedIndex()==0
                     && divisiS.getSelectedIndex()==0&&divisiP.getSelectedIndex()==0){
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="insert into Karyawan(IDKaryawan,Nama,Alamat,TglLahir,IDKeahlian,IDDivisiP,IDDivisiS,IDKaryawanS) "
                    + "values (?,?,?,?,NULLIF('',''),NULLIF('',''),NULLIF('',''),NULLIF('',''))";
            PreparedStatement pst =con.prepareStatement(query);
            
            pst.setString(1, "KR"+id.getText());
            pst.setString(2, nama.getText());
            pst.setString(3, alamat.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(4, sdf.format(tgl.getDate()));
            //pst.setString(5, keahlian.getSelectedItem().toString().substring(0,4));
            //pst.setString(6, divisiP.getSelectedItem().toString().substring(0, 6));
            //pst.setString(7,divisiS.getSelectedItem().toString().substring(0, 6));
            //pst.setString(8, supervisior.getSelectedItem().toString().substring(0, 5));
            
            }
            else if(keahlian.getSelectedIndex()!=0&&supervisior.getSelectedIndex()!=0
                     && divisiS.getSelectedIndex()!=0&&divisiP.getSelectedIndex()!=0){
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="insert into Karyawan(IDKaryawan,Nama,Alamat,TglLahir,IDKeahlian,IDDivisiP,IDDivisiS,IDKaryawanS) "
                    + "values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst =con.prepareStatement(query);
            
            pst.setString(1, "KR"+id.getText());
            pst.setString(2, nama.getText());
            pst.setString(3, alamat.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(4, sdf.format(tgl.getDate()));
            pst.setString(5, keahlian.getSelectedItem().toString().substring(0,4));
            pst.setString(6, divisiP.getSelectedItem().toString().substring(0, 6));
            pst.setString(7,divisiS.getSelectedItem().toString().substring(0, 6));
            pst.setString(8, supervisior.getSelectedItem().toString().substring(0, 5));
            
            
            
           
            pst.executeUpdate();
            }


            
            dispose();
            JOptionPane.showMessageDialog(null, "Saved");
            
            
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(karyawan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JComboBox<String> divisiP;
    private javax.swing.JComboBox<String> divisiS;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> keahlian;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> supervisior;
    private com.toedter.calendar.JDateChooser tgl;
    // End of variables declaration//GEN-END:variables
}
