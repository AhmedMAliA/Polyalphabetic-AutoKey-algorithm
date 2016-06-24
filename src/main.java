import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import javax.*;


public class main {	

	public static HashMap<String, Integer> hash=new HashMap<String, Integer>();
	static String alpha="abcdefghijklmnopqrstuvwxyz";

	

	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		for (int i = 0; i < alpha.length(); i++) {
			hash.put(alpha.charAt(i)+"",i);
		}
		Scanner ss=new Scanner(System.in);
		String key="",plain="",cipher="";
		
		System.out.print("Enter The PlainText : ");
		plain = ss.next();
		System.out.print("Enter The Keyword : ");
		String k = ss.next();
		key = cipherText.generateKey(k,plain);
		System.out.println("The Key is : "+key);
		
		cipher = new cipherText(plain,key).findCipher(hash);
		System.out.println("The Cipher Text is : "+cipher);
		
		String plainn=cipherText.findPlainText(cipher, key);
		System.out.println("The Original Text is : "+ plainn);
		
		String keyword=cipherText.findKeyWord(cipher, plain);
		System.out.println("The KeyWord is : "+ keyword);
		
		
	}
	
}
