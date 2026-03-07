#include<iostream>
using namespace std;
int sum=0;

void add(int &x,int &y)
{
	sum=x+y;
	cout<<"sum is:"<<sum;
}
int main()
{
	int a=10;
	int b=20;
	add(a,b);
}