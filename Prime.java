import java.util.*;
class Prime{
/*JAVADOC:-
	Take   a   range   of   0   ­   1000   Numbers   and   find   the   Prime   numbers   in   that   range.  */
	public static void main(String...args)
	{
	int i,j,c=0;
	for(i=0;i<=1000;i++)
		{
			c=1;
			for(j=2;j<=i/2;j++)
				{
					if(i%j==0)
						{
						c=0;
						break;
						}
			}
				
			if(c==1)	
		System.out.println(" "+i);
		
		}	
		
	
	
	}
}
