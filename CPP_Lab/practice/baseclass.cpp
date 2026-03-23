#include<iostream>
using namespace std;
class A
{
    protected:
    int a;
    public:
    A()
    {
        cout<<"default constructor of a "<<endl;
        a=0;
    }
    void display()
    {
        cout<<"val of a is"<<a<<endl;
    }

};

class B:public A
{
    int b;
    public:
   
    B()
    {
        cout<<"default constructor of b "<<endl;
        b=0;
    }
    void display()
    {
        A::display();
        cout<<"val of  a and b is"<<a<<b<<endl;
    }



};

int main()
{
    B b1;
    b1.display();

}