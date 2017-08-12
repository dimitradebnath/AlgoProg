import java.util.*;
import java.util.concurrent.TimeUnit;
/*JAVADOC:-
	To   the   Utility   Class   write   the   following   static   methods 
a. Desc   ­>   Create   Utility   Class   having   following   static   methods 
i.binarySearch   method   for   integer 
ii.binarySearch   method   for   String 
iii.insertionSort   method   for   integer
iv.insertionSort   method   for   String 
v.bubbleSort   method   for   integer 
vi.bubbleSort   method   for   String 
b. I/P   ­>   Write   main   function   to   call   the   utility   function 
c. Logic   ­>   Check   using   Stopwatch   the   Elapsed   Time   for   every   method   call 
d. O/P   ­>   Output   the   Search   and   Sorted   List.   More   importantly   print   elapsed   time 
performance   in   descending   order    */
final class Utility{
	public static void binarySearchInt(int arr[],int left,int right,int data)//Binary search part of Integer
	{
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==data)
			{
				System.out.println(" data found "+arr[mid]+" at "+mid+" position ");
			}
			if(arr[mid]<data)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
			
	
		}
		
		
		
	}

	
	public static void binarySearchString(String srr[],int left,int right,String str)//Binary search part of String
	{
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(srr[mid].equals(str))
			{
				System.out.println(" data found "+srr[mid]+" at "+mid+" position ");
			}
			if(str.compareTo(srr[mid])>0)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
			
	
		}
		
		
		
	}


	
	


	public static void insertionSortInt(int arr[],int len)// Insertion sort for integer
	{
		int temp,j;
		for(int i=1;i<=len;i++)
		{
			temp=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		
		}
		for(int k=0;k<=len;k++)
		{
			System.out.println(arr[k]);
		}
	}
		

	
	public static void insertionSortString(String srr[],int len)//Insertion sort part for string
	{
		String temp;
		int j;
		for(int i=1;i<=len;i++)
		{
			temp=srr[i];
			j=i-1;
			while(j>=0 && srr[j].compareTo(temp)>0)
			{
				srr[j+1]=srr[j];
				j=j-1;
			}
			srr[j+1]=temp;
		
		}
		for(int k=0;k<=len;k++)
		{
			System.out.println(srr[k]);
		}
	}
		
	
	public static void bubbleSortInt(int arr[],int len)//Bubble sort sort part for integer
	{
		int temp;
		for(int i=0;i<=len;i++)
		{
			for(int j=1;j<=len-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<=len;k++)
		{
			System.out.println(arr[k]);
		}
	}



	public static void bubbleSortString(String srr[],int len)//Bubble sort sort part for string
	{
		String temp;
		for(int i=0;i<=len;i++)
		{
			for(int j=1;j<=len-i;j++)
			{
				if(srr[j-1].compareTo(srr[j])>0)
				{	
					temp=srr[j-1];
					srr[j-1]=srr[j];
					srr[j]=temp;
				}
			}
		}
		for(int k=0;k<=len;k++)
		{
			System.out.println(srr[k]);
		}
	}



}

class All{
	public static void main(String[]args)
	{	Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
		
		System.out.println("Enter how many number your want to add in array");
		int n1=sc.nextInt();
		int[] arr=new int[n1];
		
		for(int i=0;i<n1;i++)
		{
		arr[i]=sc.nextInt();	
		}
		
		System.out.println("Enter how many string your want to add in array");
		int n2=sc.nextInt();
		String[] srr=new String[n2];
		

		for(int i=0;i<n2;i++)
		{
		srr[i]=sc.next();	
		}
		
		int len=arr.length;
		int len1=srr.length;
		int[] arrdata= new int[7];	
		int mm=0;	
		while(true)
		{
		 mm++;
		System.out.println("press number \n 1.call insertion sort for interger number\n 2.call insertion sort for String \n 3.call bubble sort for interger number \n 4.call bubble sort for String \n 5. binary search your int data \n 6.binary search for string data \n 7.elapsed   time performance   in   descending   order  \n 8.exit");
		int number=sc.nextInt();
		
		
		
			switch(number)//stopwatch logic according to choice
			{
				case 1: 
					
					long startTime = (System.nanoTime());
					u.insertionSortInt(arr,len-1);
					long endTime = (System.nanoTime());
					long  totalTime=endTime-startTime;
					System.out.println(totalTime);
					arrdata[mm]=(int) (long)totalTime;				
					break;  
    				case 2:
					long startTime2=(System.nanoTime());
					u.insertionSortString(srr,len1-1);
					long endTime2= (System.nanoTime());
					long  totalTime2=endTime2-startTime2;
					arrdata[mm]=(int) (long)totalTime2;
					System.out.println(totalTime2);
					
					break;  
    				case 3:
					long startTime3 = (System.nanoTime());
					u.bubbleSortInt(arr,len-1);
					long endTime3 = (System.nanoTime());
					long  totalTime3=endTime3-startTime3;
					arrdata[mm]=(int) (long)totalTime3;
					System.out.println(totalTime3);
					break;   
				case 4: 
					long startTime4 = (System.nanoTime());
					u.bubbleSortString(srr,len1-1);
					long endTime4 = (System.nanoTime());
					long  totalTime4=endTime4-startTime4;
					arrdata[mm]=(int) (long)totalTime4;
					System.out.println(totalTime4);
					break;
    			 	case 5: 
					System.out.println("enter data you want to search");
					int data1=sc.nextInt();
					long startTime5 = (System.nanoTime());
					u.binarySearchInt(arr,0,len-1,data1);
					long endTime5 = (System.nanoTime());
					long  totalTime5=endTime5-startTime5;
					arrdata[mm]=(int) (long)totalTime5;
					System.out.println(totalTime5);
					break;
    				case 6: 
					System.out.println("enter String you want to search");
					String data=sc.next();
					long startTime6 = (System.nanoTime());
					u.binarySearchString(srr,0,len1-1,data);;
					long endTime6 = (System.nanoTime());
					long  totalTime6=endTime6-startTime6;
					arrdata[mm]=(int) (long)totalTime6;
					System.out.println(totalTime6);
					break;
    			 	
    				 case 7: 
					
					u.insertionSortInt(arrdata,5);
					break; 
				 case 8: 
					
					System.exit(0);
					
    			 
    			}
		
		}
		
	
	}
}
