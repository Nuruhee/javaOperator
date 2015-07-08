package escape;
import java.util.Scanner;
public class EscapeDemo {
public static void main(String[] args) {
	/*
	 * 문제, 홍길동씨는 30세이고
	 * 김유신 씨는 25세입니다.
	 * 홍길도씨와 김유신씨의 나이차이를 
	 * 출력하는데 ...
	 * "홍길동 씨는 김유신씨보다 5세가 많습니다."
	 */
	
	//지역변수 선언부
	int hongAge = 0, kimAge=0, age=0;
	String hong = "", kim="";
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름을 입력하세요");
	hong = scanner.next();
	System.out.println("이름을 입력하세요");
	kim = scanner.next();
	System.out.println("홍길동씨의 나이를 입력하시오");
	int hongage = scanner.nextInt();
	System.out.println("김유신씨의 나이를 입력하시오");
	int kimage = scanner.nextInt();
	
	age = hongage-kimage;
	System.out.println(hong+"씨는\t "+kim+ "씨보다\t "  + age + "세가\n 많습니다.");
}
}
