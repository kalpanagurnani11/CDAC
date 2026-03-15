#include <iostream>
using namespace std;

int area(int s) { return s*s; }
int area(int l,int b) { return l*b; }

int main() {
    cout << area(5) << endl;
    cout << area(4,6) << endl;
}