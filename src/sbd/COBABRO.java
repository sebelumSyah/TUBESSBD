
package sbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class COBABRO {

    public static void main(String[] args) {
//        try{
//
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=firmans19";
//            Connection con = DriverManager.getConnection(url);
//            String query ="insert into Karyawan(IDKaryawan,Nama,Alamat,TglLahir,IDKeahlian,IDDivisiP,IDDivisiS,IDKaryawanS,Status) "
//                    + "values (?,?,?,?,?,?,?,?,?)";
//            PreparedStatement pst =con.prepareStatement(query);
//            
//            pst.setString(1, "'KR001'");
//            pst.setString(2, "'ILHAMUDIN'");
//            pst.setString(3, "'SPG'");
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            pst.setString(4, null);
//            pst.setString(5, null);
//            pst.setString(6, null);
//            pst.setString(7,null);
//            pst.setString(8,null);
//            pst.setString(9,"'AKTIF'");
//            
//            
//            
//            pst.executeUpdate();
//            
//            JOptionPane.showMessageDialog(null, "Saved");
//            
//            
//            
//            }catch(Exception ex){
//            JOptionPane.showMessageDialog(null, ex);
//            
//        }
//    }
        




try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectEASsbd;user=firman;password=s1910";
            Connection con = DriverManager.getConnection(url);
            String query ="select * from login where username=? and password=?";
            String query1="select status from login where username=? and password=?";
            PreparedStatement ps= con.prepareStatement(query);
            PreparedStatement pst= con.prepareStatement(query1);
            
            String user="yuda";
            String pass="hendriawan";
            
            ps.setString(1, user);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                pst.setString(1, user);
                pst.setString(2, pass);
                ResultSet rse=pst.executeQuery();  
                if(rse.next()){
                    String aku=rse.getString(1);
                    switch(aku){
                        case "admin":
                            System.out.println("admin");
                            break;
                        case "user":
                            System.out.println("user");
                            break;
                    }
                    
                }
                else{
                    System.out.println("no");
                }
                
            
            }
            else{
                JOptionPane.showMessageDialog(null, "Login Failed");
            }
            
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }



    }
}
