#include<stdio.h>
int main()
{
    int m=0;
    if(m==0)
    {
        m=((5,(m=3)),m=1);
        printf("%d",m);
    }
    else 
    printf("Test");
    return 1;
}