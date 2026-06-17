// 
#include<iostream>
#include<vector>
#include<string>
using namespace std;

class Book
{
    int bookId;
    string title;
    string author;
    float price;

public:
    void input()
    {
        cout<<"Enter bookId: ";
        cin>>bookId;

        cout<<"Enter title: ";
        cin.ignore();
        getline(cin, title);

        cout<<"Enter author: ";
        getline(cin, author);

        cout<<"Enter price: ";
        cin>>price;
    }

    void display()
    {
        cout<<"BookId: "<<bookId<<endl;
        cout<<"Title: "<<title<<endl;
        cout<<"Author: "<<author<<endl;
        cout<<"Price: "<<price<<endl;
        cout<<"-------------------"<<endl;
    }
};

int main()
{
    vector<Book> b(4);   // 4 books

    for(int i=0;i<4;i++)
    {
        cout<<"\nEnter details of Book "<<i+1<<endl;
        b[i].input();
    }

    cout<<"\n--- Book Details ---\n";

    for(int i=0;i<4;i++)
    {
        b[i].display();
    }

    return 0;
}