
package sbd;

class listBerpangkat {
    String IDKaryawan,NamaKaryawan,IDPangkat,tanggalJabat;
    
    public listBerpangkat(String IDKaryawan, String NamaKaryawan, String IDPangkat,String tanggalJabat){
        this.IDKaryawan=IDKaryawan;
        this.NamaKaryawan=NamaKaryawan;
        this.IDPangkat=IDPangkat;
        this.tanggalJabat=tanggalJabat;
    }

    public String getIDKaryawan() {
        return IDKaryawan;
    }

    public String getNamaKaryawan() {
        return NamaKaryawan;
    }

    public String getIDPangkat() {
        return IDPangkat;
    }

    public String getTanggalJabat() {
        return tanggalJabat;
    }
}
