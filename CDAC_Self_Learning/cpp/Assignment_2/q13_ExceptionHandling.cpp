#include<iostream>
using namespace std;

int main() {
    int a = 10, b = 0;

    try {
        if(b == 0)
            throw "Error";
        cout << a / b;
    }
    catch(const char* msg) {
        cout << msg;
    }
}