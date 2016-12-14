import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PigLatin {
	
	private static String[] vowels = {"a", "e", "i", "o", "u"};
	private static String[] word;
	
	public static boolean isVowel(String a){
		for(String s: vowels)
			if(s.equals(a))
				return true;
		return false;
	}
	
	public static String notVowel(String s){
		int pos = 0;
		String a = "";
		while(pos<s.length() && !isVowel(s.substring(pos,pos+1))){
			a+=s.substring(pos,pos+1);
			pos++;
		}
		return s.substring(pos) + a + "ay";
	}
	
	public static String vowel(String s){
		return s + "yay";
	}
	
	
	public static String pigLatin(String a){
		String latin = "";
		if(isVowel(a.substring(0,1)))
			latin=vowel(a);
		else
			latin = notVowel(a);
		return latin;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		int n=Integer.parseInt(s);
		String ret="";
		for(int i=1;i<=n;i++){
			String str=r.readLine();
			word = str.split(" ");
			for(int j=0; j<word.length; j++){
				ret+=pigLatin(word[j]);
				if(j!=word.length-1)
					ret+=" ";
			}
			System.out.println(ret);
			ret="";
		}
	}

}
