// #include<iostream>
// using namespace std;
// struct student
// {
//     int id;
//     int marks[6];
// };
// int main()
// {
//     student s1,s2;
//     s1.id=1;
//     cout<<s1.id;
//     return 0;
// }
#include<iostream>
using namespace std;
class Student
{
    int id;
public:
    void get()
    {
        cin>>id;
    }
    void display()
    {
        cout<<"ID = "<<id<<endl;
    }
};

int main()
{
    Student s[3];

    cout<<"Enter IDs:\n";
    for(int i=0;i<3;i++)
    {
        s[i].get();
    }

    cout<<"Details:\n";
    for(int i=0;i<3;i++)
    {
        s[i].display();
    }
}


// #include<iostream>
// using namespace std;

// class stu
// {
// public:
//     void get()
//     {
//         cout<<"get function";
//     }

//     void put()
//     {
//         cout<<"put function";
//     }
// };

// int main()
// {
//     stu s;
//     s.get();
//     s.put();
// }

