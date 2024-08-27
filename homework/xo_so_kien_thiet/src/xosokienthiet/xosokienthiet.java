package xosokienthiet;

import java.util.Random;
import java.util.Scanner;

public class xosokienthiet {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int nguoimayman = rand.nextInt(100) + 1;

        System.out.println("----------chao mung ban den voi xo so lua dao----------  ");
        System.out.print("moi ban nhap so du doan: ");

        int nguoibilua = sc.nextInt();
        System.out.println(nguoimayman);

        if (nguoibilua == nguoimayman) {
            System.out.println("lua vay ma ban cung doan dung, han ban la 1 vjppro :3");

        } else {
            System.out.println("hahaahahah ban da bi lua");
        }
        sc.close();
    }

}
