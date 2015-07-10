package condition;
import java.util.Scanner;
public class BigNumber {
public static void main(String[] args) {
	/*
	 * 문제 ) 학생 3명의 이름과 점수를 입력받아서 가장 큰 수를 출력
	 * 결과 )
	 * 1,2,3
	 * 1등은 홍길동이며 98 점입니다.
	 */
int a=0,b=0,c=0;
String name1,name2,name3;
Scanner scanner = new Scanner(System.in);	
System.out.println("이름을 입력하시오");
name1 = scanner.next();
System.out.println("성적을 입력하시오");
a = scanner.nextInt();
System.out.println("이름을 입력하시오");
name2 = scanner.next();
System.out.println("성적을 입력하시오");
b = scanner.nextInt();
System.out.println("이름을 입력하시오");
name3 = scanner.next();
System.out.println("성적을 입력하시오");
c = scanner.nextInt();

if ((a>b) && (a>c)){
	System.out.println(name1 + "씨는 " + a +" 점으로 1등입니다.");
	}
else if ((b>a)&&(b>c)){
	System.out.println(name2 + "씨는 " + b +" 점으로 1등입니다.");
	}
	else if ((c>a)&&(c>b)){
		System.out.println(name3 + "씨는 " + c +" 점으로 1등입니다.");
	}
	else{System.out.println("동점이 있습니다.");
	}
}
}