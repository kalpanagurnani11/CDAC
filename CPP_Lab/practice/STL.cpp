#include<iostream>
#include<vector>
#include<stack>
#include<map>

using namespace std;
int main()
{
    cout<<"enter";
    string str;
    cin>>str;
    map<char,int>freq;
    for(char ch:str)
    {
        freq[ch]++;
    }
    int n=str.length();
   
    for(auto i:freq)
    {
         if(i.second>((n+1)/2))
         {
            cout<<"no";


         }
         else
         cout<<"Yes"<<endl;
        // cout<<i.first<<" "<<i.second<<endl;
    }


   

   


}


//  map<int,string> m;
//     for(int i=0;i<4;i++)
//     {
//         int key;
//         string val;
//         cin>>val;
//         m[key]=val;

//     }
//     for(auto i:m)
//     {
//         cout<<i.first<<" "<<i.second<<endl;
//     }

 // stack<int> s;
    // s.push(10);
    // // cout<<s.pop();
    // cout<<s.top();
    // cout<<s.size();
    // s.pop();
    // cout<<s.size();
    // // cout<<s.empty();


// vector<int>v;
// v.push_back(20);
// v.push_back(10);
// v.push_back(30);
// for(int i=0;i<v.size();i++)
// cout<<v[i]<<" ";
// cout<<v.back();
// while(!v.empty())
// {
//     cout<<v.back()<<" ";
//     v.pop_back();

// }
// v.erase(v.begin()+1);
// while(!v.empty())
// {
//     cout<<v.back()<<" ";
    

// }
// cout<<v[3];
// v.clear();
// for(int i=0;i<v.size();i++)
// cout<<"this i printing"<<v[i]<<" ";
// v.pop_back();
//   cout<<v.pop_back(); 

// for(auto i:v)
// {
//     cout<<i;
// }