import java.util.*;
/*javadoc
Write   a   static   function     sqrt     to   compute   the   square   root   of   a   nonnegative   number   c  
given   in   the   input   using   Newton's   method: 
­   initialize   t   =   c 
­   replace   t   with   the   average   of   c/t   and   t 
­   repeat   until   desired   accuracy   reached   using   condition   Math.abs(t   ­   c/t)   >   epsilon*t  
where   epsilon   =  1
  e­15 ; */
class Calcsqrt
	{
		public static void main(String []args)
			{
				Scanner sc = new Scanner(System.in);
				double c;
				System.out.println("enter the value of c");
				c=sc.nextDouble();
				A142 obj = new A142();
				obj.func(c);

			}

	}


	class A142
	{
		 static void func(double c)
			{
			double t;
			t=c;
			while((Math.abs(t-(c/t))) > (Math.exp(-15)*t))
				{
			
			t =(c/(2*t))+(t/2);	

					}
			System.out.println(t);
			}


	}


