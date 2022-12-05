package bai4;
import java.util.Scanner;
import java.util.ArrayList;
public class RunMain {
	static ArrayList<CBGV> l = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void them() {
		CBGV nguoi =new CBGV();
		nguoi.input();
		l.add(nguoi);
	}
	public static ArrayList<CBGV> xoa() {
		ArrayList<CBGV> l1 = new ArrayList<>();
		System.out.println("Nhap ma so giao vien xoa");
		int n = sc.nextInt();
		for(CBGV i: l) {
			if(i.getNguoi().getMs() != n) {
				l1.add(i);
			}
		}
		return l1;
	}
	public static int luong(CBGV k) {
		return k.getLuongcung() + k.getLuongthuong() - k.getLuongphat();
	}
	public static void main(String[] args) {
		while(true) {
			System.out.println("Menu:\n"
					+ "1.Them 1 giao vien\n"
					+ "2.Xoa 1 giao vien\n"
					+ "3.Tinh luong thuc linh cho cac giao vien: \n"
					+ "4.Thoat");
			System.out.println("Chon: ");
			int op = sc.nextInt();
			switch(op){
			case 1:{
				them();break;
			}
			case 2:{
				l = xoa();
				break;
			}
			case 3:
			{
				System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","Ma Giao Vien","Tuoi","Ho ten","Que quan","Luong thuc");
				for(CBGV i:l) {
					i.getNguoi().output();
					System.out.println(luong(i) + "\n");
				}
				break;
			}
			case 4:{
				System.out.println("Thoat");
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Nhap loi");

			}
			
			}
		}
	}
}	
