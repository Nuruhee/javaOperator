package operator;
import java.util.Scanner;
/*
 * �Է¹��� �ʸ� �ð� �� �ʷ� ȯ���ϴ� ���α׷�
 */
public class TypeSeperator {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int second=0, minute=0, hour=0, minute2=0, hour2=0;
	
	System.out.println("�ʸ� �Է��Ͻÿ�");
	second = scanner.nextInt();
	minute = second/60;
	hour = second/3600;
	minute2 = second%60;
	System.out.println(second+"�ʴ� \n"+hour+"��\n"+minute+"��\n"+minute2+"���Դϴ�.");

	
}
}
