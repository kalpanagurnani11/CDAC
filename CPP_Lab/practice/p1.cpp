#include<iostream>
#include<math.h>
using namespace std;

int main()
{
//     char ch='A';
//     char cha='B';

//  cout<<ch+cha<<endl;
//  cout<<ch; 4

// A = P * (1 + R/100) ** T
// CI = A - P
double P=1200;
double R=5.4;
double T=2;
double A=P*pow((1+R/100),T);
cout<<A;

}