package operator;

import java.util.Scanner;

/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : ���� �ڵ忡 ���� ����
 */
public class OpCode {
	public static void main(String[] args) {
		/*
		 * ������(opcode)�� ������ ���� �з��ȴ�.
		 * 1. ���� ������ = ++ , --, +, -
		 * 2. ���� ������ :
		 * 	(1) ��������� + ���ϱ�,- ����,* ��,
		 * 	/ ������(��),% ������(������)
		 * 	(2) �񱳿�����
		 * 	< > ! = (���� �ʴ�) ==(����)
		 * 	(3) ���׿�����
		 * 	(...)? TRUG : FALSE
		 * 	(4) ����(�Ҵ�)������
		 *  =
		 */
		// CTRL + SHIFT + O
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ʱⰪ�� �Է��ϼ���");
		int a = scanner.nextInt(); //��ĳ�ʷ� �Է��� ���� a �� �Ҵ���
		System.out.println("������ ���� �Է��ϼ���");
		int b = scanner.nextInt();
		
	}

}
