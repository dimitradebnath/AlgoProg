import java.util.*;
/*javadoc
Find   the   Fewest   Notes   to   be   returned   for   Vending   Machine 
a. Desc   ­>   There   is   1,   2,   5,   10,   50,   100,   500   and   1000   Rs   Notes   which   can   be 
returned   by   Vending   Machine.   Write   a   Program   to   calculate   the   minimum   number 
of   Notes   as   well   as   the   Notes   to   be   returned   by   the   Vending   Machine   as   a 
Change 
b. I/P   ­>   read   the   Change   in   Rs   to   be   returned   by   the   Vending   Machine 
c. Logic   ­>   Use   Recursion   and   check   for   largest   value   of   the   Note   to   return   change 
to   get   to   minimum   number   of   Notes.  */
class Vending{
	public static void main(String...args)
	{
	int d1=0,d2=0,d5=0,d10=0,d50=0,d100=0,d500=0,d1000=0,temp=0,data1,data2,data3,data4,data5,data12,data15;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int data=sc.nextInt();
	 temp=data;
	while(data>0)
	{	
		
		if(data==1)
		{
				d1=data;
				break;
		}
		else if(data>=2 && data<=4)
		{
				data12=data/2;
				d2=data12;
				data=(data-(d2*2));
		}
		else if(data>=5 && data<=9)
		{
				data15=data/5;
				d5=data15;
				data=(data-(d5*5));
		}
		
		else if(data>=10 && data<=49)
		{
				data1=data/10;
				d10=data1;
				data=(data-(d10*10));
				System.out.println(data);
		}
		else if(data>=50 && data<=99)
		{
				data2=data/50;
				d50=data2;
				data=(data-(d50*50));
				System.out.println(data);
		}
		else if(data>=100 && data<=499)
		{
			data3=data/100;
			d100=data3;
			data=(data-(d100*100));
			System.out.println(data);
		}
		else if(data>=500 && data<=999)
		{
			data4=data/500;
			d500=data4;
			data=(data-(d500*500));
			System.out.println(data);
		}
		else if(data>1000)
		{
			data5=data/1000;
			d1000=data5;
			data=(data-(d1000*1000));
			System.out.println(data);
		}
	}
	System.out.println(" d1 "+d1+"d2 "+d2+" d5 "+d5+" d10 "+d10+" d50 "+d50+" d100 "+d100+" d500 " +d500+" d1000 "+d1000+" data "+temp);
	}
}
