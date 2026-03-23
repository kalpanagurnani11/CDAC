#include<iostream>
using namespace std;
class shape
{
    int sides;
    shape()
    {
        cout<<"default cons called"<<endl;
        sides=0;
    }
    shape(int sides)
    {
        cout<<"para cons of shape"<<endl;
        this->sides=sides;
    }


    void display()
    {
        cout<<"no of sides are"<<sides;
    }
    int area()
{
    return 0;
}

};
class quad
{
    int sides;
    quad()
    {
        cout<<"default cons called"<<endl;
        sides=0;
    }
    quad(int sides)
    {
        cout<<"para cons of shape"<<endl;
        this->sides=sides;
    }


    void display()
    {
        cout<<"no of sides are"<<sides;
    }
    int area()
{
    return 0;
}

};




int main()
{

}