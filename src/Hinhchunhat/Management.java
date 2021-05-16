package Hinhchunhat;
import java.util.Scanner;
public class Management {
	public static void main(String[] args) {
		//			Scanner sc = new Scanner(System.in);
		//			System.out.println("nhap chieu dai: ");
		//			int chieudai = sc.nextInt();
		//			System.out.println("nhap chieu rong: ");
		//			int chieurong = sc.nextInt();

		Hinhchunhat a = new Hinhchunhat();
		a.setDai(5);
		a.setRong(6);
		int chuvi = (a.getDai() + a.getRong())*2;
		System.out.println("chu vi hinh chu nhat la: " + chuvi );
		int dientich = a.getDai() * a.getRong();
		System.out.println("dien tich hinh chu nhat la: " + dientich);
	}

}
