package gugudan;
import java.util.Scanner;
public class gugupt {
	public static void main(String[] args) {
		System.out.println("����� ����?");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); //�Է��� ���� ��ū�� int�� ��ĵ�մϴ�.
//		nextInt () �������� �޼ҵ� ȣ���� ȣ�� nextInt (radix)�� ��Ȯ�� ������ ������� �۵��մϴ�. ���⼭ radixis���� ��ĳ���� �⺻ ����Դϴ�.
//		inputThrows : InputMismatchException���� ��ĵ �� int-���� ��ū�� ���� ���Խİ� ��ġ���� �ʰų� rangeNoSuchElementException�� ��� ���-�Է��� ���� �� ��� IllegalStateException-�� ��ĳ�ʰ� ���� ���
		
		if(number <2) {
			System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
		}
        else if(number >19) {
			System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
		}
		else {
		
		   for(int i=1; i<(number+1); i++) {
			   System.out.println(number * i);
	       }
		         		
	    }
	
    }
}