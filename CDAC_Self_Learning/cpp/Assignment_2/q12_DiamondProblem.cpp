#include<iostream>
using namespace std;

class Person {
public:
    void show() { cout << "Person" << endl; }
};

class Student : virtual public Person {};
class Employee : virtual public Person {};

class Intern : public Student, public Employee {};

int main() {
    Intern i;
    i.show();
}