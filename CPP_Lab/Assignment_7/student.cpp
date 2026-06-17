// Q.5. Create a menu driven program for Student Record System. Use map to store rollNo and
// name.
// Menu options:

// 1. Add Record
// 2. Display Records
// 3. Save to File
// 4. Exit

#include<iostream>
#include<fstream>
#include <map>
using namespace std;
class Student
{
    map<int,string> m;
    int n,id;
    string name;
    public:
    void add()
    {
    cout<<"enter no.of students u want to enter"<<endl;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        cout<<"enter id and name of student "<<i<<endl;
        cin>>id>>name;
        try{
            if(id <=0)
            {
                throw "invalid id";
            }
          m[id]=name;  
        }
        catch(const char * msg)
        {
            cout<<"exception:"<<msg<<endl;
        }
         
        // m.insert(pair<int,string>(id,name));

    }

    }
    void display()
    {
        for(auto it=m.begin();it!=m.end();++it)
        {
            cout<<"id :"<<it->first<<"name:"<<" " <<it->second<<endl;

        }
    }
    void save()
    {
        ofstream f("stu.txt");
        for (auto i:m)
        {
            f<<"id:"<<i.first<<" "<<"name: "<<i.second<<endl;
        }
        f.close();
        cout<<"data saved"<<endl;
    }
   
};


int main()
{
    Student s1;
    int choice;
    do{
    cout<<"enter ur choice"<<endl;
    cout<<"1.Add"<<endl;
    cout<<"2.Display"<<endl;
    cout<<"3.Save"<<endl;
    cin>>choice;
    
         switch (choice)
    {
    case 1: s1.add(); break;
    case 2:s1.display();break;
    case 3:s1.save();break;
    case 4:break;
    default:cout<<"invalid choice";

    }

    }
   
    while(choice!=4);
    return 0;
   

}