import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pixels {
	
	public static int getPrice(int w, int l, int amt){
		return (w*72)*(l*72)*amt;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		int n=Integer.parseInt(s);
		for(int i=1;i<=n;i++){
			String str=r.readLine();
			String[] st = str.split(" ");
			System.out.println(getPrice(Integer.parseInt(st[0]),Integer.parseInt(st[1]),Integer.parseInt(st[2]))%100000007);
		}
	}	

}
