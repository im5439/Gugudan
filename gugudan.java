package gugudan;
import java.util.Scanner;
public class gugudan {
	public static void main(String[] args) {
		//����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ���
		System.out.println("����� ����?");
		Scanner sc = new Scanner(System.in);
		String inputvalue = sc.nextLine(); //next - �ܾ� nextLine - ���� nextInt - ����
		
		String[] splitvalue = inputvalue.split(",");
		int first = Integer.parseInt(splitvalue[0]); //���ڿ��� ���ڷ� ��ȯ�ϱ� Integer.parseInt
		int second = Integer.parseInt(splitvalue[1]);
		
		for(int i =2; i<=first; i++) {
		for(int g =1; g<=second; g++) {
			System.out.println(i*g);

		}
		}
					
	}
		
}


