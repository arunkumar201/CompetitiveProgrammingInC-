
#include <iostream>

using namespace std;
//Recusive Solution
int GCDrec(int A ,int B)
{
    if(B==0)
    {
        return A;
    }
    else
    {
       return GCDrec(B,A%B);
    }
    

}
//non recursive 
int GCDnon(int A,int B)
{
    while(B)
    {
        A=A%B;
        swap(A,B);
    }
    return A;
}
int main()
{
    int A,B;
   cin>>A>>B;
cout<<GCDnon(A,B);
   int A1,B1;
  cin>>A1>>B1;
  cout<<"\n"<<GCDrec(A1,B1);
    return 0;
}
