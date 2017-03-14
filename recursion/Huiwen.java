/**
 * 递归实现回文判断
 * @author xudan
 *
 */
import java.util.Scanner;
public class Huiwen {

	public static void main(String[] args) {
		
		System.out.println("Please enter the string you want to check: ");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int length = s.length();
		if(isPalindrome(0,length - 1,s))
			System.out.println(s + " is palindrome.");
		else
			System.out.println(s + " is not palindrome.");
		
		in.close();
	}
	
	public static boolean isPalindrome(int from, int to, String s ){
		if(from > to)  
            throw new IllegalArgumentException(); 
		if(from == to)
			return true;
		else{
			return ((s.charAt(from) == s.charAt(to)) && (isPalindrome(from + 1, to - 1,s)));
		}
		
	}

}
