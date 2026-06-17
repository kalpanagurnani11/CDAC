#include<iostream>
#include<stdexcept>
using namespace std;

int main()
{
    try
    {
        try{
            throw 20;

        }
        catch(int n)
        {
            cout<<"partially"<<endl;
            throw;
        }

    }
    catch(int n)
    {
      cout<<"handle remaining";
    }
    
}
 
// int main() {
//   try {
//     cout<<"enter the age"<<endl;
//     int age;
//    cin>>age;
//     if (age<0 || age>100)
//     {
//       throw (age);
// }
//  }
//  catch (int e) {
// cout << "Access denied\n";
// }
 
// }



// int x=5;
// int main()
// {
//     try
    
//         {
//             if(x==0)
//             {
//                 throw x;
//             }
//             else if(x>0)
//             {
//                 throw 'x';

//             }
//             else 
//             {

           
//             throw "x is negative";
//             }
//         }
//         catch(int i)
//         {
//             cout<<"caught in int excep"<<i<<endl;
//         }
//          catch(char c)
//         {
//             cout<<"caught in char excep"<<c<<endl;
//         }
//          catch(char* str)
//         {
//             cout<<"caught in string excep"<<str<<endl;
//         }
    
    
   
    
// }









// int main()
// {
//     int num,den,res;
//     cout<<"enter num";
//     cin>>num;
//     cout<<"enter den";
//     cin>>den;
//     try{
//         if(den==0)
//         throw 0;
//         else{
//             res=num/den;
//               cout<<"res"<<res<<endl;
//         }
// cout<<"end";
//     }
//     catch(float e)
//     {
//         cout<<"in catch"<<endl;

//     }
//     catch(int* e)
//     {
//         cout<<"den should not be 0"<<endl;

//     }
//     catch(...)
//     {
//         cout<<"something went wrong";
//     }
//     cout<<"the end";


// }































// // #include<iostream>
// // using namespace std;

// // class A
// // {
// //     int x;

// // };
// // class B{
// //     int x;
// // }
