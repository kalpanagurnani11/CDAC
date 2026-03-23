#include<iostream>
using namespace std;
class A
{
    int a;
    public:
    A(int);
    void display();
};
   A:: A(int p)
    {
        cout<<"para constructor of a "<<endl;
        a=p;
    }
    void A:: display()
    {
        cout<<"val of a is"<<a<<endl;
    }



class B:public A
{
    int b;
    public:
    B(int,int);
    void display();
};
   
    B::B(int p,int q):A(p)
    {
        cout<<"para constructor of b "<<endl;
        b=q;
    }
    void B:: display()
    {
        A::display();
        cout<<"val of b is"<<b<<endl;
    }





int main()
{
    B b1(2,3);
    b1.display();

}