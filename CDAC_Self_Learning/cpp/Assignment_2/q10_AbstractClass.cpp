#include<iostream>
using namespace std;

class Printer {
public:
    virtual void print() = 0;
};

class Inkjet : public Printer {
public:
    void print() {
        cout << "Printing using Inkjet" << endl;
    }
};

int main() {
    Inkjet obj;
    obj.print();
}