package my.day02;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		
		System.out.println("1에서 10까지의 숫자 중 짝수 또는 홀수의 합을 구하세요:");
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++)
		{
			
			if(i % 2 == 0){
				sum1 += i;
			}else {
				sum2 += i;	
			}
			
		}
		
		System.out.println("짝수의 합 : " +sum1);
		System.out.println("홀수의 합 : " +sum2);
	}

}
