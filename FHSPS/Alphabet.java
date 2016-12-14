import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Alphabet {

	public static void main(String[] args) throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		int n=Integer.parseInt(s);
		String t;
		int yes = 0;
		String print = "";
		for(int i=1;i<=n;i++){
			
			String alph=r.readLine(); //ALPH
			int test = Integer.parseInt(r.readLine()); //TEST
			print+="Alphabet " + alph + ":";
			
			for(int j=0; j<test; j++){ //TESTS
				t = r.readLine();
				for(int k=0; k<t.length(); k++){
					if(alph.indexOf(t.substring(k,k+1))>-1)
						yes++;
				}
				if(j!=test)
						print+="\n";
				if(yes==t.length())
					print+="YES";
				else
					print+="NO";
				yes=0;
			}	
			
				print+="\n\n";
		} //n end
		System.out.print(print);
	}
}
