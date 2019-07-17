
package sbd;

class listPangkat {
    String IDPangkat,NamaPangkat,Keterangan,Nama,IDKaryawan;
    int gaji;
    
    public listPangkat(String IDPangkat,String NamaPangkat, String Keterangan, int gaji){
        this.IDPangkat=IDPangkat;
        this.Keterangan=Keterangan;
        this.NamaPangkat=NamaPangkat;
        this.gaji=gaji;
    }
    public listPangkat(String IDPangkat,String NamaPangkat, String IDKaryawan,String Nama, int gaji){
        this.IDPangkat=IDPangkat;
        this.NamaPangkat=NamaPangkat;
        this.IDKaryawan=IDKaryawan;
        this.Nama=Nama;
        this.gaji=gaji;
    }

    public String getNama() {
        return Nama;
    }

    public String getIDKaryawan() {
        return IDKaryawan;
    }

    public String getIDPangkat() {
        return IDPangkat;
    }

    public String getNamaPangkat() {
        return NamaPangkat;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public int getGaji() {
        return gaji;
    }
}
