public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // konstruktor default
    public Mahasiswa04() {
    }
    
    // Konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    public Mahasiswa04(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("ipk : " + ipk);
    }
    
}
