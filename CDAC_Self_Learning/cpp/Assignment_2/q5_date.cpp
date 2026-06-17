
#include<iostream>
using namespace std;

class Date{
    int d;
public:
    void set(int x){ 
        d=x; 
    }
    Date operator+(int x){
        d+=x;
        return *this;
    }
    void show(){ 
        cout<<d; 
    }
};

int main(){
    Date d;
    d.set(10);
    d=d+5;
    d.show();
}