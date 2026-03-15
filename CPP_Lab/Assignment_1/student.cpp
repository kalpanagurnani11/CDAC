#include <iostream>
using namespace std;

class Student {
public:
    int rollNo;
    string name;
    string dob;
    int totalMarks;

    Student(int r, string n, string d, int t) {
        rollNo = r;
        name = n;
        dob = d;
        totalMarks = t;
    }

    void display() {
        cout << "Roll No: " << rollNo << endl;
        cout << "Name: " << name << endl;
        cout << "Date of Birth: " << dob << endl;
        cout << "Total Marks: " << totalMarks << endl;
    }
};

int main() {
    Student s1(1, "A", "2003-02-10", 480);
    s1.display();
}