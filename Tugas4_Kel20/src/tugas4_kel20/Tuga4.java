
package tugas4_kel20;

import java.util.Scanner;

public class Tuga4 {

    static void omong(String omongan) {
        System.out.println(omongan);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NewClass objek = new NewClass();
        int milih, milih2;
        for (String b = "y"; b.equals("y") || b.equals("Y");) {
            omong("Program Kesehatan");
            omong("1. Tipe Sakir Kepala Kamu");
            omong("2. Tanda Kekurangan mineral atau vitamin");
            milih = scan.nextInt();

            switch (milih) {
                case 1:
                    omong("1. Sakit Kepala Sebelah");
                    omong("2. Sakit Kepala bagian atas  sampai leher");
                    omong("3. Sakit Kepala di pinggir mata");
                    omong("4. Sakit Kepala di sekitar pelipis");
                    omong("5. Penyebab Sakit Kepala pada umunya");
                    milih2 = scan.nextInt();
                    switch (milih2) {
                        case 1:
                            omong("1. Sering terjadi");
                            omong("2. Jarang terjadi");
                            milih = scan.nextInt();
                            if (milih == 1) {
                                objek.pusing11();
                            } else {
                                objek.pusing12();
                            }
                            break;
                        case 2:
                            objek.pusing2();
                            break;
                        case 3:
                            objek.pusing3();
                            break;
                        case 4:
                            objek.pusing4();
                            break;
                        case 5:
                            objek.pusing5();
                            break;
                        default:
                            omong("maaf pilihan tidak tersedia");
                            break;
                    }
                    break;
                case 2:
                    omong("Ciri ciri yang dialami");
                    omong("1.Kelelahan,kram otot, irama jantung abnormal, nafsu makan buruk");
                    omong("2.lesu, otot lemah, refleks berkurang, sembelit, anemia");
                    omong("3.masalah keseimbangan, anemia, kelelahan, lidah bengkak");
                    milih2 = scan.nextInt();
                    if (milih2 == 1) {
                        objek.mineral1();
                    } else if (milih2 == 2) {
                        objek.mineral2();
                    } else if (milih2 == 3) {
                        objek.mineral3();
                    } else {
                        omong("maaf pilihan tidak tersedia");

                    }
                    break;
                default:
                    omong("maaf pilihan tidak tersedia");
                    break;

            }
            omong("ada yang ingin dicari lagi?y/t");
            b = scan.next();

        }
    }

}

