
package sbd;

class listKaryawan {
    String IDKaryawan,Nama,Alamat,TglLahir,IDKeahlian,IDDivisiP,IDDivisiS,IDKaryawanS;
    int Gaji;
    
    
    public listKaryawan(String IDKaryawan,String Nama,String Alamat,String TglLahir,String IDKeahlian,
    String IDDivisiP, String IDDivisiS, String IDKaryawanS){
        this.Alamat=Alamat;
        this.IDDivisiP=IDDivisiP;
        this.IDDivisiS=IDDivisiS;
        this.IDKaryawan=IDKaryawan;
        this.IDKeahlian=IDKeahlian;
        this.Nama=Nama;
        this.TglLahir=TglLahir;
        
        this.IDKaryawanS=IDKaryawanS;
    }
    public listKaryawan(String IDKaryawan,String Nama, int Gaji){
        this.IDKaryawan=IDKaryawan;
        this.Nama=Nama;
        this.Gaji=Gaji;
    }
    public listKaryawan(String IDKaryawan,String Nama,String Alamat, String TglLahir){
        this.Alamat=Alamat;
        this.IDKaryawan=IDKaryawan;
        this.TglLahir=TglLahir;
        this.Nama=Nama;
        
        
    }

    public int getGaji() {
        return Gaji;
    }

    
    public String getIDKaryawan() {
        return IDKaryawan;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getTglLahir() {
        return TglLahir;
    }

    public String getIDKeahlian() {
        return IDKeahlian;
    }

    public String getIDDivisiP() {
        return IDDivisiP;
    }

    public String getIDDivisiS() {
        return IDDivisiS;
    }

    public String getIDKaryawanS() {
        return IDKaryawanS;
    }
    
            
}
