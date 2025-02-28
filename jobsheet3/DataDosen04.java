public class DataDosen04{
    
    public static void dataSemuaDosen(Dosen04[] arrayOfDosen04) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen04 d : arrayOfDosen04) {
            d.tampilkanData();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen04[] arrayOfDosen04) {
        int pria = 0, wanita = 0;
        for (Dosen04 d : arrayOfDosen04) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n=== Jumlah Dosen Berdasarkan Jenis Kelamin ===");
        System.out.println("Laki-laki : " + pria);
        System.out.println("Perempuan : " + wanita);
        System.out.println("--------------------------------------");
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen04[] arrayOfDosen04) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen04 d: arrayOfDosen04) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }
        System.out.println("\n=== Rata-rata Usia Dosen Berdasarkan Jenis Kelamin ===");
        System.out.print("Rata- Rata usia Pria     :" + (countPria > 0? (totalPria / countPria) :  "Tidak Ada"));
        System.out.print("Rata-Rata usia Perempuan :" + (countWanita > 0? (totalWanita / countWanita) : "Tidak Ada"));
        System.out.println("-------------------------");
    }

    public static void infoDosenPalingTua(Dosen04[] arrayOfDosen04) {
        Dosen04 tertua = arrayOfDosen04[0];
        for (Dosen04 d : arrayOfDosen04) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\n=== Dosen Paling Tua ===");
        tertua.tampilkanData();
    }

    public static void infoDosenPalingMuda(Dosen04[] arrayOfDosen04) {
        Dosen04 termuda = arrayOfDosen04[0];
        for (Dosen04 d : arrayOfDosen04) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\n=== Dosen Paling Muda ===");
        termuda.tampilkanData();
    }
}
