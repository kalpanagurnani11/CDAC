#include<iostream>
using namespace std;
int main()
{
    int n,a=0,b=1,c;
    cout<<"enter a no."<<endl;
    cin>>n;
    int fib=0;
    for(int i=0;i<n;i++)
    {
        cout<<a<<" ";
        c=a+b;
        a=b;
        b=c;
        
    }
}



// a=3
// b=2
// a=a+b
// b=a-b
// a=a-b