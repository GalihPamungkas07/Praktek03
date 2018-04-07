
package praktek03;


public class Notebook {
    private String merk;
    private String spek;
    private double harga;
    
    void cetakInfo(){
        System.out.println( "Merk \t: "+merk+"\n"+
                            "Spek \t: "+spek+"\n"+
                            "Harga\t: "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getSpek() {
        return spek;
    }

    public void setSpek(String spek) {
        this.spek = spek;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
