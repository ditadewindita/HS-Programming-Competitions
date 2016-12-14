import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Birthday {
	
	private static String[] m = {"","January","February","March","April","May","June","July","August","September","October","November","December"};

	public static int month(String s){
		for(int i=0; i<m.length; i++)
			if(m[i].equals(s))
				return i;
		return 0;
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());
		for(int i=0; i<n; i++){
			String[] f = r.readLine().split(" ");
			String[] s = r.readLine().split(" ");
			int fm = month(f[0]);
			int sm = month(s[0]);
			int fy = Integer.parseInt(f[2]);  
			int sy = Integer.parseInt(s[2]);
			
			System.out.println(Math.abs((12*(sy-fy)) + sm-fm));
			
			
		}
	}
}
