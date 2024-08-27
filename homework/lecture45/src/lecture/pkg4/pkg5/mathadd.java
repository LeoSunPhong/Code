package lecture.pkg4.pkg5;

import java.util.Random;
import java.util.Scanner;

public class mathadd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int diem = 0;
        int solansai = 0;

        while (solansai < 3) {

            int soluongsohang = rand.nextInt(4) + 2;
            int dapandung = 0;
            StringBuilder cauhoi = new StringBuilder("Tinh tong: ");

            for (int i = 0; i < soluongsohang; i++) {
                int sohang = rand.nextInt(100) + 1;
                dapandung += sohang;
                cauhoi.append(sohang).append(i < soluongsohang - 1 ? " + " : "");
            }

            System.out.println(cauhoi.toString());

            System.out.print("Cau tra loi cua ban la: ");
            int cautraloi = sc.nextInt();

            if (cautraloi == dapandung) {
                System.out.println("Dung! Diem: " + ++diem);
            } else {
                System.out.println("Sai! Dap an dung: " + dapandung);
                System.out.println("So loi: " + ++solansai);
            }
            System.out.println();
        }

        System.out.println("Ket thuc! Diem cua ban la: " + diem);
        sc.close();
    }
}
