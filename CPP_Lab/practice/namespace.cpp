#include<iostream>
using namespace std;

namespace first
{
    int a=10;
    void func()
    {
        cout<<"inside first"<<endl;
    }
    namespace sec
{
    int a=100;
    void func()
    {
        cout<<"inside sec"<<endl;
    }

}
}
namespace third
{
    int a=100;
    void func()
    {
        cout<<"inside sec"<<endl;
    }

}
using namespace first::sec;
int main()
{
    func();
}
