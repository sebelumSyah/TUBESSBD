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
import javax.swing.table.TableModel;
import sbd.*;
import sbd.ahli1;
/**
 *
 * @author shafira
 */
public class ahli extends javax.swing.JPanel {

    public ahli() {
        initComponents();
        showTabel();
    }
    
     
    public ArrayList<listKeahlian> listTabelKeahlian (){
           ArrayList<listKeahlian> listTabelKeahlian = new ArrayList<>();
    
    try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query= "select * from Keahlian";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            listKeahlian list;
            while(rs.next()){
                list= new listKeahlian(rs.getString("IDKeahlian"),rs.getString("NamaKeahlian"),
                                       rs.getString("Keterangan"));
                listTabelKeahlian.add(list);
            }
         
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
        return listTabelKeahlian;
    }
    public void showTabel(){
        ArrayList<listKeahlian> list= listTabelKeahlian ();
        DefaultTableModel  model = (DefaultTableModel)tabelKeahlian.getModel();
        Object [] row = new Object[3];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getIDKeahlian();
            row[1]=list.get(i).getNamaKeahlian();
            row[2]=list.get(i).getKeterangan();
            
            model.addRow(row);
        }
        
    }
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKeahlian = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        editIdKeahlian = new javax.swing.JTextField();
        editNamaKeahlian = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        editKeteranganKeahlian = new javax.swing.JTextField();
        editkeahlian = new javax.swing.JButton();
        deletekeahlian = new javax.swing.JButton();
        inputkeahlian = new javax.swing.JButton();
        refreshkeahlian = new javax.swing.JButton();
        deletekeahlian1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setText("Keahlian");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 130, 40));

        tabelKeahlian.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabelKeahlian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Keahlian", "Nama Keahlian", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabelKeahlian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKeahlianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelKeahlianMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKeahlian);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 680, 170));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("EDIT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("K");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 20, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Nama Keahlian");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 100, 20));

        editIdKeahlian.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editIdKeahlian.setEnabled(false);
        jPanel1.add(editIdKeahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 110, -1));

        editNamaKeahlian.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editNamaKeahlian.setEnabled(false);
        editNamaKeahlian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNamaKeahlianActionPerformed(evt);
            }
        });
        jPanel1.add(editNamaKeahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 130, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Keterangan");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 80, 20));

        editKeteranganKeahlian.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editKeteranganKeahlian.setEnabled(false);
        jPanel1.add(editKeteranganKeahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 130, -1));

        editkeahlian.setBackground(new java.awt.Color(36, 47, 65));
        editkeahlian.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        editkeahlian.setForeground(new java.awt.Color(255, 255, 255));
        editkeahlian.setText("EDIT");
        editkeahlian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editkeahlianActionPerformed(evt);
            }
        });
        jPanel1.add(editkeahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 80, 30));

        deletekeahlian.setBackground(new java.awt.Color(36, 47, 65));
        deletekeahlian.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        deletekeahlian.setForeground(new java.awt.Color(255, 255, 255));
        deletekeahlian.setText("UPDATE");
        deletekeahlian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletekeahlianActionPerformed(evt);
            }
        });
        jPanel1.add(deletekeahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, 30));

        inputkeahlian.setBackground(new java.awt.Color(36, 47, 65));
        inputkeahlian.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        inputkeahlian.setForeground(new java.awt.Color(255, 255, 255));
        inputkeahlian.setText("INPUT");
        inputkeahlian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputkeahlianActionPerformed(evt);
            }
        });
        jPanel1.add(inputkeahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 80, 30));

        refreshkeahlian.setBackground(new java.awt.Color(36, 47, 65));
        refreshkeahlian.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        refreshkeahlian.setForeground(new java.awt.Color(255, 255, 255));
        refreshkeahlian.setText("REFRESH");
        refreshkeahlian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshkeahlianActionPerformed(evt);
            }
        });
        jPanel1.add(refreshkeahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 80, 30));

        deletekeahlian1.setBackground(new java.awt.Color(36, 47, 65));
        deletekeahlian1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        deletekeahlian1.setForeground(new java.awt.Color(255, 255, 255));
        deletekeahlian1.setText("DELETE");
        deletekeahlian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletekeahlian1ActionPerformed(evt);
            }
        });
        jPanel1.add(deletekeahlian1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("ID Keahlian");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 70, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputkeahlianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputkeahlianActionPerformed
        ahli1 select = new ahli1();
        select.setVisible(true);
    }//GEN-LAST:event_inputkeahlianActionPerformed

    private void editkeahlianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editkeahlianActionPerformed
        
        
        
        editIdKeahlian.setEnabled(true);
        editNamaKeahlian.setEnabled(true);
        editKeteranganKeahlian.setEnabled(true);
    }//GEN-LAST:event_editkeahlianActionPerformed

    private void refreshkeahlianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshkeahlianActionPerformed
        DefaultTableModel  model = (DefaultTableModel)tabelKeahlian.getModel();
        model.setRowCount(0);
        showTabel();
    }//GEN-LAST:event_refreshkeahlianActionPerformed

    private void deletekeahlianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletekeahlianActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            
            int row =tabelKeahlian.getSelectedRow();
            String value= "'"+tabelKeahlian.getModel().getValueAt(row, 0).toString()+"'";
//           
            String query2 = "update Keahlian set IDKeahlian=?,NamaKeahlian =? ,Keterangan=? where IDKeahlian="
                    +value;
            
            PreparedStatement pst= con.prepareStatement(query2);
            pst.setString(1,"K"+editIdKeahlian.getText());
            pst.setString(2,editNamaKeahlian.getText());
            pst.setString(3,editKeteranganKeahlian.getText());
            

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
        
    }//GEN-LAST:event_deletekeahlianActionPerformed

    private void deletekeahlian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletekeahlian1ActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            int row =tabelKeahlian.getSelectedRow();
            String value= ( tabelKeahlian.getModel().getValueAt(row, 0).toString());
            String vl="'"+value+"'";
           
            
            String queryy="delete from Keahlian where IDKeahlian="+vl;
            
            PreparedStatement pst= con.prepareStatement(queryy);
            
            pst.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Delete Success");
            
            
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
    }//GEN-LAST:event_deletekeahlian1ActionPerformed

    private void tabelKeahlianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKeahlianMouseClicked
        int angka = tabelKeahlian.getSelectedRow();
        TableModel model = tabelKeahlian.getModel();
        StringBuilder a= new StringBuilder(model.getValueAt(angka, 0).toString());
        editIdKeahlian.setText(a.delete(0, 1).toString());
        editNamaKeahlian.setText(model.getValueAt(angka, 1).toString());
        editKeteranganKeahlian.setText(model.getValueAt(angka, 2).toString());
        
    }//GEN-LAST:event_tabelKeahlianMouseClicked

    private void tabelKeahlianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKeahlianMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelKeahlianMouseEntered

    private void editNamaKeahlianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNamaKeahlianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNamaKeahlianActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletekeahlian;
    private javax.swing.JButton deletekeahlian1;
    private javax.swing.JTextField editIdKeahlian;
    private javax.swing.JTextField editKeteranganKeahlian;
    private javax.swing.JTextField editNamaKeahlian;
    private javax.swing.JButton editkeahlian;
    private javax.swing.JButton inputkeahlian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshkeahlian;
    private javax.swing.JTable tabelKeahlian;
    // End of variables declaration//GEN-END:variables
}
