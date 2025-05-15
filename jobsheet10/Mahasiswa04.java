package jobsheet10;

public class Mahasiswa04 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa04(String nim, String nama, String prodi, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
    
}
