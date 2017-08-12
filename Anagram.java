import java.util.*;
import java.lang.*;
/*JAVADOC:-
	An   Anagram   Detection   Example 
a. Desc   ­>   One   string   is   an   anagram   of   another   if   the   second   is   simply   a 
rearrangement   of   the   first.   For   example,   'heart'   and   'earth'   are   anagrams... 
b. I/P   ­>   Take   2   Strings   as   Input   such   abcd   and   dcba   and   Check   for   Anagrams 
c. O/P   ­>   The   Two   Strings   are   Anagram   or   not..*/
	class Anagram{
	public static void main(String[]args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String a=sc.next();
	
		System.out.println("Enter the second String");
		String b=sc.next();
	
		char[] a_sort=a.toCharArray();
		Arrays.sort(a_sort);

		char[] b_sort=b.toCharArray();
		Arrays.sort(b_sort);

		String str1=String.valueOf(a_sort);
		String str2=String.valueOf(b_sort);
	
		if(str1.equals(str2)==true)
			{
				System.out.println("The Strings are anagram");
			}
		else 
			{
				System.out.println("The two Strings are not anagram");
			}

	
		}	
}
