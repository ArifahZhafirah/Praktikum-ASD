import java.util.Scanner;
public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner arifah = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = arifah.nextInt();
        arifah.nextLine();

        Dosen04[] daftarDosen = new Dosen04[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode Dosen    : ");
            String kode = arifah.nextLine();
            System.out.print("Nama Dosen    : ");
            String nama = arifah.nextLine();
            System.out.print("Jenis Kelamin (laki-laki = true, perempuan = false): ");
            Boolean jenisKelamin = arifah.nextBoolean();
            System.out.print("Usia Dosen    : ");
            int usia = arifah.nextInt();
            System.out.println("----------------------------");
            arifah.nextLine();

            daftarDosen[i] = new Dosen04(kode, nama, jenisKelamin, usia);
        }
       
        System.out.println("\n---------DATA DOSEN -------- ");
        for(Dosen04 d : daftarDosen){
            d.tampilkanData();
        }

        DataDosen04.dataSemuaDosen(daftarDosen);
        DataDosen04.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen04.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen04.infoDosenPalingTua(daftarDosen);
        DataDosen04.infoDosenPalingMuda(daftarDosen);

        arifah.close();
    }
}
