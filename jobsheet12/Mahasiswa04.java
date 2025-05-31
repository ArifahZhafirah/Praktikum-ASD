package jobsheet12;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa04(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("Nim: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk); ;
    }
}
