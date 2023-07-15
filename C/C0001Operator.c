#include<stdio.h>
int func(int a)
{
    return a--;
}
int main()
{
    int a= func(5);
    printf("%d",a++);
    return 1;
}