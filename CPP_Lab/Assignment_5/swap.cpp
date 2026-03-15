
// a=3
// b=2
// a=a+b
// b=a-b
// a=a-b

#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cout<<"enter a:"<<endl;
    cin>>a;

    cout<<"enter b:"<<endl;
    cin>>b;

    a=a+b;
    b=a-b;
    a=a-b;

    cout<<"a :"<<a<<endl;
    cout<<"b :"<<b<<endl;
}