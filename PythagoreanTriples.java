import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class PythagoreanTriples {
	
	public static boolean isTriple(int a, int b, int c){
		int[] nums = nums(a,b,c);
		double one = Math.pow(nums[0],2);
		double two = Math.pow(nums[1], 2);
		double e = Math.sqrt(((double)one+two));
		return e==(double)nums[2];
	}
	
	//sort set of triples
	public static int[] nums(int a, int b, int c){
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(a);
		n.add(b);
		n.add(c);
		Collections.sort(n);
		int[] nums = {n.get(0),n.get(1),n.get(2)};
		return nums;
	}
	
	public static int[] turnIntArr(String s){
		String[] temp = s.split(" ");
		int[] ret = new int[temp.length];
		for(int i=0; i<temp.length; i++){
			ret[i]=Integer.parseInt(temp[i]);
		}
		return ret;
	}
	
	public static ArrayList<int[]> foundTriples(int[] nums){
		int x = nums[0]+1;
		ArrayList<int[]> triples = new ArrayList<int[]>();
		for(int i=1; i<x; i++)
			for(int j=i+1; j<x; j++)
				for(int k=j+1; k<x; k++){
					int one = nums[i];
					int two = nums[j];
					int three = nums[k];
					if(isTriple(one,two,three)){
						int[] t = nums(one,two,three);
						triples.add(t);
					}
				}
		//sort triples
		Collections.reverse(triples);
		return triples;
			
	}
	
	public static void printTriples(ArrayList<int[]> a){
		int x = a.size();
		String temp = "";
		if(x!=0){
			temp = "Found Pythogorean triples:  ";
			for(int i=0; i<x; i++){
				int[] n = a.get(i);
				temp+="{" + n[0] + " " + n[1] + " " + n[2] + "}";
				if(i!=x-1)
					temp+=" ";
			}
		}
		else
			temp = "No Pythogorean triples found in the sequence.";
		System.out.println(temp);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		int n=Integer.parseInt(s);
		for(int i=1;i<=n;i++){			
			String str=r.readLine();
			int[] nums = turnIntArr(str);
			ArrayList<int[]> triples = foundTriples(nums);
			printTriples(triples);
		}
	}

}
