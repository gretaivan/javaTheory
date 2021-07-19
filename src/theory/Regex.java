package theory;

import java.util.regex.*;

/**
 * Regular expressions allows definition of what you are looking for
 *
 */

public class Regex {
	
	public static void main(String[] args){
		 String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		 String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		 
		 /*
		  * Characters in search are put in the brackets e.g. [A-Za-z] or \\w \\W means 
		  * number [ 0 - 9]
		  * [^ ]  Insert characters that are not valid
		  * \\s  Any white space
		  * \S  Any non white space
		  * {n,m}  Whatever proceeds must occur between n and m times
		  *
		  * Word must contain letters that are 2 to 20 characters in length
		  * [A-Za-z]{2,20} 0r shorthand:  \w{2,20}
		  */  
		 regexChecker("\\s[A-Z]{2,20}\\s", longString);
		 regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		 

		 /*
		  * Find zip code - 5 digits long 
		  * \\s[0-9]{5}\\s or \\d{5}
		  */
		 regexChecker("\\s\\d{5}\\s", longString);
		 
		 //Find 2 char that are with a C or A
		 //A[KLRZ]|C[AOT]
		 regexChecker("A[KLRZ]|C[AOT]", longString);
		 
		 /* {n,}  Whatever proceeds must occur at least n times

			  + Whatever proceeds must occur one or more times
			 
			  . ^ * + ? { } [ ] \ | ( )  Characters that must be escaped or backslashed
			  .{3}    - 3 of anything
		  */
		 
		 //
		 System.out.println("w* regex");
		 regexChecker("\\w*", strangeString);
		 
		 //email check
		 regexChecker("[A-Za-z0-9._\\%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", longString);
		 
		 //get a phone number following american formating
		 regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);
		 
		 regexReplace(longString);

	}
	

	public static void regexChecker(String theRegex, String str2Check){
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher( str2Check );
		
		//find matches
		while ( regexMatcher.find() ){
			  if (regexMatcher.group().length() != 0){
				  System.out.println( regexMatcher.group().trim() );
				  // get the starting and ending indexs
				  System.out.println( "Start Index: " + regexMatcher.start());
				  System.out.println( "Start Index: " + regexMatcher.end());

			  }
		}
		System.out.println();


	}
	
	public static void regexReplace(String str2Replace){
		//match one or more white space
		Pattern replace = Pattern.compile("\\s+");
		
		//mutation to ignore the the case too
		//Pattern replace = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		
		// trim the string and prepare for a replace
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		
		 // replaceAll replaces all white space with commas
		System.out.println(regexMatcher.replaceAll(", "));

		
	}
}
