import java.util.Scanner;

public class dosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        dataDosen04 datadsn = new dataDosen04();
        int pilihan;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda Ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Masukkan data dosen ke-" + (i + 1) + ":");
                        System.out.print("Masukkan kode dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan nama dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan jenis Kelamin (Perempuan / laki-laki): ");
                        char jk = sc.next().charAt(0);
                        Boolean jenisKelamin = (jk == 'l' || jk == 'p');
                        System.out.print("Masukkan usia dosen: ");
                        int usia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("-------------------------------------------------");

                        dosen04 dsn = new dosen04(kode, nama, jenisKelamin, usia);
                        datadsn.tambah(dsn);
                    }
                    break;
                case 2:
                    datadsn.tampil();
                    break;
                case 3:
                    datadsn.sortingASC();
                    System.out.println("Data Dosen Telah Diurutkan secara Ascending");
                    datadsn.tampil();
                    break;
                case 4:
                    datadsn.sortingDSC();
                    System.out.println("Data Dosen Telah Diurutkan secara Descending");
                    datadsn.tampil();
                    break;
                case 5:
                    System.out.println("keluar dari Program");
                    break;
                default:
                    System.out.println("Pilihan tidak Valid. Silahkan Coba Lagi");
            }
        }while (pilihan != 5);
    }
}
