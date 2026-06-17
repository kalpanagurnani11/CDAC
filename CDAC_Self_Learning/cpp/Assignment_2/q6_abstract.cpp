#include<iostream>
using namespace std;

class Shape{
public:
    virtual void draw()=0;
};

class C:public Shape{
public:
    void draw(){ 
        cout<<"Circle";
     }
};

int main(){
    C c;
    c.draw();
}