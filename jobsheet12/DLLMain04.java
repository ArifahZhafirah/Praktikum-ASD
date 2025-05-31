package jobsheet12;

import java.util.Scanner;
public class DLLMain04 {
    public static void main(String[] args) {
        DoubleLinkedLists04 list = new DoubleLinkedLists04();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1: 
                Mahasiswa04 mhs = inputMahasiswa(scan);
                list.addFirst(mhs);
                break;
               
                case 2:
                Mahasiswa04 mhs2 = inputMahasiswa(scan);
                list.addLast(mhs2);
                break;
                
                case 3: 
                list.removeFirst();
                break;

                case 4 : 
                list.removeLast();
                break;

                case 5:
                list.print();
                break;

                case 6:
                System.out.println("Masukkan NIM yang dicari: ");
                String nim = scan.nextLine();
                Node04 found = list.search(nim);
                if(found != null) {
                    System.out.println("Data Mahasiswa ditemukan: ");
                    found.data.tampil();
                } else {
                    System.out.println("Data Mahasiswa tidak ditemukan.");
                }
                break;
                
                case 0:
                System.out.println("Keluar dari program.");
                default :
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }
    // Method to input Mahasiswa04 data
    public static Mahasiswa04 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine(); // consume newline
        return new Mahasiswa04(nim, nama, nama, ipk);
    }
}
