#include<stdio.h>
#include<stdlib.h>
int main()
{
int n,a[100],c;
int i,j,count=0;

printf("Enter the size of the array:\n");
scanf("%d",&n);
printf("Enter a collection of numbers\n");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
c=a[i]+a[j];
if(c==8)
{
count++;
}
}
}
if(count>0)
printf("There are %d pair(s) in the set whose sum=8!\n",count);
else
printf("Unsuccessful! No pair(s) found.\n");

return 0;
}

