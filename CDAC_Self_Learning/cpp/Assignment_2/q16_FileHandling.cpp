#include<iostream>
#include<fstream>
using namespace std;

int main() {
    ofstream fout("hello.txt");
    fout << "Hello,hii";
    fout.close();

    ifstream fin("hello.txt");
    string s;
    fin >> s;
    cout << s;
    fin.close();
}