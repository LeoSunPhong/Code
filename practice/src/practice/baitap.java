
package practice;

import java.util.Scanner;
public class baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ten: ");
        String ten = sc.nextLine();
        
         System.out.println("tuoi: ");
         int tuoi = sc.nextInt();
         
          System.out.println("nam sinh: ");
          long namsinh = sc.nextLong();
          sc.nextLine();
          
           System.out.println("gioi tinh: ");
           String gioitinh  = sc.nextLine();
           
           
           System.out.println("chuyen nganh: ");
           String chuyennganh =sc.nextLine();
           
           
           System.out.println("GPA: ");
           float GPA = sc.nextFloat();
           sc.nextLine();
           
           System.out.println("que quan: ");
           String quequan = sc.nextLine();                    
           
           System.out.println(ten + "-" + tuoi + "-" + namsinh + "-" + gioitinh + "-" +  chuyennganh + "-" + GPA + "-" + quequan);
    }
}
