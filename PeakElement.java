//Problem Statement 
/* An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
 and we have to return the index of the peak element
 an array can have more than one peak element but we need return first occurence of the element
 The peak element is an element that is greater or equals than its neighbors
 Input: nums = [1,2,3,1]
  Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

//From GFG
/*
Following corner cases give better idea about the problem. 

If input array is sorted in strictly increasing order, the last element is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.
If the input array is sorted in strictly decreasing order, the first element is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
If all elements of input array are same, every element is a peak element.
*/
//Native approach 

public class Main
{
	public static int peakElement(int a[], int n)
	{
	    //Base Cases
	    //1.if an array has only 1 element 
	    if(n==1){
	        return 0;  //simply return 0th index;
	    }
	    //2.let's say am array has only two elements 
	    else if(n==2)
	    {   
	       if(a[0]>=a[1])  //if it is true.
	       {
	           return 0; //it means First element is peak element
	       }
	       else{
	           return 1;  //else second element is a peak element so we will return that index.
	       }
	    }
	    
	    //edge Cases
	    //1.edge Case
	    //we have to check for boundary elements becouse it does not have two child or neghbours 
	    //they only  have one neghbour
	    //for left most element it has right neghbour
	    //for rightmost element is has left neghbour
	    else{
	        //Edge case-1 for Left-most element 
	        if(a[0]>=a[1]){
	            return 0; //index of the first or left most element
	        }
	        if(a[n-1]>=a[n-2]){
	            return n-1;  //index of the last element
	        }
	    }
	    //now we handle all remaing elemnts by using a loop 
	    for(int i=1;i<n-1;i++)
	    {
	        //we just compare the value with its neghbours
	        //a[i]>=a[i+1] 
	        if(a[i]>=a[i+1]  && a[i]>=a[i-1])
	        {
	            return i;  //return the of the  peak element
	        }
	       
	} //end of the for loop
	 //the handle the return statement 
           return 0;
}//end of the fuction 
	
   public static void main(String[] args)
   {
		 int N=4;
		 int a[]={1,3,20,4,1,0};
		 int n= peakElement(a,N);
	   	System.out.println(n);
	}
}
//Time complexity: O(n). 
//here we  used only a loop sotime complexity is O(n)
//Auxiliary Space: O(1). 
//No extra space is needed, so space complexity is constant O(1)


//2.Optimal Approach
class Solution {

 	public int findPeakElement(int a[])
	{
        int n=a.length;
     int low=0,mid;
     int high=n-1;
     while(low<=high){
           mid=(low+high)/2;
       
        
              if((mid==n-1 || a[mid]>=a[mid+1]) &&(mid==0 ||a[mid]>= a[mid-1])){
                  return mid;
              }
             else if(a[mid+1]>=a[mid]){
                 low=mid+1;  
             }
             else{
                 high=mid-1; 
             }
        }
        
          
     
         
       return low ; //or low or high  
     }
}
//time complexity=O(logn)
//space complexity=O(1)

	  
