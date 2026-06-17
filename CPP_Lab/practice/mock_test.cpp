// 1) Given a string str with repeated characters, the task is to rearrange the characters in a string
// Such a that no two adjacent characters are same. If it is possible than print YES else print NO.
// Input: str=”GGGG”
// Output: NO
// Input : str=”BBBAA”
// Output: YES

#include<iostream>
#include<string.h>
#include<map>
using namespace std;


int main()
{
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
        if(i.second>(n+1)/2)
        {
            cout<<"no";
            return 0;
        }        

    }
cout<<"yes";


}