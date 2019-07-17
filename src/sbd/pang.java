
package sbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import sbd.pang1;

public class pang extends javax.swing.JPanel {

    public pang() {
        initComponents();
        showTabelPangkat();
    }
    public ArrayList<listPangkat> listTabelPangkat(){
        ArrayList<listPangkat> listTabelPangkat = new ArrayList<>();
       try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query= "select * from Pangkat";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            listPangkat list;
            while(rs.next()){
                list= new listPangkat(rs.getString("IDPangkat"),rs.getString("NamaKepangkatan"),
                                       rs.getString("Keterangan"),rs.getInt("Gaji"));
                listTabelPangkat.add(list);
            }
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
    }
        return listTabelPangkat;
    }
    public void showTabelPangkat(){
        ArrayList<listPangkat> list1= listTabelPangkat();
        DefaultTableModel  model = (DefaultTableModel)tabelPangkat.getModel();
        Object [] row = new Object[4];
        for(int i=0; i<list1.size();i++){
             row[0]=list1.get(i).getIDPangkat();
             row[1]=list1.get(i).getNamaPangkat();
             row[2]=list1.get(i).getGaji();
             row[3]=list1.get(i).getKeterangan();
             model.addRow(row);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPangkat = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idPangkatT = new javax.swing.JTextField();
        keteranganT = new javax.swing.JTextField();
        namaPangkatT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gajiT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setText("Pangkat");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 180, 50));

        tabelPangkat.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabelPangkat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pangkat", "Nama Kepangkatan", "Gaji", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelPangkat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPangkatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPangkat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 700, 188));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("EDIT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 70, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("ID Pangkat");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Keterangan");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Nama K.pangkatan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        idPangkatT.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        idPangkatT.setEnabled(false);
        jPanel1.add(idPangkatT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 70, -1));

        keteranganT.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        keteranganT.setEnabled(false);
        jPanel1.add(keteranganT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 90, -1));

        namaPangkatT.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        namaPangkatT.setEnabled(false);
        jPanel1.add(namaPangkatT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 100, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Gaji");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        gajiT.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        gajiT.setEnabled(false);
        jPanel1.add(gajiT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 90, -1));

        jButton1.setBackground(new java.awt.Color(36, 47, 65));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 80, 30));

        jButton2.setBackground(new java.awt.Color(36, 47, 65));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 70, 30));

        jButton3.setBackground(new java.awt.Color(36, 47, 65));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 30));

        jButton4.setBackground(new java.awt.Color(36, 47, 65));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("INPUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 70, 30));

        jButton5.setBackground(new java.awt.Color(36, 47, 65));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("P");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       pang1 st = new pang1();
       st.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel  model = (DefaultTableModel)tabelPangkat.getModel();
        model.setRowCount(0);
        showTabelPangkat();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        idPangkatT.setEnabled(true);
        namaPangkatT.setEnabled(true);
        gajiT.setEnabled(true);
        keteranganT.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelPangkatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPangkatMouseClicked
        int angka = tabelPangkat.getSelectedRow();
        TableModel model = tabelPangkat.getModel();
        
        StringBuilder a=new StringBuilder(model.getValueAt(angka, 0).toString());
        idPangkatT.setText(a.delete(0, 1).toString());
        namaPangkatT.setText(model.getValueAt(angka, 1).toString());
        gajiT.setText(model.getValueAt(angka, 2).toString());
        keteranganT.setText(model.getValueAt(angka, 3).toString());
    }//GEN-LAST:event_tabelPangkatMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            
            int row =tabelPangkat.getSelectedRow();
            String value= "'"+tabelPangkat.getModel().getValueAt(row, 0).toString()+"'";
//          
            String query2 = "update Pangkat set IDPangkat=?,NamaKepangkatan =?,Keterangan=?,Gaji=? where IDPangkat="+value;
            
            
            PreparedStatement pst = con.prepareStatement(query2);
            pst.setString(1, "P"+idPangkatT.getText());
            pst.setString(2, namaPangkatT.getText());
            pst.setString(3, keteranganT.getText());
            pst.setString(4, gajiT.getText());
            pst.executeUpdate();
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
            
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            int row =tabelPangkat.getSelectedRow();
            String value= ( tabelPangkat.getModel().getValueAt(row, 0).toString());
            String vl="'"+value+"'";
           
            
            String queryy="delete from Pangkat where IDPangkat="+vl;
            
            PreparedStatement pst= con.prepareStatement(queryy);
            
            pst.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Delete Success");
            
            
            
            
            
            
             }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gajiT;
    private javax.swing.JTextField idPangkatT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keteranganT;
    private javax.swing.JTextField namaPangkatT;
    private javax.swing.JTable tabelPangkat;
    // End of variables declaration//GEN-END:variables
}
