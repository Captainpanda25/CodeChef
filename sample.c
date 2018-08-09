#include<stdio.h>
int main()
{
int a;
float b,n;
scanf("%d%f",&a,&b);
if(a%5==0&&a>0&&a<=2000&&b>0&&b<=2000)
{
n=b-a-0.50;
printf("%.2f",n);
}
else
printf("%.2f",b);
}
