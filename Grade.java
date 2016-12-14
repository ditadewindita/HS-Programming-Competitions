import java.util.Scanner;


public class Grade {

	private static int project, paper, midterm, exam;
	
	public static boolean ye(){
		int x = (int)((project*0.15) + (paper*.20) + (midterm*.25));
		exam = (int)((90-x)/0.4);
		return exam>=0 && exam<=100;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i=0; i<x; i++){
			project = kb.nextInt();
			paper = kb.nextInt();
			midterm = kb.nextInt();
			if(ye())
				System.out.println(exam);
			else
				System.out.println("impossible");
		}
	}
}
