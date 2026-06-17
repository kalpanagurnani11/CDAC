#include<iostream>
using namespace std;
template<class T,class Y>


T myMax(T x, Y y)
{
    return (x > y) ? x : y;
}
 int main()
{ 
    cout << myMax(3, 'a') << endl;
    cout << myMax<double>(3,4 ) << endl;
    cout << myMax('g', 'e') << endl;
 
  
}

// void fun(X a,Y b)
// {
//     cout<<"val of a"<<a<<endl;
//     cout<<"val of b"<<b<<endl;
// }
// int main()
// {
//     fun(15,12.3);
// }

// template<class T>


// void swap1(T&x,T&y)
// {
//     T temp;
//     temp=x;
//     x=y;
//     y=temp;

// }
// int main()
// {
//     int a=10,b=20;
//     char x='A',Y='B';
//     swap1(a,b);
//     cout<<a<<b<<endl;
// }
// T add(T&a,T&b)
// {
//     T res=a+b;
//     return res;
// }
// int main()
// {
//     int i=2;
//     int j=3;
//     float m=2.3;
//     float n=1.2;
//     cout<<"add of i and j"<<add(i,j)<<endl;

// }