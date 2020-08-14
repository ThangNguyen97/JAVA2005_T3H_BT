import java.util.Scanner;

public class KhachHang {
	public String HoTen;
	public String GioiTinh;
	public int Tuoi;
	public String TenChuyenBay;
	public int ThoigianBay;
	public int soluongve;
	public int loaive;
	public int tienve;

//    public KhachHang() {
//        super();
//    }
	public void KhachHang(String HoTen, String GioiTinh, int Tuoi, String TenChuyenBay, int ThoigianBay, int soluongve,
			int loaive, int tienve) {
		this.HoTen = HoTen;
		this.GioiTinh = GioiTinh;
		this.Tuoi = Tuoi;
		this.TenChuyenBay = TenChuyenBay;
		this.ThoigianBay = ThoigianBay;
		this.soluongve = soluongve;
		this.loaive = loaive;
//		this.tienve = tienve;
	}

	public void nhapThongTinKhachHang() {
		Scanner scanner = new Scanner(System.in);

		// nhập thông tin khách trọ

		System.out.print("Nhập họ tên: ");
		HoTen = scanner.nextLine();
		System.out.print("Nhập Giới tính: ");
		GioiTinh = scanner.nextLine();
		System.out.print("Nhập Tuổi: ");
		Tuoi = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập Tên chuyến bay: ");
		TenChuyenBay = scanner.nextLine();
		System.out.print("Nhập thời gian bay: ");
		ThoigianBay = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập số lượng vé: ");
		soluongve = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập loại vé: ");
		System.out.println("Nhập loại vé (Nhấn phím 1 2 3 để chọn)");
		System.out.println("1. Cao Cấp");
		System.out.println("2. Thương Gia");
		System.out.println("3. trung cấp");
		loaive = Integer.parseInt(scanner.nextLine());
//	        tienve = tinhTien();
	}

	public void hienThiThongTinKhachHang() {

		System.out.println("Họ và tên: " + HoTen);
		System.out.println("Giới Tính: " + GioiTinh);
		System.out.println("Tuổi: " + Tuoi);
		System.out.println("Tên Chuyến Bay: " + TenChuyenBay);
		System.out.println("Thời gian Bay: " + ThoigianBay);
		System.out.println("Số lượng vé: " + soluongve);
//	        System.out.println("Loại vé: " + ve);
//	        System.out.println("Tổng giá vé: " + tinhTien());

	}

	public int tinhTien2() {
		if (Tuoi < 6 && loaive == 3) {
			return (int) (soluongve * 2000 * 0.8);
		}
		if (ThoigianBay >= 20 && ThoigianBay <= 24 || ThoigianBay >= 0 && ThoigianBay <= 4 && loaive == 1) {
			return (int) (soluongve * 0.5 * 10000);
		}
		if (ThoigianBay >= 20 && ThoigianBay <= 24 || ThoigianBay >= 0 && ThoigianBay <= 4 && loaive == 2) {
			return (int) (soluongve * 0.5 * 5000);
		}
		if (ThoigianBay >= 20 && ThoigianBay <= 24 || ThoigianBay >= 0 && ThoigianBay <= 4 && loaive == 3) {
			return (int) (soluongve * 0.5 * 2000);
		}
		if (loaive == 1) {
			return soluongve * 10000;
		}
		if (loaive == 2) {
			return soluongve * 5000;
		}
		if (loaive == 3) {
			return soluongve * 2000;
		}

		return 0;
	}
}