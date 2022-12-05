package buoi67;
import java.util.Scanner;
public class KhoiThi {
	private static Scanner sc=new Scanner(System.in);
	private String mon1,mon2,mon3;

	public String getMon1() {
		return mon1;
	}

	public void setMon1(String mon1) {
		this.mon1 = mon1;
	}

	public String getMon2() {
		return mon2;
	}

	public void setMon2(String mon2) {
		this.mon2 = mon2;
	}

	public String getMon3() {
		return mon3;
	}

	public void setMon3(String mon3) {
		this.mon3 = mon3;
	}
	public void input() {
		System.out.println("Nhap mon 1: ");
		setMon1(sc.nextLine());
		System.out.println("Nhap mon 2: ");
		setMon2(sc.nextLine());
		System.out.println("Nhap mon 3: ");
		setMon3(sc.nextLine());
	}
	public void output() {
		String a= getMon1(),b=getMon2(),c=getMon3();
		if(a.equals("Toan")==true && b.equals("Ly")==true && c.equals("Hoa")) {
			System.out.printf("%-10s\n","Khoi A");
		}else if(a.equals("Toan") && b.equals("Hoa") && c.equals("Sinh")) {
			System.out.printf("%-10s\n","Khoi B");
		}else {
			System.out.printf("%-10s\n","Khoi C");
		}
	}
}
