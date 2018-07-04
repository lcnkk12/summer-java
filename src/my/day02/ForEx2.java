package my.day02;

public class ForEx2 {

	public static void main(String[] args) {
		
		System.out.println("1부터 10까지의 덧셈의 합을 구하시오:");
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum += i;
		}
		System.out.println(":" +sum);
	}

}
