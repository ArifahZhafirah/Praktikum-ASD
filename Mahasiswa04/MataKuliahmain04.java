public class MataKuliahmain04 {
    public static void main(String[] args) {
        MataKuliah04 matkul1 = new MataKuliah04();
        matkul1.kodeMk = "20987";
        matkul1.nama = "Arifah Zhafirah Wikananda";
        matkul1.sks = 3;
        matkul1.jumlahJam = 4;
        
        matkul1.tampilInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(6);
        matkul1.kurangiJam(4);
        matkul1.tampilInformasi();

    }
}
