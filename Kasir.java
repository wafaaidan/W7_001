public class Kasir {
    private String namaKasir;

    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public void tampilIdentitas(){
        System.out.println("=== TOKO KITA ===");
        System.out.println("Nama Kasir: " + namaKasir);
    }

    public void prosesBelanja(Produk p, int jmlBeli) {

        if (p.getStok() < jmlBeli) {
            System.out.println("Out of Stock");
        } else {
            double hargaAkhir = p.hitungHargaAkhir(jmlBeli);
            System.out.println("Harga Akhir = " + hargaAkhir);
            p.setStok(jmlBeli);
        }
        System.out.println("Stok terbaru = " + p.getStok());
    }
}
