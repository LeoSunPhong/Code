package practice;

import java.util.Scanner;

public class baitap3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao 1 so nguyen: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("ban da nhap so nguyen: " + number);
        } else {
            System.out.println("dau vao khong phai la so nguyen");
        }

        sc.close();
    }
}
