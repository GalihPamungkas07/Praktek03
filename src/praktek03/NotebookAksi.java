package praktek03;

public class NotebookAksi {
    public static void main(String[] args) {
        Notebook n = new Notebook();
        
        n.setMerk("Acer");
        n.setSpek("2GB RAM, 500GB HDD");
        n.setHarga(4000000);
        
        n.cetakInfo();
    }
}
