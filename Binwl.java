import java.io.*;
import java.util.*;
/*Javadoc
Binary   Search   the   Word   from   Word   List 
a. Desc   ­>   Read   in   a   list   of   words   from   File.   Then   prompt   the   user   to   enter   a   word   to 
search   the   list.   The   program   reports   if   the   search   word   is   found   in   the   list. 
b. I/P   ­>   read   in   the   list   words   comma   separated   from   a   File   and   then   enter   the   word 
to   be   searched 
c. Logic   ­>   Use   Arrays   to   sort   the   word   list   and   then   do   the   binary   search 
d. O/P   ­>   Print   the   result   if   the   word   is   found   or   not  */
class Binwl{
	public static void main(String[]args) throws IOException
	{
	
	FileOutputStream fo=new FileOutputStream("input.txt");
	Scanner sc=new Scanner(System.in);

	System.out.println("enter data into file");
	String str=sc.nextLine();

	byte b[]=str.getBytes();

	fo.write(b);
	fo.close();

	File input=new File("input.txt");
	Scanner scan=new Scanner(input);
	scan.useDelimiter(" ");

	ArrayList<String> values = new ArrayList<String>();
	
	while(scan.hasNext())
	{
		String data=scan.next();
		values.add(data);	
	}
	
	String[] name=new String[values.size()];
	System.out.print(values.size());	
	
	name=values.toArray(name);
	

	for(int l=0;l<name.length;l++)
	{
		System.out.print(" "+name[l]);	
	}
	
	Arrays.sort(name);
	

	for(int l1=0;l1<name.length;l1++)
	{
		System.out.println(" "+name[l1]);	
	}
	
	System.out.println("enter data you want to search");
	Scanner scan1=new Scanner(System.in);
	String check=scan1.next();
	int index_value=Arrays.binarySearch(name,check);	
	System.out.println("the index of"+check+"is"+index_value);
	}
}
