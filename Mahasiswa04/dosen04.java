public class dosen04 {
    public static void main(String[] args) {
    }
        String idDosen;
        String nama;
        boolean statusAktif;
        int tahunBergabung;
        String bidangKeahlian;

        void tampilInformasi(){
            System.out.println("id dosen: " + idDosen);
            System.out.println("Nama: " + nama);
            System.out.println("Status Aktif: " + statusAktif);
            System.out.println("Tahun Bergabung: " + tahunBergabung);
            System.out.println("Bidang Keahlian: " + bidangKeahlian);
        }

        boolean setStatusAktif(boolean status){
            statusAktif = status;
            if (status == true) {
                System.out.println("Aktif");
            } else{
                System.out.println("Tidak Aktif");
            }
            return statusAktif;
        }
    
         int hitungMasaKerja(int thnSkrng){
            return tahunBergabung = thnSkrng - tahunBergabung;
         }
    
         void ubahKeahlian (String bidang){
            bidangKeahlian = bidang;
         }

         public dosen04(){
        }

        public dosen04(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
            this.idDosen = idDosen;
            this.nama = nama;
            this.statusAktif = statusAktif;
            this.tahunBergabung = tahunBergabung;
            this.bidangKeahlian = bidangKeahlian;
    }

} 

