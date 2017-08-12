import java.util.*;
/*javadoc
Write   a   static   function     toBinary   that   outputs   the   binary   (base   2)   representation   of  
the   decimal   number   typed   as   the   input.   It   is   based   on   decomposing   the   number   into  
a   sum   of   powers   of   2.   For   example,   the   binary   representation   of   106   is   11010102,  
which   is   the   same   as   saying   that   106   =   64   +   32   +   8   +   2.   Ensure   necessary   padding  
to   represent   4   Byte   String. 
To   compute   the   binary   representation   of   n,   we   consider   the   powers   of   2   less   than   or  
equal   to   n   in   decreasing   order   to   determine   which   belong   in   the   binary  
decomposition   (and   therefore   correspond   to   a   1   bit   in   the   binary   representation). */
class util{
int i=0;
	void toBinary(int data)
	{
		
		int remainder;
		
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	while(data>0)
	{
	remainder = data %2; 
	data=data/2;
	al.add(remainder);
	
	}
	
	Integer[] check=new Integer[al.size()];
	check=al.toArray(check);
	
	for(int i=check.length-1;i>=0;i--)
	{
	
	System.out.print(check[i]);
	}
	}

	
	
}
class Binbase{
	public static void main(String...args)
	{
	  int number; 
	util u=new util();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        number = sc.nextInt();

        if (number < 0)
		{
            System.out.println("Error: Not a positive integer");
        } 
		else 
		{ 
            System.out.print("Convert to binary is:");
          	u.toBinary(number);
            
        }
	}
}
