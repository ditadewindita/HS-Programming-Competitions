import java.util.Scanner;

public class Divisible {
	
	public static boolean div(int a, int b){
		for(int i=1; i<=b; i++)
			if(a%i!=0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(kb.hasNextInt()){
			int num = kb.nextInt();
			int n = 1;
			while(!div(n, num))
				n++;
			System.out.println("First evenly divisible by all numbers from 1 to " + num + " is " + n + ".");
		}
	}

}
