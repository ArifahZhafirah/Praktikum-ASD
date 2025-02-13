import java.util.Scanner;

public class fungsi2 {
    static Scanner sc = new Scanner(System.in);
    static int[][] stok = {
        { 10, 5, 15, 7 },
        { 6, 11, 9, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 }
    };
    static String[] bunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static String[] cabang = { "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4" };
    static int[][] pendapatanPerBunga = new int[stok.length][bunga.length];
    static int menu = 0;

    public static void main(String[] args) {
        Menu();
    }

    static void Menu() {
        System.out.println("Selamat Datang !");
        System.out.println("1. Cek Pendapatan");
        System.out.println("2. Cek Stok");
        System.out.println("3. Edit Stok");
        System.out.println("4. Keluar");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                PendapatanPerCabang();
                break;
            case 2:
                InformasiStok();
                break;
            case 3:
                EditStok();
                break;
            default:
                break;
        }
    }

    static void PendapatanPerCabang() {
        int[] harga = { 75000, 50000, 60000, 10000 };
        for (int i = 0; i < stok.length; i++) {
            int pendapatanPerCabang = 0;
            for (int j = 0; j < bunga.length; j++) {
                pendapatanPerBunga[i][j] = stok[i][j] * harga[j];
                pendapatanPerCabang += pendapatanPerBunga[i][j];
            }
            System.out.println("Pendapatan Cabang " + cabang[i] + " : Rp " + pendapatanPerCabang);
        }
    }

    static void EditStok() {
        int indexBunga = 0, jmlAkhir = 0, indexCabang = 0;
        System.out.println("Data Bunga Mati");
        for (int i = 0; i < cabang.length; i++) {
            System.out.println((i + 1) + ". " + cabang[i]);
        }

        System.out.print("Pilih : ");
        menu = sc.nextInt();
        indexCabang = menu;

        System.out.println("\nPilih Jenis Bunga:");
        for (int j = 0; j < bunga.length; j++) {
            System.out.println((j + 1) + ". " + bunga[j]);
        }
        System.out.print("Pilih : ");
        menu = sc.nextInt();
        indexBunga = menu;
        System.out.print("Jumlah : ");
        int jmlMati = sc.nextInt();

        jmlAkhir = (stok[indexCabang - 1][indexBunga - 1]) - jmlMati;
        stok[indexCabang - 1][indexBunga - 1] = jmlAkhir;
        System.out.println("Stok Bunga " + bunga[indexBunga - 1] + " : " + jmlAkhir);
        System.out.println(bunga[indexBunga - 1] + " berkurang " + jmlMati);
    }

    static void InformasiStok() {
        System.out.println("CEK STOK PER CABANG");
        for (int i = 0; i < cabang.length; i++) {
            System.out.println((i + 1) + ". " + cabang[i]);
        }

        System.out.print("Pilih : ");
        menu = sc.nextInt();

        for (int j = 0; j < stok.length; j++) {
            System.out.println("Stok Bunga " + bunga[j] + " : " + stok[menu - 1][j]);
        }
    }
}
