
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nilaiHuruf = "";
        double bobotNilai = 0, sumNilaiSetara = 0, sks = 0, sumSKS = 0;

        String[][] data = {
            { "Pancasila", "2", "", "", "" },
            { "KTI", "2", "", "", ""},
            { "CTPS", "2", "", "", "" },
            { "MATDAS", "2", "", "", ""},
            { "B.INGGRIS", "2", "", "", ""},
            { "DASPRO", "2", "", "", ""},
            { "PRAKTIKUM DASPRO", "2", "", "", ""},
            { "K3", "2", "", "", ""}
        };

        System.out.println("==============================");
        System.out.println("program Menghitung IP semester");
        System.out.println("==============================");
        for (int i = 0; i < data.length; i++) {
            System.out.print("masukkan Nilai MK " + data[i][0] + " : ");
            int nilai = sc.nextInt();

            if (nilai <= 100) {
                if (nilai > 80 && nilai <= 100) {
                    nilaiHuruf = "A";
                    bobotNilai = 4;
                }else if (nilai > 73 && nilai <= 80) {
                    nilaiHuruf = "B+";
                    bobotNilai = 3.5;
                }else if (nilai > 65 && nilai <= 73) {
                    nilaiHuruf = "B";
                    bobotNilai = 3;
                }else if (nilai > 60 && nilai <= 65) {
                    nilaiHuruf = "C+";
                    bobotNilai = 2.5;
                }else if (nilai > 50 && nilai <= 60) {
                    nilaiHuruf = "C";
                    bobotNilai = 2;
                }else if (nilai > 39 && nilai <= 50) {
                    nilaiHuruf = "D";
                    bobotNilai = 1;
                }else {
                    nilaiHuruf = "E";
                    bobotNilai = 0;
                }
            }else {
                System.out.println("Nilai Tidak valid !");
                System.out.println("==========================");
                System.out.println("==========================");
                break;
            }
            data[i][2] = String.valueOf(nilai);
            data[i][3] = nilaiHuruf;
            data[i][4] = String.valueOf(bobotNilai);
            sks = Integer.parseInt(data[i][1]);
            sumSKS += sks;
            sumNilaiSetara += bobotNilai * sks;
        }
        double ip = sumNilaiSetara / sumSKS;

        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.println("MK                                         Nilai Angka       Nilai Huruf      bobot Nilai     ");
        for (String[] content : data) {
            System.out.printf("%-45s %-18.2f %-17s %-15s %n", content[0], 
                    Float.valueOf(content[2]), content[3], (content[4]));
        }
        System.out.println("==============================================================================================");
        System.out.printf("\nIP: %.2f", ip);
        sc.close();
    }
}
