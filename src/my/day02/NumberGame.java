package my.day02;

import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println("컴퓨터가 생성한 난수 : " + num);

		// 0부터 100사이에 입력받은 숫자가 있는가?
		Scanner scan = new Scanner(System.in);
		int cout = 0;
		while (true) {
			System.out.println("0과 100사이의 숫자를 입력하세요");
			int inputnum = scan.nextInt();

			if (inputnum >= 0 && inputnum < 100) {
				// System.out.println("올바른 입력입니다.");
				cout++;
				if (inputnum == num) {
					System.out.println(cout + "번에 맞추셨습니다.");
					break;
				} else if (inputnum < num) {
					System.out.println(inputnum + "은 난수보다 작습니다.");
				} else {
					System.out.println(inputnum + "은 난수보다 큽니다.");
				}

			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}
	}
}
