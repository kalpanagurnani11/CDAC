#include<iostream>
using namespace std;


    typedef class student{
        public:
        int id;
        void show()
        {
            cout<<"student id"<<id<<endl;

        }
    }stu;
    int main()
    {
        stu s;
        s.id=101;
        s.show();

    }
















// int main()
// {
//     typedef int x;
//     x a=10;
//     cout<<a;
// }