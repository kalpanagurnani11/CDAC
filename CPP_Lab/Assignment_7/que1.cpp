#include<iostream>
using namespace std;
class SortArray
{
    int n;
     int arr[100];
    public:
    void accept()
    {
    cout<<"enter no of elements"<<endl;;
    cin>>n;
   
    cout<<"enter elments"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<"array is:"<<arr<<endl;

    }

    void sorted()
    {
        for(int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;


                }
            }
        }
    }
    void display()
    {
        cout<<"sorted arr :"<<endl;
        for(int i=0;i<n;i++)
        {
            cout<<arr[i];
        }
    }
   

};

int main()
{
    SortArray obj;

    obj.accept();
    obj.sorted();
    obj.display();

}