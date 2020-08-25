package quanlysinhvien;

import java.util.Scanner;
import com.google.gson.*;

public class SinhVien {
	String Id;
	String name;
	public int age;
	String classs;
	String subject;

	public void nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap Id: ");
		Id = sc.nextLine();
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập lớp học : ");
		classs = sc.nextLine();
		System.out.println("Nhập ngành học: ");
		subject = sc.nextLine();
	}
}
