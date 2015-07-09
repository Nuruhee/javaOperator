package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : 사칙연산 계산 프로그램
 */
public class ArithemeticCalc {
	/*
	 오더
	 - 사칙연산 게산기
	 - 덧셈, 뺄셈, 곱셈, 나눗셈(목 : (), 나머지:())
	 - 사칙연산 기호도 입력 받는다.
	 - 출력결과
	 - ***심플 계산기***
	 - 5 X 5 = 25
	 - 5 + 5 = 10
	 - 6 ÷ 5 = 1 ... 1
	 - 5 - 6 = -1
	 */
	public static void Caclfour(){
	int a =0,b=0,c=0,d=0,e=0,f=0,g=0;
	String z;
	Scanner scanner = new Scanner(System.in);
	System.out.println("***누리의 심플 계산기***");
	System.out.println("숫자를 입력하시오");
	a = scanner.nextInt();
	System.out.println("숫자를 한 번 더 입력하시오");
	b = scanner.nextInt();
	System.out.println("연산자를 입력하시오 ex) +, *, -, ÷");
	z = scanner.next();
	c = a*b;
	d = a-b;
	e = a/b;
	f = a%b;
	g = a+b;
	
	if(z.equals("+")){
		System.out.println(a+ " + " + b + " = " + g);
		}
	
	else if(z.equals("*")){
		System.out.println(a + "*" + b +" = "+ c);
	}
	else if(z.equals("-")){
		System.out.println(a + "-" + b +" = "+ d);
	}else if(z.equals("÷")){
			System.out.println(a + "÷"+ b +" = "+ e + "..." + f);
	}else{System.out.println("입력된 값이 올바르지 않습니다.");
	}

	
	}
	
	public static void main(String[] args) {
	Caclfour();
	}
}
	