#include <stdio.h>
#include <stdlib.h>
#include<math.h>

double average1(float a, float b, float c){
	double r;
	//Write your statements here
  r = (a+b+c)/3;
	//End your statements 
	return r ;
}
int main()
{
  //=============DO NOT ADD NEW OR CHANGE THIS STATEMENTS========
  system("cls");
  printf("\nTEST Q1 (2 marks):\n");
  float a, b, c;
  double r;
  printf("Enter a = "); scanf("%d",&a);
  printf("Enter b = "); scanf("%d",&b);
  printf("Enter c = "); scanf("%d",&c);   
  r = average1(a,b,c); 
  printf("\nOUTPUT:\n");
  printf("%.2lf",r); 
  printf("\n");
  system ("pause");
  return(0);
  //============================================================ 
}
