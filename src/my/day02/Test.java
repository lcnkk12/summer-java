package my.day02;

import java.util.Scanner;  //��Ű���� �̸��� ��. Scanner�� ������ util�̶�� ��Ű���� �����.

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �ּ� ǥ���Դϴ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�й��� �Է��ϼ���.");
		int num1 = scan.nextInt();
		//�̸��� �Է��ϼ���.�ϴ� ���ڿ� ����ϱ�
		//��ĳ�� ��ü�� �̿��Ͽ� �̸��� �Է¹޾ƿ���
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scan.next(); //���ڸ� �޾ƿö� next  ���ڿ��� nextLine
		
		System.out.println("�й�:" + num1);
		System.out.println("�̸�:" + name);
		
		
		

	}

}
