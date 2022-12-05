package buoi67;
import java.util.Scanner;
import java.util.ArrayList;
public class bai1 {
	static ArrayList<String> s = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);

	public static void check(int n) {
		System.out.println("Nhap vao 1 chuoi: ");
		String s1 = sc.nextLine();
		for(int i=0;i<n;i++) {
			if(s.get(i).contains(s1)==true) {
				System.out.println(s.get(i));
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("So chuoi: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Nhap chuoi thu "+i);
			String s1=sc.nextLine();
			s.add(s1);
		}
		check(n);
	}
}
