package bai4;
import java.util.Scanner;
public class Nguoi {
	static Scanner sc = new Scanner(System.in);
	private int ms,tuoi;
	private String hoten,que;
	public int getMs() {
		return ms;
	}
	public void setMs(int ms) {
		this.ms = ms;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public void input() {
		System.out.println("Nhap ma so giao vien: ");
		setMs(sc.nextInt());
		System.out.println("Nhap tuoi: ");
		setTuoi(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap Ho va ten: ");
		setHoten(sc.nextLine());
		System.out.println("Nhap que quan: ");
		setQue(sc.nextLine());
	}
	public void output() {
		System.out.printf("%-10d %-10d %-10s %-10s",getMs(),getTuoi(),getHoten(),getQue());
	}
}
