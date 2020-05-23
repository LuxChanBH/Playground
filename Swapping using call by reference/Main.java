#include<iostream>
void swap(int&, int&);
int main ()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<'\n';
  swap(a,b);
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
}
void swap ( int &x , int &y)
{
  int temp = x;
  x=y;
  y =temp;
}