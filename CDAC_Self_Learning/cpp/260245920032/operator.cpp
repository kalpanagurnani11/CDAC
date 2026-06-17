#include<iostream>
using namespace std;
int main()
{
	int a=10,b=20;
	//assignment operator
	cout<<"=========================================================="<<endl;
	cout<<"assignemnt operator"<<endl;
	cout << "a += b is " << (a += b) << endl;
	cout << "a -= b is " << (a -= b) << endl;
	cout << "a *= b is " << (a *= b) << endl;
	cout << "a /= b is " << (a /= b) << endl;
cout<<"=========================================================="<<endl;	
	//unary operator
cout<<"unary operator"<<endl;	
cout << "a=" << a << endl;
a++;
cout<<"post increment"<<a<<endl;
 a++ ;
cout<<"pre increment"<<a<<endl;
cout<<"b="<<b<<endl;
b--;
cout<<"post decrement"<<b<<endl;
--b;
cout<<"pre decrement"<<b<<endl;

cout <<b<<endl;
cout<<"=========================================================="<<endl;
cout<<"logical operator"<<endl;	
	//logical operator
	cout << "a && b: " << (a && b) << endl;
    cout << "a || b :" << (a || b) << endl;
    cout << "!b is " << (!b)<<endl;
	
	cout<<"=========================================================="<<endl;
	cout<<"ternary operator"<<endl;
	//ternary operator
	int res = (a < b) ? b : a;
    cout << "greatest no is " << res<<endl;
    
    int r = (a > b) ? b : a;
    cout << "smallest no is " << r<<endl;
	
}