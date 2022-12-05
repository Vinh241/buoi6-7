package buoi67;
import java.util.Scanner;
public class ThiSinh {
	private int SBD;
	private String hoten;
	private String Diachi;
	private int uutien;
	private static Scanner sc=new Scanner(System.in);
	private KhoiThi x = new KhoiThi();
	public int getSBD() {
		return SBD;
	}
	public void setSBD(int sBD) {
		SBD = sBD;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public int getUutien() {
		return uutien;
	}
	public void setUutien(int uutien) {
		this.uutien = uutien;
	}
	public KhoiThi getX() {
		return x;
	}
	public void setX(KhoiThi x) {
		this.x = x;
	}
	public void input() {
		System.out.println("Nhap So bao danh: ");
		setSBD(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap Ho va ten: ");
		setHoten(sc.nextLine());
		System.out.println("Nhap dia chi: ");
		setDiachi(sc.nextLine());
		System.out.println("Nhap muc uu tien: ");
		setUutien(sc.nextInt());
		sc.nextLine();
		x.input();
		
	}
	public void output() {
		System.out.printf("%-10s %-10s %-10s %-10s",getSBD(),getHoten(),getDiachi(),getUutien());
		x.output();
	}
}
