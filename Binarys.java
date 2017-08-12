import java.util.*;
import java.lang.*;
/*Javadoc
Question   to   find   your   number 
a. Desc   ­>   takes   a   command­line   argument   N,   asks   you   to   think   of   a   number 
between   0   and   N­1,   where   N   =   2^n,   and   always   guesses   the   answer   with   n 
questions. 
b. I/P   ­>   the   Number   N   and   then   recursively   ask   true/false   if   the   number   is   between 
a   high   and   low   value 
c. Logic   ­>   Use   Binary   Search   to   find   the   number 
d. O/P   ­>   Print   the   intermediary   number   and   the   final   answer */
class Binarys
	{
		public static void main(String[] args)
			{
			int n=0;
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the number");
				
			for(int i=0;i<args.length;i++)
				{
					System.out.println(args[i]);
					n=Integer.parseInt(args[i]);
				}
			int low,high,mid;
			low=0;
			high=(int)Math.pow(2,n)-1;
			mid=(high/2);
			search(low,high,mid,n);
			}
			public static void search(int low, int high, int mid, int k)
					{
							
						String s;
						int m=0,flag=0;
						
						while(m<=5)
							{
							
								++m;
							System.out.println("is your number lying between "+low+" and  " +mid);
							System.out.println("         Press {Y/N}           ");
			
							Scanner sc =new Scanner(System.in);
							s=sc.next();
			
							if(s.equalsIgnoreCase("y"))
									{
								high=mid;
								mid=(low+high)/2;
								if(low==mid){
								System.out.println("number found");

								System.exit(0);
									}
								else
								search(low,high,mid,k);				
									}
							else if(s.equalsIgnoreCase("n"))
									{
								low=mid+1;
								mid=(high+low)/2;
								if(mid==high){
								System.out.print("number found");

									System.exit(0);
									}
								else
								search(low,high,mid,k);
				
									}
							 }	
							
					
						
							
					
					}
			
}
