package operator;
import java.util.Scanner;
/*
 * 입력받은 초를 시간 분 초로 환산하는 프로그램
 */
public class TypeSeperator {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int second=0, minute=0, hour=0, minute2=0, hour2=0;
	
	System.out.println("초를 입력하시오");
	second = scanner.nextInt();
	minute = second/60;
	hour = second/3600;
	minute2 = second%60;
	System.out.println(second+"초는 \n"+hour+"시\n"+minute+"분\n"+minute2+"초입니다.");

	
}
}
