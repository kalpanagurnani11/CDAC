#include <iostream>
#include <string>
using namespace std;

class Emp {
public:
    int id;
    string name;
    float sal;
    static int totalEmp;
    static string companyName;

    Emp(int i, string n, float s) {
        id = i;
        name = n;
        sal = s;
        totalEmp++;
    }

    void display() {
        cout << "EmpID: " << id
             << ", Name: " << name
             << ", Salary: " << sal
             << ", Company: " << companyName << endl;
    }

    static void showTotalEmp() {
        cout << "Total Employees: " << totalEmp << endl;
    }
};

int Emp::totalEmp = 0;
string Emp::companyName = "ABC Comp";

int main() {
    Emp e1(101, "A", 50000);
    Emp e2(102, "B", 55000);
    Emp e3(103, "C", 60000);
    Emp e4(104, "D", 52000);
    Emp e5(105, "E", 58000);

    e1.display();
    e2.display();
    e3.display();
    e4.display();
    e5.display();

    Emp::showTotalEmp();
    return 0;
}