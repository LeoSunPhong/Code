package practice;

import java.util.Scanner;

public class baitap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi: ");

        if (sc.hasNext()) {
            String input = sc.nextLine();
            System.out.println("ban da nhap la: " + input);
        } else {
            System.out.println("khong co chuoi nao");
        }

        sc.close();
    }
}
