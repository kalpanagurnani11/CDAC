#include<iostream>
using namespace std;

int main()
{
    char str[]="pune";
    char str1[10]="hello";
    int len=strlen(str);
    cout<<len<<endl;
    cout<<sizeof(str);
    // strcpy(str1,str);
    // cout<<str1;
    strcat(str1,str);
    cout<<str1;
    cout<<strrev(str);
    int x=strcmp(str1,str);
    if(x==1)
    {
        cout<<"string 1"<<endl;
    }
    if(x==-1)
    {
        cout<<"string 2";
    }
    if(x==0)
    {
        cout<<"equal";
    }

}
