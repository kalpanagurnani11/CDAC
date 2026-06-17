#include<iostream>
using namespace std;

class Complex
{
    int real,img;
    public:
    Complex()
    {
        cout<<"default" <<endl;
        real=1;
        img=2;
    }
    Complex(int real,int img)
    {
        this->real=real;
        this->img=img;

    }
    void display()
    
    {
        if(img>0)
        {
          cout<<"complex no is "<<real<<"+"<<img<<"i"<<endl;  
        }
        else{
            cout<<"complex no is "<<real<<img<<"i"<<endl;
        }
    }
    Complex operator +(Complex c)
{
    Complex temp;
    temp.real = this->real + c.real;
    temp.img = this->img + c.img;
    return temp;
}
   Complex operator -(Complex c)
{
    Complex temp;
    temp.real = this->real - c.real;
    temp.img = this->img - c.img;
    return temp;
}
Complex operator-()
{
    this->real=-real;
    this->img=-img;
    return(*this);
}


};
int main()
{
    Complex c1;
    Complex c2(3,5);
    Complex c3=c1.operator +(c2);
    c3.display();
    Complex c4=c1.operator -(c2);
    c4.display();
    c1=c1.operator -();
    c1.display();


}