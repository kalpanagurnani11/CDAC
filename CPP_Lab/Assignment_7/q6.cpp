// Q.6. Create a menu driven program for Shopping Cart System. Create class Item with data
// members itemId, itemName, price. Use vector to store items.
// Menu options:
// 1. Add Item
// 2. Display Items
// 3. Calculate Total Bill
// 4. Exit

#include<iostream>
#include<fstream>
#include<vector>

using namespace std;
class shopping
{
    int n,itemId;
    float price;
    string itemName;
    vector <shopping> v;

public:


    void add()
    {
        cout<<"enter no of items u want to add"<<endl;
        cin>>n;
        for(int i=1;i<=n;i++)
        {
            shopping temp;
            cout<<"enter item id,name,price ITEM NO."<<i<<endl;
            cin>>temp.itemId>>temp.itemName>>temp.price;
            try{
                if (temp.price<=0 )

                {
                    throw "invalid price";

                }
                v.push_back(temp);
            }
            catch(const char * msg)
            {
                cout<<"exception:"<<msg<<endl;
                // i--;
            }
        }
        


    }
    void display()
    {
        for(auto i:v)
        {
        cout<<"itemid:"<<i.itemId;
        cout<<"itemName:"<<i.itemName;
        cout<<"price:"<<i.price<<endl;
        }

    }
    void calculateTotal()
    {
        int total=0;
        for(auto i:v)
        {
            total+=i.price;
        }
        cout<<"total amt to be paid:"<<total;

    }
    void save()
    {
        ofstream f;
        f.open("items.txt" ,ios::in|ios::app);
        for(auto i:v)
        {
            f<<i.itemId;

        }
        f.close();
        cout<<"data saved"<<endl;
    }

};
 int main()
 {
    shopping s;
    int choice;
    do{
    cout<<"enter ur choice"<<endl;
    cout<<"1.add item"<<endl;
    cout<<"2.display item"<<endl;

    cout<<"3.calculate total"<<endl;
    cin>>choice;
    switch(choice)
    {
        
    case 1:s.add(); break;
    case 2:s.display();break;
    case 3:s.calculateTotal();break;
     case 4:s.save();break;

    }
}
    while(choice!=4);
    return 0;

 

 }
