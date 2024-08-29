package homework;

import java.util.Scanner;

public class inputoutput {

    public void input(float[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = sc.nextFloat();
        }
    }

    public void output(float[] array) {
        System.out.println("Mang ban vua nhap: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phan tu thu " + (i + 1) + ": " + array[i]);
        }
    }

    public float findMax2(float[] array) {
        float max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max array: " + max);
        return max;
    }

    public void deleteOddNumber(float[] array) {
        System.out.println("Mang sau khi xoa cac so le: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // Giữ lại các số chẵn
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        inputoutput arr = new inputoutput();
        float[] array = new float[6];
        arr.input(array);
        arr.output(array);
        arr.findMax2(array);
        arr.deleteOddNumber(array);
    }
}
