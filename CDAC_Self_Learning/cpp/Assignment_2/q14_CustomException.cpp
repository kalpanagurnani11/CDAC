#include<iostream>
using namespace std;

class MyException {
public:
    void message() {
        cout << "Invalid age";
    }
};

int main() {
    int age = 15;

    try {
        if(age < 18)
            throw MyException();
    }
    catch(MyException e) {
        e.message();
    }
}