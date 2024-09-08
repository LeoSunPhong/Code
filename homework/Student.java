package project1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    public static Scanner sc = new Scanner(System.in);

    String name;
    int id;
    float GPA;
    Date dateOfBirth;
    String major;

    public Student(String name, int id, float GPA, Date dateOfBirth, String major) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
    }

    public Student() {
    }

    Student enterInfor(Student student) {
        System.out.println("enter name: ");
        this.name = sc.nextLine();
        System.out.println("enter GPA: ");
        this.GPA = sc.nextFloat();
        System.out.println("enter id ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter dateOfBirth: ");
        String date1 = sc.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.dateOfBirth = date2.parse(date1);

        } catch (ParseException e) {
            System.out.println("wrong format");
            System.exit(0);
        }

        System.out.println("enter major: ");
        this.major = sc.nextLine();
        return student;

    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", GPA=" + GPA + ", dateOfBirth=" + dateOfBirth + ", major=" + major + '}';
    }

    public void displayInfor(Student student) {
        System.out.println(student.toString());
    }
}
