import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
	public static void main(String[] args) {
		String s="Hello world";
		Pattern pattern=Pattern.compile("^[A-Z]");
		Matcher  matcher=pattern.matcher(s);
		
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("match found");
		}else {
			System.out.println("match not found");
		}
		
	
	     
	}

}
