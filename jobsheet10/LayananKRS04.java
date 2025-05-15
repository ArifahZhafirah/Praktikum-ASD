package jobsheet10;
import java.util.Scanner;
public class LayananKRS04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS04 antrian = new AntrianKRS04(10);
        int pilihan;

        do{
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Mahasiswa yang Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch(pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa04 mhs = new Mahasiswa04(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    System.out.println("Mahasiswa yang dipanggil untuk proses KRS:");
                    Mahasiswa04[] dipanggil = antrian.layaniMahasiswa04();
                    for (Mahasiswa04 mahasiswa : dipanggil) {
                    if(mahasiswa != null) {
                        mahasiswa.tampilkanData();
                        }
                    }
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatAkhir();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }while (pilihan != 0);
        sc.close();
    }
}
