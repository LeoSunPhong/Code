package lecture.pkg4.pkg5;

import java.util.Scanner;

public class loopdowhile {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    
    String phrase;
        do {
            System.out.print("type your password: ");
        phrase = sc.nextLine();
    }
    while (!phrase.equals ("duy tan"));
}
}


