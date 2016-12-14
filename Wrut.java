import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wrut {
	
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());
		for(int i=0; i<n; i++){
			String[] in = r.readLine().split(" ");
			if(Integer.parseInt(in[0])+Integer.parseInt(in[1])==Integer.parseInt(in[2]))
				System.out.println("Correct!");
			else
				System.out.println("Wrut Row!");
		}
	}

}
