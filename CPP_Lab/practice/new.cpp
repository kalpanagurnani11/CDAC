#include<iostream>
using namespace std;
class A
{
    int a;
    public:
    A();
    void display();
};
   A:: A()
    {
        cout<<"default constructor of a "<<endl;
        a=0;
    }
    void A:: display()
    {
        cout<<"val of a is"<<a<<endl;
    }



class B:public A
{
    int b;
    public:
    B();
    void display();
};
   
    B::B()
    {
        cout<<"default constructor of b "<<endl;
        b=0;
    }
    void B:: display()
    {
        A::display();
        cout<<"val of b is"<<b<<endl;
    }





int main()
{
    B b1;
    b1.display();

}