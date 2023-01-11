#include <stdio.h>
#include <stdlib.h>

int main()
{
  //==============DO NOT CHANGE THIS STATEMENTS=================
  system("cls");
  printf("\nTEST Q2 (2 marks):\n");
  int n,sum,i;
  sum = 0;
  printf("Enter n = "); scanf("%d",&n); 
  //============================================================

    
  // Write your statements here
  for(int i =1; i<= n; i++){
      sum = sum +i;
  }  
  
  // End your codes  
  printf("%d",sum);
  
  //====DO NOT ADD NEW OR CHANGE STATEMENTS AFTER THIS LINE====
  //==THE OUTPUT AFTER THIS LINE WILL BE USED TO MARK YOUR PROGRAM==
  printf("\nOUTPUT:\n");
  printf("%d",sum); 
  printf("\n");
  system ("pause");
  return(0);
}
