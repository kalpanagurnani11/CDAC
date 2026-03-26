#include<iostream>
using namespace std;

class P{
protected:int s=20;
};

class S{
protected:int r=300;
};

class M:public P,public S{
    friend void show(M);
};

void show(M m){
    cout<<m.s<<" "<<m.r;
}

int main(){
    M m;
    show(m);
}