import java.util.Scanner;

public class TugasSllMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TugasSingleLingkedList04 queue = new TugasSingleLingkedList04();
        int pilih;

        do {
            System.out.println("\n======= MENU ANTRIAN LAYANAN =======");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Depan");
            System.out.println("4. Lihat Antrian Belakang");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar Program");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = sc.nextLine();
                    TugasMahasiswa04 mhs = new TugasMahasiswa04(nim, nama, keperluan);
                    queue.enqueue(mhs);
                    break;

                case 2:
                    TugasMahasiswa04 keluar = queue.dequeue();
                    if (keluar != null) {
                        System.out.println("Mahasiswa berikut telah dipanggil:");
                        keluar.tampilkanInformasi();
                    }
                    break;

                case 3:
                    TugasMahasiswa04 depan = queue.peekFront();
                    if (depan != null) {
                        System.out.println("Antrian Terdepan:");
                        depan.tampilkanInformasi();
                    }
                    break;

                case 4:
                    TugasMahasiswa04 belakang = queue.peekRear();
                    if (belakang != null) {
                        System.out.println("Antrian Terakhir:");
                        belakang.tampilkanInformasi();
                    }
                    break;

                case 5:
                    queue.tampilAntrian();
                    break;

                case 6:
                    System.out.println("Jumlah Mahasiswa Dalam Antrian: " + queue.getSize());
                    break;

                case 7:
                    queue.clear();
                    break;

                case 8:
                    System.out.println("Terima kasih telah menggunakan layanan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 8);

        sc.close();
    }
}

