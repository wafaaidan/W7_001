public class Makanan extends Produk {
    private int expired;

    public Makanan(String nama, double harga, int stok, int expired){
        super(nama, harga, stok);
        this.expired = expired;
    }
}
