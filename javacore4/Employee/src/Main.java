

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nhan vien can them: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Nhan vien thu" + (i + 1));
            employees[i] = new Employee();
            employees[i].input();
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Danh sach nhan vien");
            employees[i].display();
        }
    }
}