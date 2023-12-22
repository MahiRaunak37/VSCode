// Using namespace in the cpp
#include <iostream> //include header file
#include <string>
using namespace std; // using std from iostream header

int main()
{
    string fullName;
    cout << "Type your full name: ";
    getline (cin, fullName);
    cout << "Your name is: " << fullName;
    return 0;
}
