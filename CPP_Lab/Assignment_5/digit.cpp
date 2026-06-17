#include<iostream>
using namespace std;

int main()
{
    int count=0;
    int num;
    cout<<"enter a num"<<endl;
    cin>>num;

    while(num>0)
    {
       num=num/10;
       count++;
       
    }
    cout<<"no of digits are :"<<count;
}