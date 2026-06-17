// a

//  1 2
//  b c d
//  3 4 5 6
//  e f g h i
//  7 8 9 10 11 12

#include <iostream>
using namespace std;

int main() 
{


    int n = 4;
    int num=1;
    char ch='A';
    for(int i = 1; i <= n; i++) 
    {

        for(int j=1;j<=n-i;j++)
        {
            cout<<" ";
        }
        if(i%2!=0)
        {
        for(int j=1;j<=i;j++)
        {
            cout<<ch<<" ";
            ch++;
        }
        }
        else{
             for(int j=1;j<=i;j++)
        {
            cout<<num<<" ";
            num++;
        }

        }
      
        cout<<" "<<endl;
    }
}
