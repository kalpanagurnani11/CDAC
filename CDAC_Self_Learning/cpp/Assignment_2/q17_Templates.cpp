#include<iostream>
using namespace std;

template<class T>
T add(T a, T b) {
    return a + b;
}

int main() {
    cout << add(2,3) << endl;
    cout << add(3.5,3.5);
}