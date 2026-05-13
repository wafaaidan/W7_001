public class Makanan extends Produk {
    private int expired;

    public Makanan(String nama, double harga, int stok, int expired){
        super(nama, harga, stok);
        this.expired = expired;
    }

    @Override
    public double hitungHargaAkhir(int jmlBeli) {
        System.out.println("Total Harga = " + hitungTotalHarga(jmlBeli));
        return hitungTotalHarga(jmlBeli) * 0.95;
    }
    @Override 
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Masa Garansi: " + expired + " Hari");
    }
}
