package my.day02;

import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println("��ǻ�Ͱ� ������ ���� : " + num);

		// 0���� 100���̿� �Է¹��� ���ڰ� �ִ°�?
		Scanner scan = new Scanner(System.in);
		int cout = 0;
		while (true) {
			System.out.println("0�� 100������ ���ڸ� �Է��ϼ���");
			int inputnum = scan.nextInt();

			if (inputnum >= 0 && inputnum < 100) {
				// System.out.println("�ùٸ� �Է��Դϴ�.");
				cout++;
				if (inputnum == num) {
					System.out.println(cout + "���� ���߼̽��ϴ�.");
					break;
				} else if (inputnum < num) {
					System.out.println(inputnum + "�� �������� �۽��ϴ�.");
				} else {
					System.out.println(inputnum + "�� �������� Ů�ϴ�.");
				}

			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}

		}
	}
}
