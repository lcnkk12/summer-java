package my.day02;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		
		System.out.println("1���� 10������ ���� �� ¦�� �Ǵ� Ȧ���� ���� ���ϼ���:");
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
		
		System.out.println("¦���� �� : " +sum1);
		System.out.println("Ȧ���� �� : " +sum2);
	}

}
