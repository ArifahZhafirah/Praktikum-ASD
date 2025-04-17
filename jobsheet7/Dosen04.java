package jobsheet7;
public class Dosen04 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen04(){
    }

    Dosen04(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Umur :  " + usia);
    }
}