#include<iostream>
using namespace std;

class Analyzer
{
    int len;
    int *arr;
    public:
    void accept()
    {
        cout<<"enter no of elements to be added"<<endl;
        cin>>len;
        arr=new int[len];
        cout<<"enter elements of an array"<<endl;
        for(int i=0;i<len;i++)
        {
            cout<<"enter element "<<i<<endl;
            cin>>arr[i];
        }
    }
    void display()
    {
        cout<<"array is"<<endl;
        cout<<"[";
        for(int i=0;i<len;i++)
        {
            cout<<arr[i]<<" ";

        }
        cout<<"]";
        cout<<endl;
    }
    void max()
    {
        int m=arr[0];
        for(int i=0;i<len;i++)
        {
            if (m<arr[i])
            {
                m=arr[i];
            }
        }
        cout<<"max of array is:"<<m<<endl;
    }
     void min()
    {
        int m=arr[0];
        for(int i=0;i<len;i++)
        {
            if (m>arr[i])
            {
                m=arr[i];
            }
        }
        cout<<"min of array is:"<<m<<endl;
    }
    void avg()
    {

    
int sum=0;
{
    for (int i=0;i<len;i++)
    {
        sum+=arr[i];
    }
    cout<<"avg is :"<<sum/len<<endl;
}
    }

};


int main()
{
Analyzer a1;
a1.accept();
a1.display();
a1.max();
a1.min();
a1.avg();

}