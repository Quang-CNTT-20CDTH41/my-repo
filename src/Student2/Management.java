package Student2;

import java.util.Scanner;

public class Management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.println("Nhap ten cua ban: ");
		name = sc.nextLine();
		System.out.println("Nhap tuoi cua ban: ");
		age = sc.nextInt();
		Student2 input = new Student2();
		input.setName(name);
		input.setAge(age);
		System.out.println("Ten cua ban la: " + input.getName() + "\nTuoi cua ban la: " + input.getAge() +" tuoi");
		
	}

}
