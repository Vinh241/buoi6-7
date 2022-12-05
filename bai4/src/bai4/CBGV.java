package bai4;
import java.util.Scanner;
import java.util.ArrayList;
public class CBGV {
	static Scanner sc = new Scanner(System.in);
	private int luongcung,luongthuong,luongphat;
	private Nguoi nguoi=new Nguoi();
	public int getLuongcung() {
		return luongcung;
	}

	public void setLuongcung(int luongcung) {
		this.luongcung = luongcung;
	}

	public int getLuongthuong() {
		return luongthuong;
	}

	public void setLuongthuong(int luongthuong) {
		this.luongthuong = luongthuong;
	}

	public int getLuongphat() {
		return luongphat;
	}

	public void setLuongphat(int luongphat) {
		this.luongphat = luongphat;
	}

	public Nguoi getNguoi() {
		return nguoi;
	}

	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}
	public void input() {
		nguoi.input();
		System.out.println("Luong cung: ");
		setLuongcung(sc.nextInt());
		System.out.println("Luong thuong: ");
		setLuongthuong(sc.nextInt());
		System.out.println("Luong phat: ");
		setLuongphat(sc.nextInt());
		
	}
	
	
}	
