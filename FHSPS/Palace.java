import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Palace{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numCases = Integer.parseInt(reader.readLine());
		for (int caseIndex = 0; caseIndex < numCases; caseIndex++){
			String[] input = reader.readLine().split(" ");
			int L = Integer.parseInt(input[0]);
			int A = Integer.parseInt(input[1]);
			System.out.println("Wall #" + (caseIndex + 1) + ": " + (!Double.isNaN(Math.sqrt(Math.pow(L, 2) - Math.sqrt(Math.pow(L, 4) - 16 * Math.pow(A, 2)))) ? "YES" : "NO"));
		}
	}
}
