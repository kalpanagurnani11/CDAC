#include<iostream>
using namespace std;

class P{
public:
    virtual void print()=0;
};

class I:public P{
public:
    void print(){
         cout<<"Ink"; 
        }
};

int main(){
    P *p;
    I i;
    p=&i;
    p->print();
}