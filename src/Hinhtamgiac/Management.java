package Hinhtamgiac;

public class Management {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a,b,c;
//		System.out.println("nhap canh a: ");
//		c = sc.nextInt();
//		System.out.println("nhap canh b: ");
//		b = sc.nextInt();
//		System.out.println("nhap canh c: ");
//		c = sc.nextInt();

		Hinhtamgiac a = new Hinhtamgiac();
		a.setA(5);
		a.setB(6);
		a.setC(7);
		int chuvi = a.getA() + a.getB() + a.getC();
		System.out.println("chu vi cua hinh tam giac thuong la: " + chuvi);
		double p = chuvi/2;
		double dientich = Math.sqrt(p*(p - a.getA())*(p - a.getB()) * (p - a.getC()));
		System.out.println("dien tich cua hinh tam giac thuong la: " + dientich);
	}

}
