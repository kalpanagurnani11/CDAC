#include<iostream>
#include<fstream>
#include<string>
using namespace std;
int main()
{
  fstream f ;
  f.open("student.txt", ios::in|ios::app);
  f<<"hello"<<endl;
 
  f.clear();
  f.seekg(0);

  string line;
  while(getline(f,line))
  {
      cout<<line<<endl;
  }

}



















// {
//   fstream f("studnt.txt",ios::in|ios::app);
//   f<<"new hii there"<<endl;
//   f.clear();
// f.seekg(0);
//   string Line;
//     while(getline(f,Line))
//     {
//         cout<<Line<<endl;

//     }
//      f.clear();
// f.seekg(0);
//     string word;
//     while(f>>word)
// {
//     cout<<word<<endl;
// }  f.close();
  


//   ifstream f;
//     f.open("studnt.txt");
//     string Line;
//     while(getline(f,Line))
//     {
//         cout<<Line<<endl;

//     }
   
//     f.close();


//   fstream f;
//     f.open("studnt.txt");
//     f<<"Kalpana"<<endl;
//     f<<"roll no 1"<<endl;
//     f.close();


  // ifstream my_file("sample.txt");
    // if (!my_file.is_open())
    // {
    //     cout<<"error"<<endl;
    // }
    // else{
    //     cout<<"file opened"<<endl;
    // }
    // string line;
    // while(!my_file.of())
    // {
    //     getline(my_file,line);
    //     cout<<line<<endl;
    // }
    // my_file.close();