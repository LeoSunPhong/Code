package lecture.pkg4.pkg5;

import java.util.Random;

public class random {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("5 so ngau nhien: ");
        for (int i = 0; i < 5; i++) {
            double randomnumber = random.nextDouble(100);
            System.out.println(randomnumber);
        }
    }
}
