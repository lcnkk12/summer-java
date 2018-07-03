package my.day02;

public class ForEx2 {

	public static void main(String[] args) {
		
		System.out.println("1에서 10까지의 합을 구하세요:");
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum += i;
		}
		System.out.println("합:" +sum);
	}

}
