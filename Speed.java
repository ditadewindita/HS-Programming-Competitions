import java.util.Scanner;

public class Speed {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double dist = kb.nextDouble()/5280;
		while(dist!=0){
			double time = kb.nextDouble()/3600;
			double limit = kb.nextDouble();
			if((dist/time)>limit)
				System.out.println("SPEEDING");
			else
				System.out.println("NOT SPEEDING");
			dist = kb.nextDouble()/5280;
		}
	}

}
