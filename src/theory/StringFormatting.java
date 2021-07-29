package theory;

/**
 * Format specifiers
 * %[argument index][flags][width][precision] conversion
 * 
 * conversions
 * %d - decimal conversion of integer
 * %x - hexadecimal value
 * %f - decimal /floating point
 * %e - scientific relation
 * %s - string conversion
 * 
 * FLAGS
 * %.1f - definition of decimal place
 *# -  radix eg. to display classical hex value
 *0 - padding
 *- - left justified 
 *, - separate the digit grouping
 *<space> - leading space for positive numer
 *+ - always show sign
 *( - enclose negative vals
 *
 *ARGUMENT index
 *<no of argument> $ - ties to the indicated argument formatting
 * >$ - ties to the previous argument formating
 */
public class StringFormatting {

	public static void main(String[] args) {
		int iVal = 32;
		String s1 = String.format("%d", iVal); 
		System.out.println(s1);
		
		s1 = String.format("%x", iVal);
		System.out.println(s1);

		
		s1 = String.format("%#x", iVal);
		System.out.println(s1);
		
		int w = 5, x =235, y= 481, z = 12;
		String s2 = String.format("W:%d X:%d", w, x);
		String s3 = String.format("Y:%d Z:%d", y, z);
		
		String s4 = String.format("W:%4d X:%4d", w, x);
		String s5 = String.format("Y:%4d Z:%4d", y, z);
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		//add "-" before the padding digit to justify left
		
		
	}

}
