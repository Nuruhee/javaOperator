package variable;

public class Total {
public static void main(String[] args) {
	// ���������� ������ Ÿ���� �����̴�
	// �������� kor
	// �Ҵ�� ���� 80
	
	//int kor = 80;
	//int eng = 70;
	//int math = 50;
	// ���� ������ Ÿ���� ������ ������
	// ����� �Ҵ��� ���� ������ ���� �Ѵ�.
	int kor=60,eng=60,math=60;
	int total = 0; // �������� �ʱ�ȭ
	total = kor + eng + math; // ���� ���� ����
	int avg = 0; //��ձ��ϱ� : ���� / �����
	avg = total/3;
	System.out.println("���� : "+ total);
	System.out.println("��� : " +avg);
}
}
