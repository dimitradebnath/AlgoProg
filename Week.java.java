import java.util.*;
/*javadoc
To   the   Util   Class   add     dayOfWeek   static   function   that   takes   a   date   as   input   and  
prints   the   day   of   the   week   that   date   falls   on.   Your   program   should   take   three  
command­line   arguments:   m   (month),   d   (day),   and   y   (year).   For   m   use   1   for   January,  
2   for   February,   and   so   forth.   For   output   print   0   for   Sunday,   1   for   Monday,   2   for  
Tuesday,   and   so   forth.   Use   the   following   formulas,   for   the   Gregorian   calendar   (where  
/   denotes   integer   division): 
y  0     =  y      −   (14   −  m)      /   12 
x  =  y   0 +  y   0 /4   −  y   0 /100   +  y   0/400 
m  0     =  m+   12   ×   ((14   −  m)      /   12)   −   2 */
class util{
	static void dayOfWeek(int data)
	{
		if(data==0)
		{
			System.out.println("sunday");
		}
		else if(data==1)
		{
			System.out.println("monday");
		}
		else if(data==2)
		{
			System.out.println("tuesday");
		}
		else if(data==3)
		{
			System.out.println("wednesday");
		}
		else if(data==4)
		{
			System.out.println("thusday");
		}
		else if(data==5)
		{
			System.out.println("friday");
		}
		else if(data==6)
		{
			System.out.println("saturday");
		}
		else if(data==7)
		{
			System.out.println("sunday");
		}
	
	}

}

class Week{
	public static void main(String...args)
	{
	int m=Integer.parseInt(args[0]);
	int d=Integer.parseInt(args[1]);
	int y=Integer.parseInt(args[2]);	
	//System.out.println(m+""+d+""+y);	
	int y0=y-((14-m)/12);
	int x=y0+(y0/4)-(y0/100)+(y0/400);
	int m0=m+(12*((14-m)/12))-2;
	int d0=(d+x+((31*m0)/12))%7;
	util u=new util();
	u.dayOfWeek(d0);
	}
}
