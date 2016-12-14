import java.util.Scanner;


public class ErrorDetection {
	
	public static String turnBinary(int n){
		String x = Integer.toBinaryString(n);
		return x;
	}
	
	public static int isEven(String s){
		int c = 0;
		int x = s.length();
		for(int i=0; i<x; i++)
			if(Integer.parseInt(s.substring(i,i+1))==1)
				c++;
		if(c%2==0)
			return 0;
		return 1;
	}
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i=0; i<x; i++){
			int num = kb.nextInt();
			int check = kb.nextInt();
			int y = isEven(turnBinary(num));
			if(y==check)
				System.out.println("Valid");
			else
				System.out.println("Corrupt");
		}
	}

}
