public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa04(){
    }

    Mahasiswa04(String name, String nm, String kls, double ip){
        nama = name;
        nim = nm;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
