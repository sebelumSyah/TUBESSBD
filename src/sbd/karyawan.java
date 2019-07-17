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
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sbd.karyawan1;
/**
 *
 * @author shafira
 */
public class karyawan extends javax.swing.JPanel {

    public karyawan() {
        initComponents();
        showTabel();
        comboKaryawan();
        comboDivisi();
        comboKeahlian();
    }
    private void comboKaryawan(){
        try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query= "select * from Karyawan";  
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            editSupervisor.addItem("");
            while(rs.next()){
                String id=rs.getString("IDKaryawan");
                editSupervisor.addItem(id);
            }
         
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }

}
    private void comboDivisi(){
        try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query= "select * from Divisi";  
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            editDivisiP.addItem("");
            editDivisiS.addItem("");
            while(rs.next()){
                String id=rs.getString("IDDivisi");
                editDivisiP.addItem(id);
                editDivisiS.addItem(id);
            }
         
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }

}
    private void comboKeahlian(){
        try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query= "select * from Keahlian";  
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            
            editKeahlian.addItem("");
            while(rs.next()){
                String id=rs.getString("IDKeahlian");
                editKeahlian.addItem(id);
            }
         
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }

}
       public ArrayList<listKaryawan> listKaryawan (){
           ArrayList<listKaryawan> listTabelKaryawan = new ArrayList<>();
    
    try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            
            String query= "select * from Karyawan";
                    
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            listKaryawan list;
            while(rs.next()){
                list = new listKaryawan(rs.getString("IDKaryawan"),rs.getString("Nama"),rs.getString("Alamat"),
                                       rs.getString("TglLahir"),rs.getString("IDkeahlian"),rs.getString("IDDivisiP"),rs.getString("IDDivisiS"),
                                       rs.getString("IDKaryawanS"));
                listTabelKaryawan.add(list);
            }
            
            
   }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
    return listTabelKaryawan;
    }
    public void showTabel(){
        ArrayList<listKaryawan> list= listKaryawan ();
        DefaultTableModel  model = (DefaultTableModel)tabelKaryawan.getModel();
        Object [] row = new Object[9];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getIDKaryawan();
            row[1]=list.get(i).getNama();
            row[2]=list.get(i).getAlamat();
            row[3]=list.get(i).getTglLahir();
            row[4]=list.get(i).getIDKeahlian();
            row[5]=list.get(i).getIDDivisiP();
            row[6]=list.get(i).getIDDivisiS();
            row[7]=list.get(i).getIDKaryawanS();
           
            
            model.addRow(row);
        }
    }
    private String ambilTabel(int row,int col){
        return tabelKaryawan.getModel().getValueAt(row, col).toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKaryawan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        editIDKaryawan = new javax.swing.JTextField();
        editAlamat = new javax.swing.JTextField();
        editNama = new javax.swing.JTextField();
        editSupervisor = new javax.swing.JComboBox<>();
        editKeahlian = new javax.swing.JComboBox<>();
        editDivisiP = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        editTanggalLahir = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        editDivisiS = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setText("Karyawan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        tabelKaryawan.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabelKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Karyawan", "Nama", "Alamat", "Tgl Lahir", "Keahlian", " Menempati Divisi", "Div Pengawas", "Supervisior"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKaryawan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 760, 188));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("EDIT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Supervisor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 70, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("KR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 40, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Alamat");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 50, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Nama");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 50, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Tgl Lahir");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Keahlian");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Divisi");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        editIDKaryawan.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editIDKaryawan.setEnabled(false);
        jPanel1.add(editIDKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 90, -1));

        editAlamat.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editAlamat.setEnabled(false);
        jPanel1.add(editAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 120, -1));

        editNama.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editNama.setEnabled(false);
        jPanel1.add(editNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 120, -1));

        editSupervisor.setEnabled(false);
        jPanel1.add(editSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 90, -1));

        editKeahlian.setEnabled(false);
        jPanel1.add(editKeahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 90, 20));

        editDivisiP.setEnabled(false);
        jPanel1.add(editDivisiP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 90, -1));

        jButton1.setBackground(new java.awt.Color(36, 47, 65));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 90, 30));

        jButton2.setBackground(new java.awt.Color(36, 47, 65));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 80, 30));

        jButton3.setBackground(new java.awt.Color(36, 47, 65));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 90, 30));

        jButton4.setBackground(new java.awt.Color(36, 47, 65));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("INPUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 90, 30));

        editTanggalLahir.setEnabled(false);
        jPanel1.add(editTanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 120, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("D. Pengawas");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 90, -1));

        editDivisiS.setEnabled(false);
        jPanel1.add(editDivisiS, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 90, -1));

        jButton5.setBackground(new java.awt.Color(36, 47, 65));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 90, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("ID Karyawan");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        karyawan1 s = new karyawan1();
        s.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel  model = (DefaultTableModel)tabelKaryawan.getModel();
        model.setRowCount(0);
        showTabel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKaryawanMouseClicked
        int row = tabelKaryawan.getSelectedRow();
        for(int i=0 ;i<9;i++){
            if (i==0){
                StringBuilder a= new StringBuilder(ambilTabel(row,i).toString());
                editIDKaryawan.setText(a.delete(0, 2).toString());
            }
            else if(i==1){
                editNama.setText(ambilTabel(row,i));
            }
            else if(i==2){
                editAlamat.setText(ambilTabel(row,i));
            }
            else if(i==3){
                try {
                String value =tabelKaryawan.getValueAt(row, i).toString();
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                    editTanggalLahir.setDate(date.parse(value));
                } catch (ParseException ex) {
                    
                }
            }
            else if(i==4){
                editKeahlian.setSelectedItem(ambilTabel(row,i));
            }
            else if(i==5){
                editDivisiP.setSelectedItem(ambilTabel(row,i));
            }
            else if(i==6){
                editDivisiS.setSelectedItem(ambilTabel(row,i));
            }
            
            else if(i==7){
                editSupervisor.setSelectedItem(ambilTabel(row,i));
            }
            
        }
    }//GEN-LAST:event_tabelKaryawanMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editNama.setEnabled(true);
        editIDKaryawan.setEnabled(true);
        editAlamat.setEnabled(true);
        editTanggalLahir.setEnabled(true);
        editKeahlian.setEnabled(true);
        editDivisiP.setEnabled(true);
        editDivisiS.setEnabled(true);
        
        editSupervisor.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            int row= tabelKaryawan.getSelectedRow();
            String kata= tabelKaryawan.getModel().getValueAt(row, 0).toString();
            String query ="update Karyawan "
                         + "set IDKaryawan=?, Nama=?, Alamat=?, TglLahir=?, IDKeahlian=?, IDDivisiP=?,IDDivisiS=?"
                         + ", IDKaryawanS=?"
                         + " where "
                         + " IDKaryawan="+"'"+kata+"'";
            PreparedStatement pst =con.prepareStatement(query);
            pst.setString(1, "KR"+editIDKaryawan.getText());
            pst.setString(2, editNama.getText());
            pst.setString(3, editAlamat.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(4, sdf.format(editTanggalLahir.getDate()));
            pst.setString(5, editKeahlian.getSelectedItem().toString());
            pst.setString(6, editDivisiP.getSelectedItem().toString());
            pst.setString(7,editDivisiS.getSelectedItem().toString());
            pst.setString(8, editSupervisor.getSelectedItem().toString());
            
            
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update");
            
            
            
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            int row= tabelKaryawan.getSelectedRow();
            String kata= tabelKaryawan.getModel().getValueAt(row, 0).toString();
            String query="delete from Karyawan where IDKaryawan="+"'"+kata+"'";
            PreparedStatement pst =con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Succes");
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editAlamat;
    private javax.swing.JComboBox<String> editDivisiP;
    private javax.swing.JComboBox<String> editDivisiS;
    private javax.swing.JTextField editIDKaryawan;
    private javax.swing.JComboBox<String> editKeahlian;
    private javax.swing.JTextField editNama;
    private javax.swing.JComboBox<String> editSupervisor;
    private com.toedter.calendar.JDateChooser editTanggalLahir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelKaryawan;
    // End of variables declaration//GEN-END:variables
}
