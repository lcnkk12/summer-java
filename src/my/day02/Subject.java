package my.day02;

import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���:");
		int korea = scan.nextInt();
		System.out.println("������ ������ �Է��ϼ���:");
		int english = scan.nextInt();
		System.out.println("������ ������ �Է��ϼ���:");
		int math = scan.nextInt();		
		
		double average = (korea + english + math) / 3;
		
		System.out.println("��� ������ " + average + "�Դϴ�.");
		
		if(korea > average) {
			System.out.println("����� ��պ��� �����ϴ�.");
		}else if(korea < average) {
			System.out.println("����� ��պ��� �����ϴ�.");
		}else {
			System.out.println("����� ����Դϴ�.");
		}
		
		if(english > average) {
			System.out.println("����� ��պ��� �����ϴ�.");
		}else if(english < average) {
			System.out.println("����� ��պ��� �����ϴ�.");
		}else {
			System.out.println("����� ����Դϴ�.");
		}
		
		if(math > average) {
			System.out.println("������ ��պ��� �����ϴ�.");
		}else if(math < average) {
			System.out.println("������ ��պ��� �����ϴ�.");
		}else {
			System.out.println("������ ����Դϴ�.");
		}
		
		
		
	}

}
