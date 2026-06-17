#include<iostream>
using namespace std;
class fact
{
    int n;
    int fac=1;
    public:
     void accept()
    {
    cout<<"enter no"<<endl;;
    cin>>n;
    }
    void facto()
    {
        for(int i=1;i<=n;i++)
        {
            fac=fac*i;
            
        }
        cout<<fac;
        
    }
};
int main()
{
    fact f;
    f.accept();
    f.facto();

}