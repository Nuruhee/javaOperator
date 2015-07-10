package condition;

import java.util.Scanner;

public class SwitchAvg {
public void Calc() {
	String name;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	int total = 0;
	int avg = 0;
	char suc;
	System.out.println("이름을 입력 하시오");
	Scanner scanner = new Scanner(System.in);
	name = scanner.nextLine();
	System.out.println("국어 점수를 입력 하시오");
	kor = scanner.nextInt();
	System.out.println("영어 점수를 입력 하시오");
	eng = scanner.nextInt();
	System.out.println("수학 점수를 입력 하시오");
	math = scanner.nextInt();
	total = kor + eng + math;
	avg = total / 3;
	switch (avg/10) {
	case 10 : System.out.println("만점"); break;
	case 9 : System.out.println("장학생"); break;
	case 8 : System.out.println("합격"); break;
	case 7 : System.out.println("불합격"); break;
	default:
		break;
	}
}
}
