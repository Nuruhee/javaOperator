package condition;

public class IfElse {
public static void main(String[] args) {
	int x = 1, y = 2; // 지변 초기화
	if ((x==1) && (y==1)){ // && 엔퍼센트라 읽고 and 연산자이다.
		System.out.println("x 는 1 이면서, y도 2이다.");
	}else if ((x==3)||(y==3)){ // ||컬럼이라 읽는다. or 연산자이다.
		System.out.println("x 는 1 이거나, y 는 2 이다.");
	}else{
		System.out.println("해당 사랑이 없습니다.");
	}
}
}
