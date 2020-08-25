package quanlysinhvien;

import java.util.Scanner;
import com.google.gson.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLy {

    private int soSv;
    private final SinhVien sv[] = new SinhVien[100];
    private final Scanner sc = new Scanner(System.in);

    public void nhapDanhSach() {
        System.out.println("Nhap so Sinh Vien can them: ");
        soSv = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soSv; i++) {
            sv[i] = new SinhVien();
            sv[i].nhap();
            System.out.println("Nhập sinh viên tiếp theo");
        }
    }

    public void XuatDanhSach() {
    	Gson json = new Gson();
		List<String> ListSV = new ArrayList<String>();
        for (int i = 0; i < soSv; i++) {
        	String information = json.toJson(sv[i]);
        	ListSV.add(information);

        }
        System.out.println(ListSV);
    }
    
    public void TimKiem() {
        System.out.println("Nhap Id sinh vien can tim kiem: ");
        String name = sc.nextLine();
        for(int i = 0; i < soSv; i++) {
            if(name.equals(sv[i].Id)) {
            	Gson json1 = new Gson();
            	String information1 = json1.toJson(sv[i]);
                System.out.println("Sinh vien can tim: ");
                System.out.println(information1);

            }
        }
    }
}
