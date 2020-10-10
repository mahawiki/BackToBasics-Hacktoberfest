#include<iostream> 
using namespace std; 
  
void pattern(int n) 
{     
    // For printing the upper part of the pyramid 
    for (int i = 1; i < n; i++){ 
        for (int j = 1; j < i+1; j++){ 
            cout <<" * "; 
        } 
        cout << endl ; 
    } 
  
    // For printing the lower part of pyramid 
    for (int i = n; i > 0; i--){ 
        for (int j = i; j > 0; j--){ 
            cout <<  " * "; 
        } 
        cout << endl ; 
    } 
} 
  
// Driver program  
int main() 
{ 
    pattern(6); 
    return 0; 
} 

/*
OUTPUT:
*
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
*/