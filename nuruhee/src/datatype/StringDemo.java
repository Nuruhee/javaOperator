package datatype;
/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : 스트링 타입에 대한 문법
 */
public class StringDemo {
public static void main(String[] args) {
	char c = 'c'; 
	// 맨 긑에 있는 ; 이것을 구분자라고 부른다.
	// 카 데이터타입의 c 변수에 알파벳 c 값을 할당함
	System.out.println(c);
	String s = "abc";
	System.out.println(s);
	System.out.println("abc");
	// 알파벳 하나만 출력할 경우는 char 타입을 사용하고
	// 하나 이상 복수의 문자열을 출력할 경우는
	// String 타입을 사용한다.
	// 주의할 점은 싱글쿼터와 더블쿼터에 유의
}
}
