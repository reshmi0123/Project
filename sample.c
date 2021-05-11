#include<stdio.h>
int main()
{
    int i=1;double fact=1.0;
    double sum=0.0;
    for(i=1;i<=5;i++)
    {
        fact=fact*i;
        sum=sum+(i/fact);
    }
    printf("%f",sum);
    return 0;

}