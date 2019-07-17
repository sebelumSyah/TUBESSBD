
package sbd;

public class nampung {
    private String  [] list;
    private int in;
    
    public nampung(){
        if(in<1){
            list= new String[2];
        }
    }
    public void nambah(String a){
        list[in++]=a;
    }
    public Object getValue(int x){
        return list[x];
    }
}
