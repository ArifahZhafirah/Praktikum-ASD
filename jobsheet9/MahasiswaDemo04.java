package jobsheet9;

import java.util.Scanner;
public class MahasiswaDemo04 {
    public static void main(String[] args) {
        StackTugasMahasiswa04 stack = new StackTugasMahasiswa04(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. melihat Tugas Teratas");
            System.out.println("4. melihat Tugas Terbawah");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.println("6. Menghitung Jumlah Tugas yang Sudah Dikirim");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih){
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa04 mhs = new Mahasiswa04(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n" , mhs.nama);
                    break;
                case 2:
                    Mahasiswa04 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa04 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa04 firstStudent = stack.peek();
                    if (firstStudent != null) {
                        System.out.println("Mahasiswa pertama yang mengumpulkan tugas:");
                        System.out.println(firstStudent.nama + "\t" + firstStudent.nim + "\t" + firstStudent.kelas);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 6:
                    int JumlahTugas = stack.jmlTugas();
                    System.out.printf("Jumlah Tugas yang dikumpulkan: %d\n", JumlahTugas);
                    break;
                 default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
