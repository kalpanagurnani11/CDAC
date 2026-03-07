#include<iostream>
using namespace std;

void display(int *p)
{
	cout<<"value is:"<<*p<<endl;
	cout<<"address of value is:"<<p<<endl;
}
int main()
{
	int n=10;
	display(&n);
}