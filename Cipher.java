import java.util.Scanner;


public class Cipher {

	public static String[] alphabet(){
		String[] a = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		return a;
	}
	
	public static String matchKey(String key, String s){
		int x = s.length();
		int c = 0;
		int pos = 0;
		String newKey = "";
		while(c<x){
			if(pos==key.length())
				pos=0;
			newKey+=key.substring(pos,pos+1);
			c++;
			pos++;
		}
		return newKey;
	}
	
	public static int findLetterPos(String s){
		String[] a = alphabet();
		for(int i=0; i<a.length; i++)
			if(s.equals(a[i]))
				return i;
		return a.length-1;
	}
	
	public static String cipherText(String k, String s){
		String key = matchKey(k,s);
		String cipher = "";
		String[] a = alphabet();
		int x = s.length();
		for(int i=0; i<x; i++){
			String tempKey = key.substring(i,i+1);
			String tempCiph = s.substring(i,i+1);
			int tempKeyPos = findLetterPos(tempKey);
			int tempCiphPos = findLetterPos(tempCiph);
			int newPos = tempKeyPos+tempCiphPos;
			if(newPos>=26)
				newPos = newPos-26;
			cipher+=a[newPos];
		}
		return cipher;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i=0; i<x; i++){
			String key = kb.next();
			String s = kb.next();
			System.out.println("Ciphertext: " + cipherText(key,s));
		}
	}

}
