package cast;

/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : ��ĳ���� ����
 */
public class Upcasting {
public static void main(String[] args) {
	/*
	 * UpCasting(��ĳ����)
	 * - ��ȯ(conversion)
	 * - ������ �ڵ���ȯ
	 * - ������ Ÿ���� ����� �� ������ ���� ��
	 * - ũ�Ⱑ ���� ������ Ÿ���� ��������
	 * - ũ�Ⱑ ū ������ Ÿ���� �������� �Ҵ� �� ��
	 */
	int a = 3; // ����
	double b = 3.14D; // �Ǽ�
	b = a; // 64 ��Ʈ ������Ÿ�Կ� 32��Ʈ ������ Ÿ���� ��� ���
			// �̸� ��ĳ�����̶� �Ѵ�
	System.out.println("��ĳ���� ��� : " + b);
}
}
