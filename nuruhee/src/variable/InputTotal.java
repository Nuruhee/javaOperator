package variable;
import java.util.Scanner;

public class InputTotal {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); 
	System.out.println("���������� �Է��ϼ���");
	int kor = scanner.nextInt();
	System.out.println("���������� �Է��ϼ���");
	int eng = scanner.nextInt();
	System.out.println("���������� �Է��ϼ���");
	int math = scanner.nextInt();
	int total = kor+eng+math;
	int avg = (kor+eng+math)/3;
	System.out.println("���� : " + total);
	System.out.println("��� : " + avg);
}
}
