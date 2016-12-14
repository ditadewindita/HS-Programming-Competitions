import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nano {
	
	private static String[] a = {"{","-","|","\\","/","}"};

	
	public static boolean character(String s){
		for(int i=0; i<a.length; i++)
			if(s.equals(a[i]))
				return true;
		return false;
	}
	
	public static int find(String s){
		int x = 1;
		for(int i=0; i<s.length(); i++){
			if(character(s.substring(i,i+1)))
				x++;
		}
		return x;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());
		for(int i=1; i<=n; i++){
			String s = r.readLine();
			int b = find(s);
			if(b==1)
				System.out.println("Cyborg #" + i + ": " + b + " piece? You're supposed to be stronger than this!");
			else
				System.out.println("Cyborg #" + i + ": " + b + " pieces!");
		}
	}

}
