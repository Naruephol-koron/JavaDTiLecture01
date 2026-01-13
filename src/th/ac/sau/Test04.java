package th.ac.sau;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //ประกาศตัวแปร
        String fullName;
        int age;
        double gpa;

        //สร้างตัวแทนของ Scanner เพื่อใช้ในการรับค่า
        Scanner wow = new Scanner(System.in);

        showSenpa();
        System.out.print("ป้อนชื่อ-สกุล : ");
        fullName = wow.next(); //รับข้อความ
        System.out.print("ป้อนอายุ : ");
        age = wow.nextInt(); //รับเลขจำนวณเต็ม int
        System.out.print("ปป้อน GPA : ");
        gpa = wow.nextDouble(); //รับเลขทศนิยมแบบละเอียด
        showSenpa();
        System.out.println("สวัสดี" + fullName);
        System.out.println("คุณอายุ" + age + "ปี");
        System.out.println("Gpa ของคุณ คือ" + gpa);
        showSenpa();
    }

    public static void showSenpa() {
        System.out.println("---------------------------");
    }
}
