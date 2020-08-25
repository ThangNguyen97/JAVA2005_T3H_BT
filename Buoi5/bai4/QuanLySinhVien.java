
package quanlysinhvien;

import java.util.Scanner;
import com.google.gson.*;

public class QuanLySinhVien {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        do {
            System.out.println("|------------MENU--------------|");
            System.out.println("|1.Nhập danh sách sinh         |");
            System.out.println("|2.Xem danh sách sinh viên     |");
            System.out.println("|3.Hiển thị sinh viên theo ID  |");
            System.out.println("|4.Thoat                       |");
            System.out.println("|------------------------------|");
            System.out.println("Nhap lua chon: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("----------------------------------------------------");
                    ql.nhapDanhSach();
                    break;
                case 2:
                    System.out.println("----------------------------------------------------");
                    ql.XuatDanhSach();
                    break;
                case 3:
                    System.out.println("----------------------------------------------------");
                    ql.TimKiem();
                    break;
            }
        } while (menu != 4);
    }
}
