//Brute force Solution/Approach
public class Main
{   static long[] getMinMAx(long arr[]){
       //find length of the Array
       int n=arr.length; 
       //Now intialize  both minimum and maximum element to the first element 
       long min=arr[0];
       long max=arr[0];
       //now we will traverse the array, comparing each element and update min and max if needed
       //we will start the loop with 2nd elemtent becouse we have intialized first value with min and max.
       //loop 1 to n-1
       for (int i=1;i<n;i++) {
           if(arr[i]>max){
               //update max value
               max=arr[i];
           }
           else if(arr[i]<min){
               min=arr[i];
           }
       }//end of the for loop
       //now we will return the min and max value.
      long arr1[]={min,max};
      return arr1;
}
    public static void main(String[] args) {
       long a[]={12,-22,221,56,4,-54};
       long res[]=getMinMAx(a);
      System.out.println("Minimum Value is:"+res[0]+"\nMaximum Value is:"+res[1]);
    }
}
//https://www.online-java.com/ACqJx2OMGf
//Time complexity = O(n), Space complexity = O(1)
//
//2.Using divide and conquer(Idea similar to Merge Sort) or Tournament Method.
//https://www.online-java.com/AkMIsJHoS5

public class Main
{   static long[] getMinMAx(long arr[],int start,int end){
       //find length of the Array
       int n=arr.length; 
       //Now intialize  b
       long min;
       long max;
       //Base case
       //1.If an array has only one element 
       //then set min and max as first element
       if(start==end){
           min=arr[start];  //index 0
           max=arr[start];  //index 0
       }//end if
       //2. if given array has exactly two element 
       //then we compared them and set it max and min
       else if(start==end-1){
           
           if(arr[start]>arr[end]){
               max=arr[start];
               min=arr[end];
           }
           else{
               max=arr[end];
               min=arr[start];
           }
       }//end else if 
       //now we handle the recursive case
       // We divide the array into two equal parts around mid-value i.e divide the problem into two equal-size sub-problems.
       // We recursively find the minimum and maximum of both left and right parts.
       // Now we compare the maximum and minimum of both halves to get the maximum and minimum of the whole array.
       else{
           int mid=start+(end-start)/2;//best way to calculate mid
           //now find max and min in left half array
           long left[]=getMinMAx(arr,start,mid);
           long right[]=getMinMAx(arr,mid+1,end);  //similar to merge sort 
           //now compares the left and right array results
           //for maximum
           if(left[0]>right[0]){
               max=left[0];
           }
           else{
               max=right[0];
           }
           //for min
           if(left[1]>right[1]){
               min=right[1];
           }
           else{
               min=left[1];
           }
           
       }

       //now we will return the min and max value.
      long arr1[]={max,min};
        return arr1;
}

    public static void main(String[] args) {
       long a[]={12,-22,221,56,4,-54,-666666,665655,566556,9999,99996,667666,667777};
       int start=0;
       int end=a.length-1;
       long res[]=getMinMAx(a,start,end);
      System.out.println("maximum Value is:"+res[0]+"\n minimum Value is:"+res[1]);
    }
}
//Time complexity = O(n) and space complexity = O(logn) (For recursion call stack)
//optimal solution with less number of comparisions
//https://www.online-java.com/w49gy2qsle
public class Main
{   
    static long[] getMinMAx(long arr[])
    {
       //length of the Array
       int n=arr.length-1,i=0;
       //intialize the min amd max
       long min,max;
       //base bases
       //1.if array length is odd or odd number of elements present in an array 
       if(n%2!=0){
          min=arr[0]; 
          max=arr[0];
          i=1;
       }
       //if an array has exactly two elements
       else {
           if(arr[0]<arr[1]){
               max=arr[1];
               min=arr[0];
           }
           else{
               max=arr[0];
               min=arr[1];
           }
           //set i=2
           i=2;
       }
           
           while(i<n){
               if(arr[i]<arr[i+1])
               {
                   if ( arr[i] < min )
                   min = arr[i];
               if ( arr[i+1] > max )
                max = arr[i+1];
               }
               else{
                  if ( arr[i] > max )
                max = arr[i];
              if ( arr[i+1] < min )
                min = arr[i+1] ;
               }
                i=i+2;
           }
              
       //now we will return the min and max value.
      long arr1[]={max,min};
        return arr1;
}
 public static void main(String[] args) 
 {
       long a[]={12,-22,221,56,4,-54,-666555556,65,55,-444444499,555590,666,67};
       long res[]=getMinMAx(a);
       System.out.println("maximum Value is:"+res[0]+"\nminimum Value is:"+res[1]);
    }
}
//

