#include<iostream>
using namespace std;
int main()
{
    int n;

    cout<<"enter count"<<endl;
    cin>>n;
    int arr[n];

    cout<<"enter nos"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int lar=arr[0];
    int sec=arr[0];

    for(int i=0;i<n;i++)
    {
        if(arr[i]>lar)
        {
            sec=lar;
            lar=arr[i];
            

        }
        else if(arr[i]>sec && arr[i]!=lar)
        {
            sec=arr[i];
        }
    }
    cout<<sec;
}