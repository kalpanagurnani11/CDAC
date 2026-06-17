#include<iostream>
using namespace std;
class emp
{
    int id;
    public:
    emp()
    {
         cout<<"default cons of emp"<<endl;
        
        id=0;
        // cout<<"id is"<<id<<endl;

    }
    emp(int id)
    {
         cout<<"para cons of emp"<<endl;
        this->id=id;
        // cout<<"para id is"<<id<<endl;
    }
    void display()
    {
        cout<<"id is"<<id<<endl;

    }
    int computesal()
    {
        return 0 ;
    }
};
class wageemp:public emp
{
    int rate;
    int hrs;
    public:
    wageemp()
    {
        cout<<"default cons of wage"<<endl;
        rate,hrs=0;
        // cout<<"id is"<<id<<endl;

    }
    wageemp(int id,int hrs,int rate):emp(id)
    {
        cout<<"para cons of wage"<<endl;
        this->rate=rate;
        this->hrs=hrs;
         
        // cout<<"para id is"<<id<<endl;
    }
    void display()
    {
        emp::display();
        cout<<"hrs is"<<hrs<<endl;
        cout<<"rate is"<<rate<<endl;

    }
    int computesal()
    {
        return hrs*rate;
    }


};
class sale:public wageemp
{
    int sales;
    int comm;
    public:
    sale()
    {
        cout<<"default cons of sale"<<endl;
        sales,comm=0;
        // cout<<"id is"<<id<<endl;

    }
    sale(int id,int hrs,int rate,int sales,int comm ):wageemp(id,rate,hrs)
    {
        cout<<"para cons of sale"<<endl;
        this->sales=sales;
        this->comm=comm;
         
        // cout<<"para id is"<<id<<endl;
    }
    void display()
    {
        wageemp::display();
        cout<<"sales is"<<sales<<endl;
        cout<<"comm is"<<comm<<endl;

    }
    int computesal()
    {
        return wageemp::computesal()+(sales+comm);
    }




};

int main()

{
    sale s1(1,2,3,4,5);
    s1.display();
    cout<<"salary is"<<s1.computesal()<<endl;

}