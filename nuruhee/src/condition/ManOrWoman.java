package condition;

import java.util.Scanner;

public class ManOrWoman {
public void ssn() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("주민번호를 입력하세요.");
	String ssn = scanner.next(), msg;
	/*
	 charAt(n) 이 메소드는 0 부터 시작하여
	 n번째 글자 하나만 출력하는데, 
	 출력결과를 프로그래밍에서는 리턴값이라고 한다.
	 */
	char ch = ssn.charAt(7);
	switch (ch) {
	case '1': case '3':msg="남자";break;
	case '2': case '4':msg="여성";break;
	case 5:msg="외국인";break;
	
	default:System.out.println("당신은"+ msg + "입니다");
	break;
	}
}
}
