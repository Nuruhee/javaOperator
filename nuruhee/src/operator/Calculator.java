package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		a = scanner.nextInt();
		System.out.println("���ڸ� �ٽ� �� �� �Է��Ͻÿ�");
		b = scanner.nextInt();
		c = a * b;
		d = a / b;
		e = a % b;
		f = a - b;
		g = a + b;
		System.out.println("������ �����\t" + c);
		System.out.println("���� �����\t" + d);
		System.out.println("�������� �����\t" + e);
		System.out.println("������ �����\t" + f);
		System.out.println("������ �����\t" + g);
		/*
		 * @ order
		 * 
		 * @ ��ĳ�ʷ� �� ���� �Է¹޾Ƽ�
		 * 
		 * @ ��Ģ���� ����� �������� �Ͻÿ�. 20 + 7 = 27 20 * 7 = 140
		 */
	}
}
