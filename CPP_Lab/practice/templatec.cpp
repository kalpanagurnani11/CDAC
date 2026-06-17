#include<iostream>
using namespace std;

template<class T,int size>
class A
{
    public:
    T arr[size];
    void insert()
    {
        int i=1;
        for(int j=0;j<size;j++)
        {
            arr[j]=i;
            i++;
        }
    }

        void display()
        {
            for(int i=0;i<size;i++)
            {
                cout<<arr[i]<<endl;
            }
        }
    
};
int main()
{
    A<int,10>t1;
    t1.insert();
    t1.display();
}
//  template<class T1,class T2>
//  class A
//  {
//     T1 a;
//     T2 b;
//     public:
//     A(T1 x,T2 y)
//     {
//         a=x;
//         b=y;
//     }
//     void display()
//     {
//         cout<<"val of a and b"<<a+b<<endl;
//     }
//  };
//  int main()
//  {
//     A<int,float>d(5,6.5);
//     A<int,int>e(5,6.5);
//     d.display();
//     e.display();


//  }