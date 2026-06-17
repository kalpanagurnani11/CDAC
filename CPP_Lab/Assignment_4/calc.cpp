#include <iostream>
using namespace std;

class Calculator {
public:
    float n1, n2;

    void add() {
        cout << n1 + n2 << endl;
    }

    void sub() {
        cout << n1 - n2 << endl;
    }

    void mul() {
        cout << n1 * n2 << endl;
    }

    void div() {
        cout << n1 / n2 << endl;
    }

    void sq() {
        cout << n1 * n1 << " " << n2 * n2 << endl;
    }
};

int main() {
    Calculator c;
    cin >> c.n1 >> c.n2;

    c.add();
    c.sub();
    c.mul();
    c.div();
    c.sq();
}