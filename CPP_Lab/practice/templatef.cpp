#include<iostream>
using namespace std;
template<class X>
void fun(X a)
{
    cout<<"val of a"<<a<<endl;

}
template<class X,class Y>
void fun(X a,Y b)
{
    cout<<"val of a"<<a<<endl;
    cout<<"val of b"<<b<<endl;

}
int main()
{
    fun(10);
    fun(20,20.5);
}

