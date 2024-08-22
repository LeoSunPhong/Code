package homework;

import java.util.Scanner; 
public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("nhap so thu 1: ");
        int a = scanner.nextInt(); 
        
        System.out.println("nhap so thu 2: ");
        int b = scanner.nextInt(); 
        
        System.out.println("cong: " + (a + b)); 
        System.out.println("tru: " + (a - b)); 
        System.out.println("nhan: " + (a * b)); 
        
        
        if (b != 0) {
            System.out.println("chia: " + (a / b)); 
            System.out.println("chia lay du: " + (a % b)); 
        } else {
            System.out.println("Lỗi: Không thể chia cho 0."); 
        }
    }
}
