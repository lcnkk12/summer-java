package my.day02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ������ ����ϴ� ���α׷� �ۼ��ϱ�
		//���� �������� ����ڷ� ���� �Է¹޾Ƽ� ����Ͻÿ�.
		//Scanner ��ü�� ����ϼ���.
		
		double radius ;
		double circle ;
		System.out.println("���� �������� �Է��ϼ���:");
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
		circle = radius*radius*3.14;
		
		System.out.println(circle);
	}

}
