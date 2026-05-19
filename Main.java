import java.util.Scanner;

public class Main {
    public Scanner input = new Scanner(System.in);
    
    Produk[] database = {
        new Elektronik("Laptop", 10000000, 5, 2),
        new Elektronik("Smartphone", 5000000, 10, 1),
        new Makanan("Snack", 10000, 100, 30)
        
    };
    public void MainMenu() {
        System.out.println("=====< TOKO KITA >=====");
        System.out.println("Silakan pilih Menu: ");
        System.out.println("1. Tampilkan Data Produk");
        System.out.println("2. Tampilkan Data Belanja");
        System.out.println("3. Program Kasir");
        System.out.println("4. Keluar");
    }
    public void TampilData(){
        System.out.println("=== DAFTAR PRODUK DI DATABASE ===");
        for(int i = 0; i < database.length; i++) {
            System.out.println("ID Produk: " + (i+1));
            database[i].tampilInfo();
            System.out.println("------------------------------");
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.MainMenu();
        char lanjut;
        int jumlahTransaksi = 0;
        int batasMaksimal = 3;
        do{
        System.out.println("Silakan Pilih Menu Fitur berikut:");
        int opsiMenu = obj.input.nextInt();

        switch (opsiMenu) {
            case 1:
                obj.TampilData();
            break;
            case 2:
                System.out.println("Belum tersedia");
                break;
            case 3:
                Kasir kasir = new Kasir("Giorgio");

                System.out.println("Pilih ID Produk: ");
                int pilihan = obj.input.nextInt();
                if (pilihan > 0 && pilihan <= obj.database.length) {
                    Produk selected = obj.database[pilihan - 1];
        
                    System.out.println("Masukkan Jumlah Beli: ");
                    int jmlBeli = obj.input.nextInt();
        
                    kasir.tampilIdentitas();
                    selected.tampilInfo();
                    kasir.prosesBelanja(selected, jmlBeli);
                } else {
                    System.out.println("Error: ID Produk " + pilihan + " tidak ditemukan!");
                } 
                break;
                case 4:
                    System.exit(opsiMenu);
                break;
            default:
                break;
        }
        if (jumlahTransaksi < batasMaksimal) {
            System.out.print("\nAda produk lain yang ingin dibeli? (y/n): ");
            lanjut = obj.input.next().toLowerCase().charAt(0);
        } else {
            System.out.println("\n[Batas maksimal 3 transaksi tercapai]");
            lanjut = 'n';
        }
    } while (lanjut == 'y' && jumlahTransaksi < batasMaksimal);
    obj.input.close();
        
        // Produk p1 = new Elektronik("Polytron", 500000, 6, 5);
        // Produk p2 = new Makanan("Mie Ayam", 8000, 100, 2);
       
        // p1.tampilInfo();
        // kasir.tampilIdentitas();
        // kasir.prosesBelanja(p1, 3);

        // p2.tampilInfo();
        // kasir.tampilIdentitas();
        // kasir.prosesBelanja(p2, 11);
    }
}
