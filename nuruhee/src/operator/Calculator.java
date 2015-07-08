package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		a = scanner.nextInt();
		System.out.println("숫자를 다시 한 번 입력하시오");
		b = scanner.nextInt();
		c = a * b;
		d = a / b;
		e = a % b;
		f = a - b;
		g = a + b;
		System.out.println("곱셉의 결과는\t" + c);
		System.out.println("몫의 결과는\t" + d);
		System.out.println("나머지의 결과는\t" + e);
		System.out.println("뺄셉의 결과는\t" + f);
		System.out.println("덧셈의 결과는\t" + g);
		/*
		 * @ order
		 * 
		 * @ 스캐너로 두 값을 입력받아서
		 * 
		 * @ 사칙연산 결과가 나오도록 하시오. 20 + 7 = 27 20 * 7 = 140
		 */
	}
}
