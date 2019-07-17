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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shafira
 */
public class Gaji2 extends javax.swing.JPanel {

    /**
     * Creates new form Gaji2
     */
    public Gaji2() {
        initComponents();
        showTabel();
        tampilGajiBesar();
        tampilGajiKecil();
        tampilGajiAVG();
        tampilGajiSUM();
    }
    public ArrayList<listKaryawan> listTabelGaji (){
           ArrayList<listKaryawan> listTabelGaji = new ArrayList<>();
    
    try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=firmans0719";
            Connection con = DriverManager.getConnection(url);
            
            String query= "select Karyawan.IDKaryawan, Karyawan.Nama, Pangkat.Gaji " +
                          " from Karyawan, Pangkat, Berpangkat " +
                          " where Berpangkat.IDKaryawan=Karyawan.IDKaryawan "
                          + "and Berpangkat.IDPangkat=Pangkat.IDPangkat";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            listKaryawan list;
            while(rs.next()){
                list = new listKaryawan(rs.getString("IDKaryawan"),rs.getString("Nama"),rs.getInt("Gaji"));
                listTabelGaji.add(list);
            }
            
            
   }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
    return listTabelGaji;
    
    }
    
    public void showTabel(){
        ArrayList<listKaryawan> list= listTabelGaji ();
        DefaultTableModel  model = (DefaultTableModel)listGaji.getModel();
        Object [] row = new Object[3];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getIDKaryawan();
            row[1]=list.get(i).getNama();
            row[2]=list.get(i).getGaji();
            
            
            model.addRow(row);
        }
    }
    public void tampilGajiBesar(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="select MAX(Gaji) " +
                          " from Karyawan, Pangkat, Berpangkat " +
                          " where Berpangkat.IDKaryawan=Karyawan.IDKaryawan "
                          + "and Berpangkat.IDPangkat=Pangkat.IDPangkat";
            PreparedStatement pst =con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                int a= rs.getInt(1);
                maxGJ.setText(String.valueOf(a));
                
            }
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
        
    }
    public void tampilGajiKecil(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=firmans0719";
            Connection con = DriverManager.getConnection(url);
            String query ="select MIN(Gaji)  " +
                          " from Karyawan, Pangkat, Berpangkat " +
                          " where Berpangkat.IDKaryawan=Karyawan.IDKaryawan "
                          + "and Berpangkat.IDPangkat=Pangkat.IDPangkat";
            PreparedStatement pst =con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                int a= rs.getInt(1);
                minGJ.setText(String.valueOf(a));
                
            }
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }}
        public void tampilGajiAVG(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=firmans0719";
            Connection con = DriverManager.getConnection(url);
            String query ="select AVG(Gaji)  " +
                          " from Karyawan, Pangkat, Berpangkat " +
                          " where Berpangkat.IDKaryawan=Karyawan.IDKaryawan "
                          + "and Berpangkat.IDPangkat=Pangkat.IDPangkat";
            PreparedStatement pst =con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                int a= rs.getInt(1);
                avgGaji.setText(String.valueOf(a));
                
            }
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
        
    }
         public void tampilGajiSUM(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=firmans0719";
            Connection con = DriverManager.getConnection(url);
            String query ="select SUM(Gaji)  " +
                          " from Karyawan, Pangkat, Berpangkat " +
                          " where Berpangkat.IDKaryawan=Karyawan.IDKaryawan "
                          + "and Berpangkat.IDPangkat=Pangkat.IDPangkat";
            PreparedStatement pst =con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                int a= rs.getInt(1);
                sumGJ.setText(String.valueOf(a));
                
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listGaji = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sumGJ = new javax.swing.JTextField();
        maxGJ = new javax.swing.JTextField();
        minGJ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        avgGaji = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setText("Data Gaji Karyawan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        listGaji.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        listGaji.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Karyawan", "Nama", "Gaji"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listGaji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listGajiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listGaji);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 660, 180));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setText("Gaji Rata-rata");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 120, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setText("Gaji Terbesar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 70, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setText("Gaji Terkecil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 90, 20));

        sumGJ.setEditable(false);
        sumGJ.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jPanel1.add(sumGJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 140, -1));

        maxGJ.setEditable(false);
        maxGJ.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jPanel1.add(maxGJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 140, -1));

        minGJ.setEditable(false);
        minGJ.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jPanel1.add(minGJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 140, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setText("Urutkan Gaji ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 290, 80, 20));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kecil-Besar", "Besar-Kecil", "Acak" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 180, -1));

        jButton1.setBackground(new java.awt.Color(36, 47, 65));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 330, 80, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setText("Jumlah Gaji ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        avgGaji.setEditable(false);
        avgGaji.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jPanel1.add(avgGaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listGajiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listGajiMouseClicked
        
    }//GEN-LAST:event_listGajiMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avgGaji;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listGaji;
    private javax.swing.JTextField maxGJ;
    private javax.swing.JTextField minGJ;
    private javax.swing.JTextField sumGJ;
    // End of variables declaration//GEN-END:variables
}
