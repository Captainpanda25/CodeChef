#include<stdio.h>
int main()
{
int a,b,c;
char str[10];
scanf("%d%d",&a,&b);
if(a<10000&&b<a)	//Condition where b<a<10k 
{
c=a-b;			
sprintf(str,"%d",c);	
if(str[0]=='1')		//Condition where if the first digit of the difference is 1, make it 8
str[0]='8';
else
str[0]=str[0]-1;
printf("%s\n",str);
}
return 0;
} 
