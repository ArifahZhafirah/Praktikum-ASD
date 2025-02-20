public class MataKuliah04 {
    public static void main(String[] args) {
    }
        String kodeMk;
        String nama;
        int sks;
        int jumlahJam;

        void tampilInformasi(){
            System.out.println("Kode Matakuliah: " + kodeMk);
            System.out.println("Nama: " + nama);
            System.out.println("SKS: " + sks);
            System.out.println("Jumlah Jam: " + jumlahJam);
        }

        void ubahSKS(int sksBaru){
            sks = sksBaru;
        }

        void tambahJam(int jam){
            jumlahJam += jam;
        }

        void kurangiJam(int jam){
            jumlahJam -= jam;
        }
        public MataKuliah04(){
        }

        public MataKuliah04(String kodeMk, String nama, int sks, int jumlahJam){
            this.kodeMk = kodeMk;
            this.nama = nama;
            this.sks = sks;
            this.jumlahJam = jumlahJam;
        }
    
}
