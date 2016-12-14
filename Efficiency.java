import java.util.ArrayList;
import java.util.Scanner;

public class Efficiency {
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int x=0;
		while(x<4){
			int c = kb.nextInt();
			ArrayList<Integer> b = new ArrayList<Integer>();
			for(int i=0; i<c; i++){
				b.add(kb.nextInt());
				b.add(kb.nextInt());
				x++;
			}
			int a = c;
			if(a>4)
				a-=4;
			System.out.println(c-1 + " " + c+a+1);
		}
	}

}
