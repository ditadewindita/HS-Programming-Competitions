import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shield {
	
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(r.readLine());
		for(int i=0; i<x; i++){
			String in = r.readLine();
			if(in.indexOf("The shield is still up")>-1)
				System.out.println("It's a trap!");
			else
				System.out.println("Commence attack on the Death Star's main reactor.");
		}
	}

}
