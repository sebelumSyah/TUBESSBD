
package sbd;

class listKeahlian {
    String IDKeahlian,NamaKeahlian,Keterangan,Nama,IDKaryawan;
    
    public listKeahlian(String IDKeahlian, String NamaKeahlian, String Keterangan){
        this.IDKeahlian=IDKeahlian;
        this.NamaKeahlian=NamaKeahlian;
        this.Keterangan=Keterangan;
    }
    public listKeahlian(String IDKeahlian, String IDKaryawan, String NamaKeahlian, String Nama){
        this.IDKeahlian=IDKeahlian;
        this.NamaKeahlian=NamaKeahlian;
        this.Nama=Nama;
        this.IDKaryawan=IDKaryawan;
    }

    public String getNama() {
        return Nama;
    }

    public String getIDKaryawan() {
        return IDKaryawan;
    }

    public String getIDKeahlian() {
        return IDKeahlian;
    }

    public String getNamaKeahlian() {
        return NamaKeahlian;
    }

    public String getKeterangan() {
        return Keterangan;
    }
}
