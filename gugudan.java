package gugudan;
import java.util.Scanner;
public class gugudan {
	public static void main(String[] args) {
		//사용자가 입력한 값에 따라 크기가 다른 구구단을 계산
		System.out.println("출력할 단은?");
		Scanner sc = new Scanner(System.in);
		String inputvalue = sc.nextLine(); //next - 단어 nextLine - 라인 nextInt - 정수
		
		String[] splitvalue = inputvalue.split(",");
		int first = Integer.parseInt(splitvalue[0]); //문자열을 숫자로 변환하기 Integer.parseInt
		int second = Integer.parseInt(splitvalue[1]);
		
		for(int i =2; i<=first; i++) {
		for(int g =1; g<=second; g++) {
			System.out.println(i*g);

		}
		}
					
	}
		
}


