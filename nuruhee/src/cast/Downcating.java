package cast;
/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : �ٿ�ĳ���� ����
 */
public class Downcating {
public static void main(String[] args) {
	/*
	 * Down-Casting(�ٿ�ĳ����)
	 * -���� ����ȯ
	 * - ���α׷����� ������ Ÿ���� ū ����(64��Ʈ)�� ������ Ÿ���� 
	 * - ���� ���� (32��Ʈ)�� �Ҵ��Ϸ� �� �� ����� (int) ���� Ÿ���� �����ϴ� ��
	 * - �ٸ�, �������� �ս��� �߻���
	 * - �����ڴ� ���� �ٿ�ĳ������ �Ϸ��� ���� ���� ��Ŭ������ ���� �ڵ�����
	 * - add cast �Ѵ�. 
	 */
	int a = 3;
	double b = 3.14;
	a = (int) b;
	System.out.println("�ٿ�ĳ���� ��� : " + a);
}
}
