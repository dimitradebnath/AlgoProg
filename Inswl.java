import java.util.*;
/*Javadoc
Insertion   Sort  
a. Desc   ­>   Reads   in   strings   from   standard   input   and   prints   them   in   sorted   order. 
Uses   insertion   sort. 
b. I/P   ­>   read   in   the   list   words 
c. Logic   ­>   Use   Insertion   Sort   to   sort   the   words   in   the   String   array 
d. O/P   ­>   Print   the   Sorted   List  */
class Inswl{

	public static void main(String...args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many words you want to enter");
	int data=sc.nextInt();
	System.out.println("ENter your data");
	String[] str=new String[data];
	for(int i=0;i<data;i++)
	{
		 str[i]=sc.next();
	}
	System.out.println("after sorting ");
	Utility.insertionSortString(str,data-1);
	
}
}
