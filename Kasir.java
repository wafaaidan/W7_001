public class Kasir {
    private String namaKasir;

    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public void tampilIdentitas(){
        System.out.println("=== TOKO KITA ===");
        System.out.println("Nama Kasir: " + namaKasir);
    }
}
