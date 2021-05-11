// CAAS TNP MOCK Q1 , count the common elements from 2 arrays , having length n , m 

// C++ implementation of the approach 
#include <bits/stdc++.h> 
using namespace std; 
#define MAX 100000 
bitset<MAX> bit1, bit2, bit3; 
  
// Function to return the count of common elements 
int count_common(int a[], int n, int b[], int m) 
{ 
  
    // Traverse the first array 
    for (int i = 0; i < n; i++) { 
  
        // Set 1 at position a[i] 
        bit1.set(a[i]); 
    } 
  
    // Traverse the second array 
    for (int i = 0; i < m; i++) { 
  
        // Set 1 at position b[i] 
        bit2.set(b[i]); 
    } 
  
    // Bitwise AND of both the bitsets 
    bit3 = bit1 & bit2; 
  
    // Find the count of 1's 
    int count = bit3.count(); 

    cout <<" \n Number of common elements : " ;
   return count ;
} 
  
// Driver code 
int main() 
{ 
    int i,j,m,n;
    cout << "Enter the size of array 1 :";
    cin>>n;
    int a[n];
    cout<< "Enter the array 1 :";
    for( int i=0;i<n;i++)
    {
        cin >> a[i]; 
    }

    cout << "Enter the size of array 2 :";
    cin>>m;
    int b[m];
    cout<< "Enter the array 2 :";
    for( int j=0;j<m;j++)
    {
        cin >> b[j]; 
    }
    cout << count_common(a, n, b, m); 
  
    return 0; 
} 



/*  
int CommonCount ( int arr1[],int n1, int arr2[],int n2)
{
    int i,j,count=0;
    for(i=0;i<n1;i++){
        for (j=0;j<n2;j++){
            if arr1[i]=arr2[j]
            {
                count ++;
            }
        }
    }
    return count ;
}

*/