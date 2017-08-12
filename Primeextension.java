import java.util.*;
/*JAVADOC:-
	Extend   the   above   program   to   find   the   prime   numbers   that   are   Anagram   and  
Palindrome    */
class Primeextension{
	public static void main(String...args)
	{
	int temp,index=0,check=0;
	int[] a=new int[1000];
	int[] brr=new int[1000];
		
		for(int i=0;i<=1000;i++)
			{
				int d=1;
	
				for(int j=2;j<=i/2;j++)
					{
			
			 		if(i%j==0)
						{
				 			d=0;
							break;			
						}
			
					}
	
				if(d==1)
					{
						index++;
		
						a[index]=i;


			
					}
			}


			
		System.out.println("Palindrome numbers are as follows  ");//Pallindrome part
		
		for(int k=1;k<index;k++)
	
		{
			int b=0, rev=0;
			int d=0;
			b=a[k];
			check=b;

			while(b>0)
			{
				d=b%10;
				rev=(rev*10)+d;
				b=b/10;
			
			}

			if(check==rev)
			{
				System.out.println(rev);
			
			}
		}


		for(int l=1;l<index;l++)

		{
			String data=String.valueOf(a[l]);
			char[] c1=data.toCharArray();
			Arrays.sort(c1);
			String data1=String.valueOf(c1);
			brr[l] = Integer.parseInt(data1);
			
			
					
			
		}
		System.out.println("All possible combination of Anagram");//Anagram part
		for(int p=1;p<index;p++)
		{

			for(int m=p+1;m<index;m++)
			{
			
				if(brr[p]==brr[m])
				{
					int length = (int)(Math.log10(a[p])+1);
					int length1 = (int)(Math.log10(a[m])+1);					
					
					if(length==length1)
					{					
					System.out.print(a[p]+" "+a[m]+" ");
					

					}



				}
			}	
		}





		
}
}
