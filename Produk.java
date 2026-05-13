public class Produk {
    private String nama;
    private double harga;
    private int stok;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void setStok(int jmlBeli){
        stok -= jmlBeli;
    }
    public int getStok(){
        return stok;
    }

    public void tampilInfo(){
        System.out.println("=== Produk ===");
        System.out.println("Nama :" + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
