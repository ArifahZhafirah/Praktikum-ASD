public class mahasiswamain04 {
    public static void main(String[] args) {
        mahasiswa04 mhs1 = new mahasiswa04();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2j";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2k");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa04 mhs2 = new mahasiswa04("Arifah Zhafirah Wikananda","244107020188", 3.90, "TI 1E");
        mhs2.updateIpk(3.97);
        mhs1.tampilkanInformasi();
    }
    
}


