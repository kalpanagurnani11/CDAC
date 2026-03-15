//Create a class Book.
//Data Members
//? bookId
//? title
//? author
//? price
//Member Functions
//? input()
//? display()
//Requirements
//? Create 4 book objects take input from user.
//? Display information of all books.

#include<iostream>
using namespace std;
class book
{
	int *bookId=new int();
	char* title=new char[20];
	char* author=new char[20];
	float* price=new float();
	public:
	void input()
	{
		cout<<"enter bookId"<<endl;
		cin>>*bookId;
		cout<<"enter title"<<endl;
		cin>>title;
		cout<<"enter author"<<endl;
		cin>>author;
		cout<<"enter price"<<endl;
		cin>>*price;
	}
	void display()
	{
		cout<<"bookId :"<<*bookId<<endl;
		cout<<"title:"<<title<<endl;
		cout<<"author"<<author<<endl;
		cout<<"price"<<*price<<endl;
	}
	
	
};


int main()
{
	book b1;
	b1.input();
	b1.display();
int n;
//book b[n];
//cout<<"enter no of book to be added"<<endl;
//cin>>n;
//for(int i=0;i<n;i++)
//{
//	
//
//	cout<<"Enter details of Book "<<i+1<<endl;
//		b[i].input();
//	}
//
//	cout<<"Book Details";
//
//	for(int i=0;i<n;i++)
//	{
//		b[i].display();
//	}



	
}