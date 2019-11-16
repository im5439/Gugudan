package gugudan;
import java.util.Scanner;
public class gugupt {
	public static void main(String[] args) {
		System.out.println("출력할 단은?");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); //입력의 다음 토큰을 int로 스캔합니다.
//		nextInt () 형식의이 메소드 호출은 호출 nextInt (radix)와 정확히 동일한 방식으로 작동합니다. 여기서 radixis는이 스캐너의 기본 기수입니다.
//		inputThrows : InputMismatchException에서 스캔 된 int-다음 토큰이 정수 정규식과 일치하지 않거나 rangeNoSuchElementException을 벗어난 경우-입력이 소진 된 경우 IllegalStateException-이 스캐너가 닫힌 경우
		
		if(number <2) {
			System.out.println("입력이 잘못 되었습니다.");
		}
        else if(number >19) {
			System.out.println("입력이 잘못 되었습니다.");
		}
		else {
		
		   for(int i=1; i<(number+1); i++) {
			   System.out.println(number * i);
	       }
		         		
	    }
	
    }
}