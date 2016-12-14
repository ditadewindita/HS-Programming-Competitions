import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Pegs {
	
	public static void main(String[] args) throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		int n=Integer.parseInt(s);
		String print = "";
		for(int i=1;i<=n;i++){
			ArrayList<int[]> circle = new ArrayList<int[]>();
			ArrayList<int[]> pegs = new ArrayList<int[]>();
			int p=Integer.parseInt(r.readLine());
			for(int j=0; j<p; j++){
				String peg = r.readLine();
				int[] indPeg = {Integer.parseInt(peg.substring(0,1)),Integer.parseInt(peg.substring(2,3)),Integer.parseInt(peg.substring(4,5))};
				pegs.add(indPeg);
				
			}
			int c = Integer.parseInt(r.readLine());
			for(int k=0; k<c; k++){
				String circ = r.readLine();
				int[] indCirc = {Integer.parseInt(circ.substring(0,1)),Integer.parseInt(circ.substring(2,3)),Integer.parseInt(circ.substring(4,5))};
				circle.add(indCirc);
			}
			
			int win = 0;
			int max = Math.max(circle.size()-1, pegs.size()-1);
			for(int l=0; l<max; l++)
				if((circle.get(i)[2]>=pegs.get(l)[2]) && (circle.get(i)[0]>=pegs.get(l)[0]) && (circle.get(i)[1]>=pegs.get(l)[1]))
					win++;
			if(win>0)
				System.out.println("Mr. Dencker won the game!");
			else
				System.out.print("Why oh why? It was a simple game.");
			pegs.clear();
			circle.clear();
			if(i!=n)
				print+="\n";
		}// FORLOOP
		
	}// MAIN

}
