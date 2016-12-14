import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Summingg {

public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	String ret = "";
	int n=Integer.parseInt(r.readLine());
	for(int i=1;i<=n;i++){
		String str=r.readLine();
		String[] nums = str.split(" ");
		int b = Integer.parseInt(nums[1]);
		String[] initial = r.readLine().split(" ");
		String[] goal = r.readLine().split(" ");
		
		ret+="Case " + i + "\n";
		for(int j=0; j<b; j++){
			int pairs = 0;
			int num=Integer.parseInt(goal[j]);
		for(int k=0; k<initial.length; k++){
			int a = Integer.parseInt(initial[k]);
			for(int l=k; l<initial.length; l++){
				int d= Integer.parseInt(initial[l]);
				if(a!=d&&a+d==num)
					pairs++;
			}
		}
			ret+=pairs+"\n";
		}
				
		if(i!=n)
			ret+="\n";
	}
	System.out.print(ret);
}

}
