package operator;
/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : ���� ������ ����
 */
public class Ternary {
public static void main(String[] args) {
	int left=1,right=0,result=0; //���� �ʱ�ȭ
	boolean bool = true;
	/*
	 * ���� �����ڴ� if-else �� ��๮����
	 * ���ǽ�(bool)�� true ���̸� left���� ����ϰ�
	 * false�̸� right���� ����Ѵ�. 
	 */
	result = bool ? left : right;
	System.out.println("�� ���� ��� : "+ result);
	
}
}
