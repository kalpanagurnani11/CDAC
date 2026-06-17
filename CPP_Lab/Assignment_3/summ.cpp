#include <iostream>
using namespace std;

int add(int a=10, int b=20) {
    return a+b;
}

int main() {
    cout << add() << endl;
    cout << add(50) << endl;
    cout << add(10,20) << endl;
}