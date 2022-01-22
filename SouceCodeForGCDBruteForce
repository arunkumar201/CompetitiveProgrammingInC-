#include <bits/stdc++.h>
using namespace std;
int GCD(int A,int B)
{    
    int gcd;
    int c=min(A,B);
     int i;
     for(i=c;i>0;i--)
     {
         if((A%i==0)&&(B%i==0))
         {
             gcd=i;
              return gcd;
         }
     }
}
int GCD1(int A,int B)
{    
    int gcd;
    int c=min(A,B);
     int i;
     for(i=1;i<=A && i<=B;i++)
     {
         if((A%i==0)&&(B%i==0))
         {
             gcd=i;
             
         }
     }
      return gcd;
}

int main()
{
     int A,B;
     cin>>A;
     cin>>B;
   cout<<GCD(A,B);
    int A1,B1;
     cin>>A1;
     cin>>B1;
   cout<<GCD1(A1,B1)<<"/n";
     
     return 0;
    
     /*
     int div=min(n1,n2);
     while(n2%m!=0)
     {
         int rem=n2%m;
         n2=div;
          div=rem;    
     }
     cout<<div;   */
}
