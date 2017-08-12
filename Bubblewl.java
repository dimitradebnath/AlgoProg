import java.util.*;
/*Javadoc
Bubble   Sort  
a. Desc   ­>   Reads   in   integers   prints   them   in   sorted   order   using   Bubble   Sort 
b. I/P   ­>   r   ead   in   the   list   ints 
c. O/P   ­>   P
  rint   the   Sorted   List  */
class Bubblewl{
	public static void main(String...args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many int data you want to enter");
	int data=sc.nextInt();
	System.out.println("ENter your data");
	int[] str=new int[data];
	for(int i=0;i<data;i++)
	{
		 str[i]=sc.nextInt();
	}
	System.out.println("after sorting ");
	
	Utility.bubbleSortInt(str,str.length-1);
	
	
	}
}
