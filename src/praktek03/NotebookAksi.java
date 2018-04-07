package praktek03;

public class NotebookAksi {
    public static void main(String[] args) {
        Notebook n = new Notebook();
        
        n.setMerk("Acer");
        n.setSpek("2GB RAM, 500GB HDD");
        n.setHarga(4000000);
        
        n.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(n.getMerk());
        System.out.print("Speknya \t: ");
        System.out.println(n.getSpek());
        System.out.print("Harganya \t: ");
        System.out.println(n.getHarga());
        
        Laptop l = new Laptop();
        l.setMerk("Asus");
        l.setSpek("4GB, 1TB");
        l.setHarga(9000000);
        l.setLaptop("Gaming");
        l.cetakInfo(); 
        System.out.println("Jenis :"+l.getLaptop());
        l.throttle();
    }
}
