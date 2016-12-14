import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weight{
	
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());
		for(int i=0; i<n; i++){
			String[] in = r.readLine().split(" ");
			int lb = Integer.parseInt(in[0]);
			int oz = Integer.parseInt(in[1]);
			int a = (16*lb)+oz;
			double b = (a*0.90)/16;
			System.out.println((int)b + " " + (int)((b-(int)b)*16));
			
		}
	}


}
