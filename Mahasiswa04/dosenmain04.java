public class dosenmain04 {
    public static void main(String[] args) {
        
        dosen04 dsn1 = new dosen04();
        dsn1.idDosen = "18887654398";
        dsn1.nama = "laily";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2020;
        dsn1.bidangKeahlian = "Teknik Informatika";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("Pendidikan");
        dsn1.tampilInformasi();

        dosen04 dsn2 = new dosen04("2004", "Arifah", true, 2017, "Teknik Informatika");
        dsn2.tampilInformasi();
        
        dsn2.setStatusAktif(false);
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Sistem Informasi Bisnis");
        dsn2.tampilInformasi();
    }
}
