package ifCondition;
import java.util.Scanner;
/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : if-else 예제
 * 프로그램을 하나 개발해야 합니다.
 * 오더는
 * 학생	국어	영어	수학	총점	평균	합격여부
 -----------------------------------
 (홍길동)(90)(90)(90)(270)(90)(합격)
 평균이 90점 이상이면 장학생
 평균이 70점 이상 ~90점 미만이면 합격
 평균이 70점 미만이면 불합격
 */
public class CalcavgMain {
	public void CalcAvg2() {
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
		if (avg > 90) {
			System.out.println("이름  국어  영어  수학  총점  평균  합격여부\n" + "-------------------------\n" + name + " " + kor + " "
					+ eng + " " + math + " " + total + " " + avg + " 장학생");
		} else if (avg > 70 || avg < 90) {
			System.out.println("이름 국어 영어 수학 총점 평균 합격여부\n" + "------------------------\n" + name + " " + kor + " " + eng
					+ " " + math + " " + total + " " + avg + " 합격");
		} else {
			System.out.println("이름 국어 영어 수학 총점 평균 합격여부\n" + "-------------------------\n" + name + " " + kor + " " + eng
					+ " " + math + " " + total + " " + avg + " 불합격");
		}

	}

}
