import java.util.Scanner;
public class HocSinh {
	private String Hoten,diachi;
	private int tuoi;
	private static Scanner sc= new Scanner(System.in);
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public void input() {
		System.out.println("Nhap ho va ten: ");
		setHoten(sc.nextLine());
		System.out.println("Nhap Tuoi: ");
		setTuoi(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap que quan: ");
		setDiachi(sc.nextLine());
	}
	public void output() {
		System.out.printf("%-15s %-10d %-10s\n",getHoten(),getTuoi(),getDiachi());
	}
}
