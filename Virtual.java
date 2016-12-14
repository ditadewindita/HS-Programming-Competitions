import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Virtual {
	
	public static int find(int a, int b, int c){
		int d = c/b;
		if(c%b==0)
			d--;
		return c+(a*d);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());
		for(int i=0; i<n; i++){
			String[] in = r.readLine().split(" ");
			int a = Integer.parseInt(in[0]);
			int b = Integer.parseInt(in[1]);
			int c = Integer.parseInt(in[2]);
			System.out.println(find(a,b,c));
		}
	}

}
