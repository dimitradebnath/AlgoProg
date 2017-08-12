import java.util.*;
class util{
/*javadoc:-
Write   Binary.java   to   read   an   integer   as   an   Input,   convert   to   Binary   using   toBinary  
function   and   perform   the   following   functions. 
i.   Swap   nibbles   and   find   the   new   number. 
ii.   Find   the   resultant   number   is   the   number   is   a   power   of   2. 
A   nibble   is   a   four­bit   aggregation,   or   half   an   octet.   There   are   two   nibbles   in   a   byte. 
Given   a   byte,   swap   the   two   nibbles   in   it.   For   example   100   is   to   be   represented   as  
01100100   in   a   byte   (or   8   bits).   The   two   nibbles   are   (0110)   and   (0100).   If   we   swap   the  
two   nibbles,   we   get   01000110   which   is   70   in   decimal. */
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

	
	void swapNibbles(int x)
	{
		int value=( (x & 0x0F)<<4 | (x & 0xF0)>>4 );
		System.out.println(value);
		System.out.println("binary number after swaping");
		toBinary(value);
		
	}

}
class Binary{
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
            System.out.println("Convert to binary is:");
          	u.toBinary(number);
	System.out.println("After Swaping nibbles   ");
		u.swapNibbles(number);
            
        }
	}
}
