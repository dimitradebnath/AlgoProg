import java.util.*;
/*Javadoc
Merge   Sort      ­  W
  rite   a   program   with   Static   Functions   to   do   Merge   Sort   of   list   of 
Strings.  
a. Logic   ­>   T
  o   Merge   Sort   an   array,   we   divide   it   into   two   halves,   sort   the   two   halves 
independently,   and   then   merge   the   results   to   sort   the   full   array.   To   sort   a[lo,   hi), 
we   use   the   following   recursive   strategy: 
b. Base   case:   If   the   subarray   length   is   0   or   1,   it   is   already   sorted. 
c. Reduction   step:   Otherwise,   compute   mid   =   lo   +   (hi   ­   lo)   /   2,   recursively   sort   the 
two   subarrays   a[lo,   mid)   and   a[mid,   hi),   and   merge   them   to   produce   a   sorted 
result.   */
class MergeSort{
int m;
	MergeSort m=new MergeSort();
	void sort(int arr[],int l,int r)
	{
		if(l<r)	
		{
			 m=(l+r)/2;	
			return;
		}
		sort(arr,l,m);
		sort(arr,m+1,r);
		m.merge(arr,l,m,r);
	}
	
	void merge(int arr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int[] L=new int[n1];
		int[] R=new int[n2];
	
		for(int i=0;i<n1;i++)
		{
			L[i]=arr[l+i];
		}

	
		for(int j=0;j<n2;j++)
		{
			R[j]=arr[m+1+j];
		}

	
	
	
		int i = 0, j = 0;
 
        // Initial index of merged subarry array
       		 int k = l;
       		 while(i<n1 && j<n2)
       		 {
           		 if (L[i]<=R[j])
           		 {
               			 arr[k]=L[i];
                		 i++;
            		}
            		else
           		 {
                		arr[k]=R[j];
               			 j++;
           		 }
           	 k++;
        	}
 
        /* Copy remaining elements of L[] if any */
        	while (i<n1)
        	{
          	  arr[k]=L[i];
           	 i++;
           	 k++;
       		 }
 
        /* Copy remaining elements of R[] if any */
        while(j<n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
	
}

		
	

}

class Mrgsrt
{
	public static void main(String...args)
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("how many number you want to add in a array");
	int data=sc.nextInt();
	int[] arr=new int[data];
	for(int i=0;i<data;i++)
	{
	arr[i]=sc.nextInt();
	}
	
	MergeSort mm=new MergeSort();
	mm.sort(arr,0,arr.length-1);
	
	
	
	
	}

}
