import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args)
	{
		// 8, 9단
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number < 2) {
			System.out.println("값을 잘못 입력했습니다.");}
			else if (number > 9) {
				System.out.println("값을 잘못 입력했습니다.");
			}
			else {
				for(int i = 1; i <10; i++){
				System.out.println(number * i);
			}
		}
		
		
//		// 6단
//		int g = 1;
//		while(g < 10) {
//			System.out.println(6 * g);
//			g = g + 1; //g++
//		}
//		
//		// 7단
//		for(int f = 1; f < 10; f++) {
//			System.out.println(7 * f);
//		}
//		
		
		// 2단
//		System.out.println("2단");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
		
		// 3단		
//		System.out.println("3단");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
		
		// 4단
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
		
		
		
	}
}
