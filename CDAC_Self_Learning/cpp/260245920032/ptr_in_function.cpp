//#include<iostream>
//using namespace std;
//
//void display(int *p)
//{
//	cout<<"value is:"<<*p<<endl;
//	cout<<"address of value is:"<<p<<endl;
//}
//int main()
//{
//	int n=10;
//	display(&n);
//}

#include<iostream>
using namespace std;

void add(int *a, int *b)
{
    int sum;
    sum = *a + *b;
    cout<<"Sum = "<<sum;
}

int main()
{
    int x = 10, y = 20;

    add(&x,&y);

    return 0;
}
