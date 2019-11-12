
public class pt {
	public static void main(String[] args)
	{
//		System.out.println("연습하기");
//		char result = 1;
//		System.out.println(result);
		
		int[] result = new int[9]; 
		for(int i=0; i<result.length; i++) {
			result[i] = (i + 1);
			
		}
		for(int g=1; g<9; g++) {
		for(int i=0; i<result.length; i++) {
			System.out.println((g+1) * result[i]);
		}
		}
	
		
		
	}

}
