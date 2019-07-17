
package sbd;

class listDivisi {
    String IDDivisi,NamaDivisi,Bidang,IDKaryawan, Nama;
 
 public listDivisi(String IDDivisi,String NamaDivisi,String Bidang,String IDKaryawan){
     this.Bidang=Bidang;
     this.IDDivisi=IDDivisi;
     this.NamaDivisi=NamaDivisi;
     this.IDKaryawan=IDKaryawan;
 }
 

    public String getNama() {
        return Nama;
    }
 

    public String getIDDivisi() {
        return IDDivisi;
    }

    public String getNamaDivisi() {
        return NamaDivisi;
    }

    public String getBidang() {
        return Bidang;
    }

    public String getIDKaryawan() {
        return IDKaryawan;
    }
}
