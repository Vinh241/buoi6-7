package buoi67;
import java.util.Scanner;
import java.util.ArrayList;
public class bai2 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<ThiSinh> ts = new ArrayList<>();
	public static void main(String[] args) {
		while(true) {
		System.out.println("Menu: \n"
				+ "1.Thêm mới thí sinh\n"
				+"2.Hiển thị thông tin của thí sinh và khối thi của thí sinh\n"
				+"3.Tìm kiếm theo số báo danh.\n" 
				+"4.Thoát khỏi chương trình\n");
		
			int op = sc.nextInt();
			switch(op) {
				case 1:
					ThiSinh a =new ThiSinh();
					a.input();
					ts.add(a);
					break;
				case 2:{
					for(ThiSinh x:ts) {
						x.output();
					}
					break;
				}
				case 3:{
					System.out.println("Nhap so bao danh tim kiem:");
					int k = sc.nextInt();
					for(ThiSinh x :ts) {
						if(x.getSBD()==k) {
							x.output();
						}
					}
					break;
				}
				case 4:{
					System.out.println("Thoat chuong trinh");
					System.exit(0);
					break;
				}
				default:{
					System.out.println("Nhap khong hop le");
					break;
				}
					
			}
		}
	}
}
