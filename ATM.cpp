#include<iostream>
using namespace std;
int main()
{
int a,i;
float b,n;
cout<<"Enter amount and balance:"<<endl;
cin>>a>>b;
if(a%5==0)
{
n=b-a-0.5;
cout<<"Transaction Successful! Remaining Balance: "<<n<<endl;
}
else
cout<<"Transaction Failed! Remaining Balance: "<<b<<endl;
}

