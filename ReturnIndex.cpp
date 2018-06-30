#include <iostream>
#include <stack>
using namespace std;

int main()
{
    int index=-1;
    int i=0;
    string input="ABbba";
    stack <char> Stack;
  while(i<input.size()){
      
      if(Stack.empty()){
          Stack.push(input.at(i));
      }
      else{
         
          if(isupper(input.at(i))){
              Stack.push(input.at(i));
              index=i;
          }
          else if(input.at(i)==tolower(Stack.top())){
              Stack.pop();
              index=i;
          }
          else{
              cout<<index;
              return index;
          }
            
      }
      i++;
  }
  cout<<index;
   return index;
}
