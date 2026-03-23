#include<iostream>
using namespace std;

class A
{
    public:
    A()
    {
        cout<<"const called"<<endl;
    }
      ~A()
    {
        cout<<"des called"<<endl;
    }

};
class B:public A
{
    public:
    B()
    {
        cout<<"const B called"<<endl;
    }
    ~B()
    {
        cout<<"des B called"<<endl;
    }
};
class C :public B
{
    public:
    C()
    {
        cout<<"const C called"<<endl;
    }
    ~C()
    {
        cout<<"des C called"<<endl;
    }


};

int main()
{

    C c1;

}
