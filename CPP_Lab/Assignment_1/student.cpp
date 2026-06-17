#include<iostream>
using namespace std;

class Student
{
    int roll;
    string name;
    string dob;
    float marks;

public:
    Student() {}

    Student(int r, string n, string d, float m)
    {
        roll = r;
        name = n;
        dob = d;
        marks = m;
    }

    void display()
    {
        cout<<"Roll No: "<<roll<<endl;
        cout<<"Name: "<<name<<endl;
        cout<<"DOB: "<<dob<<endl;
        cout<<"Marks: "<<marks<<endl;
        cout<<"-------------------"<<endl;
    }

    int getRoll()
    {
        return roll;
    }

    string getDOB()
    {
        return dob;
    }

    float getMarks()
    {
        return marks;
    }
};

int main()
{
    Student s[10];

    int r;
    string n,d;
    float m;

    for(int i=0;i<10;i++)
    {
        cout<<"Enter roll, name, dob, marks:"<<endl;
        cin>>r>>n>>d>>m;
        s[i] = Student(r,n,d,m);
    }

    cout<<"\n--- Sorted by Roll No ---\n";
    for(int i=0;i<10;i++)
    {
        for(int j=i+1;j<10;j++)
        {
            if(s[i].getRoll() > s[j].getRoll())
                swap(s[i],s[j]);
        }
    }

    for(int i=0;i<10;i++) s[i].display();

    cout<<"\n--- Sorted by DOB ---\n";
    for(int i=0;i<10;i++)
    {
        for(int j=i+1;j<10;j++)
        {
            if(s[i].getDOB() > s[j].getDOB())
                swap(s[i],s[j]);
        }
    }

    for(int i=0;i<10;i++) s[i].display();

    cout<<"\n--- Sorted by Marks ---\n";
    for(int i=0;i<10;i++)
    {
        for(int j=i+1;j<10;j++)
        {
            if(s[i].getMarks() > s[j].getMarks())
                swap(s[i],s[j]);
        }
    }

    for(int i=0;i<10;i++) s[i].display();

    return 0;
}