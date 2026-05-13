public class Main {
    public static void main(String[] args) {
        Produk p1 = new Elektronik("Polytron", 500000, 6, 5);
        Produk p2 = new Makanan("Mie Ayam", 8000, 100, 2);
        Kasir kasir = new Kasir("Giorgio");

        p1.tampilInfo();
        kasir.tampilIdentitas();
        kasir.prosesBelanja(p1, 3);

        p2.tampilInfo();
        kasir.tampilIdentitas();
        kasir.prosesBelanja(p2, 11);
    }
}
