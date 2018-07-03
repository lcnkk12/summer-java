package my.day02;

import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어의 점수를 입력하세요:");
		int korea = scan.nextInt();
		System.out.println("영어의 점수를 입력하세요:");
		int english = scan.nextInt();
		System.out.println("수학의 점수를 입력하세요:");
		int math = scan.nextInt();		
		
		double average = (korea + english + math) / 3;
		
		System.out.println("평균 점수는 " + average + "입니다.");
		
		if(korea > average) {
			System.out.println("국어는 평균보다 높습니다.");
		}else if(korea < average) {
			System.out.println("국어는 평균보다 낮습니다.");
		}else {
			System.out.println("국어는 평균입니다.");
		}
		
		if(english > average) {
			System.out.println("영어는 평균보다 높습니다.");
		}else if(english < average) {
			System.out.println("영어는 평균보다 낮습니다.");
		}else {
			System.out.println("영어는 평균입니다.");
		}
		
		if(math > average) {
			System.out.println("수학은 평균보다 높습니다.");
		}else if(math < average) {
			System.out.println("수학은 평균보다 낮습니다.");
		}else {
			System.out.println("수학은 평균입니다.");
		}
		
		
		
	}

}
