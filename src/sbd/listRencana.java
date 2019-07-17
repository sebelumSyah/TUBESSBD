
package sbd;

class listRencana {
    String IDDivisi,IDProker,NamaDivisi,NamaProker;
    
    public listRencana(String IDDivisi, String NamaDivisi, String IDProker ,String NamaProker){
        this.IDDivisi=IDDivisi;
        this.IDProker=IDProker;
        this.NamaDivisi=NamaDivisi;
        this.NamaProker=NamaProker;
    }

    public String getIDDivisi() {
        return IDDivisi;
    }

    public String getIDProker() {
        return IDProker;
    }

    public String getNamaDivisi() {
        return NamaDivisi;
    }

    public String getNamaProker() {
        return NamaProker;
    }
}
