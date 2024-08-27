package lecture.pkg4.pkg5;

import java.util.Scanner;

class switchcase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        switch (n) {
            case 5:
                System.out.println("five");
                break;
            case 4:
                System.out.println("four");
                break;
            case 3:
                System.out.println("three");
                break;
            case 2:
                System.out.println("two");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.print("n/a");
        }
    }
}
