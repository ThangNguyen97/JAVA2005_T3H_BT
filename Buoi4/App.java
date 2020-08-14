import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n;
	        int Tongtienve;
	        KhachHang khachHang;
	         
	        Tongtienve =0;
	        ArrayList<KhachHang> arrKhachHang = new ArrayList<>();
	         
	        System.out.println("Nhập số lượng khách hàng: ");
	        n = Integer.parseInt(scanner.nextLine());
	         
	        for (int i = 0; i < n; i++) {
	            khachHang = new KhachHang();
	            System.out.println("Nhập thông tin khách hàng thứ " + (i+1) + ":");
	            khachHang.nhapThongTinKhachHang();
	            arrKhachHang.add(khachHang);
	        }
	        for (int i = 0; i < arrKhachHang.size(); i++) {
	        	
	            System.out.println("\nThông tin khách hàng thứ " + (i+1) + ": ");
	            arrKhachHang.get(i).hienThiThongTinKhachHang();
	            System.out.println("Số tiền của quý khách = " + arrKhachHang.get(i).tinhTien2());
	            Tongtienve = Tongtienve + arrKhachHang.get(i).tinhTien2();
	            
	        }
            System.out.println("Tổng tiền vé của chuyến bay  = " + Tongtienve);

}
}
