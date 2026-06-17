#include<iostream>
using namespace std;
class B;
class A
{
    int a;
    public:
    int geta();
    friend void big(A&,B&);
};
int A::geta()
{
    cout<<"enter the val of a"<<endl;
    cin>>this->a;
}

class B
{
    int b;
    public:
    int getb()
    {
        cout<<"enter b:"<<endl;
        cin>>this->b;

    }
    friend void big(A&,B&);

};
void big(A&x,B&y)
{
    if(x.a>y.b)
    {
        cout<<x.a<<"is greater"<<endl;
    }
    if(x.a<y.b)
    {
        cout<<y.b<<"is greater"<<endl;
    }
    else
    {
        cout<<"both are equal";
    }

}

int main()
{
    A aobj;
    B bobj;
    aobj.geta();
    bobj.getb();
    big(aobj,bobj);
   

}
















// #include<iostream>
// using namespace std;

// class A
// {
//     int a;
//     public:
//     int geta();
//     friend void xyz(A&);
// };
// int A::geta()
// {
//     cout<<"enter the val of a"<<endl;
//     cin>>this->a;
// }
// void xyz(A& a1obj)
// {
//     cout<<"friennd func "<<a1obj.a<<endl;
// }

// int main()
// {
//     A aobj;
//     aobj.geta();
//     xyz(aobj);

// }
