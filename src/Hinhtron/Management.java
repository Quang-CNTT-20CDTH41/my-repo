package Hinhtron;

public class Management {

	public static void main(String[] args) {
		Hinhtron b = new Hinhtron();
		b.setBanKinh(10);
		double chuvi = (double) 2 * b.getBanKinh() * Math.PI;
		System.out.println("chu vi cua hinh tron: " + chuvi);
		double dientich = (double) b.getBanKinh()* b.getBanKinh() * Math.PI;
		System.out.println("dien tich hinh tron: " + dientich);
		
	}

}
