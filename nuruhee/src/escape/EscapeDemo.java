package escape;
import java.util.Scanner;
public class EscapeDemo {
public static void main(String[] args) {
	/*
	 * ����, ȫ�浿���� 30���̰�
	 * ������ ���� 25���Դϴ�.
	 * ȫ�浵���� �����ž��� �������̸� 
	 * ����ϴµ� ...
	 * "ȫ�浿 ���� �����ž����� 5���� �����ϴ�."
	 */
	
	//�������� �����
	int hongAge = 0, kimAge=0, age=0;
	String hong = "", kim="";
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("�̸��� �Է��ϼ���");
	hong = scanner.next();
	System.out.println("�̸��� �Է��ϼ���");
	kim = scanner.next();
	System.out.println("ȫ�浿���� ���̸� �Է��Ͻÿ�");
	int hongage = scanner.nextInt();
	System.out.println("�����ž��� ���̸� �Է��Ͻÿ�");
	int kimage = scanner.nextInt();
	
	age = hongage-kimage;
	System.out.println(hong+"����\t "+kim+ "������\t "  + age + "����\n �����ϴ�.");
}
}
