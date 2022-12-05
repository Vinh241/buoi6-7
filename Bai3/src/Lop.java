import java.util.*;
public class Lop {
	static ArrayList<HocSinh> l = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int malop;
		String tenlop;
		System.out.println("Nhap ma lop: ");
		malop = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten lop: ");
		tenlop=sc.nextLine();
		System.out.println("Ma lop: " + malop);
		System.out.println("Ten lop: " + tenlop );
		while(true) {
				System.out.println("Menu\n"+
						"1.Thêm học sinh mới. \r\n"
						+ "2.Xuất ra thông tin các học sinh\r\n"
						+ "3.Hiển thị các học sinh 20 tuổi. \r\n"
						+ "4.Cho biết số lượng các học sinh có tuổi là 23 và quê ở DN\r\n"
						+ "5.Sắp xếp sinh viên tăng dần theo quê quán\r\n"
						+ "6.Kết thúc chương trình\r\n"
						+ "");
				System.out.println("Chon: ");
				int op = sc.nextInt();
				switch(op) {
				case 1:{
					them();
					break;
					}
				case 2:{
					xuat();
					break;
				}
				case 3:{
					tren20tuoi();
					break;
				}
				case 4:{
					tuoidiachi();
					break;
				}
				case 5:{
					sapxep();
					break;
				}
				case 6:
				{
					System.out.println("Thoat");
					System.exit(0);
				}
				default:{
					System.out.println("Nhap loi");
				}
				}
		}
	}
	public static void them() {
		HocSinh hs = new HocSinh();
		hs.input();
		l.add(hs);
	}
	public static void xuat() {
		System.out.printf("%-15s %-10s %-10s\n","Ho ten","Tuoi","Que quan");
		for(HocSinh hs: l) {
			hs.output();
		}
	}
	public static void tren20tuoi() {
		System.out.println("Cac hoc sinh tren 20 tuoi:");
		System.out.printf("%-15s %-10s %-10s\n","Ho ten","Tuoi","Que quan");
		for(HocSinh hs: l) {
			if(hs.getTuoi() >20) {
				hs.output();
			}
		}
	}
	public static void tuoidiachi() {
		System.out.println("Cac hoc sinh 23 tuoi va o Da Nang:");
		System.out.printf("%-15s %-10s %-10s\n","Ho ten","Tuoi","Que quan");
		for(HocSinh hs: l) {
			if(hs.getTuoi() ==23 && hs.getDiachi().equals("Da Nang")) {
				hs.output();
			}
		}
	}
	public static void sapxep() {
		int n = l.size();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(l.get(i).getDiachi().compareTo(l.get(j).getDiachi()) >0 ) {
					HocSinh hs = l.get(i);
					l.set(i,l.get(j));
					l.set(j, hs);
				}
			}
		}
	}
}
