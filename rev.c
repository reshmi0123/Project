// CAAS TNP MOCK Q2 , reverse of a number 

//C approach 
#include <stdio.h>
 
/* Iterative function to reverse digits of num*/
int reversDigits(int num)
{
    int rev_num = 0;
    while (num > 0) {
        rev_num = rev_num * 10 + num % 10;
        num = num / 10;
    }
    return rev_num;
}
 
/*Driver program to test reversDigits*/
int main()
{
    int num;
    printf("Enter the number : ");
    scanf("%d",&num);
    printf("Reverse of no. is %d", reversDigits(num));
 
    getchar();
    return 0;
}



/*  
 int ReverseNumber ( int n)
 {
     int p,rev=0;
     while ( n>0)
     {
         p=n%10;
         rev=(rev*10)+p;
         n=n/10;
     }
     retuen rev;
 }


*/
