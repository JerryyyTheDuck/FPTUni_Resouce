#include <stdio.h>
#include <stdlib.h>

int main()
{
  system("cls");
  printf("\nTEST Q3 (3 marks):\n");
  int n, i, sum;
  sum = 0;
  printf("Enter n = "); scanf("%d",&n);  
  //============================================================
  // Write your statements here  
  for(int i = 1; i<n; i++){
      if(n%i== 0){
        sum = sum+i;
      }
  }
 
  //End your codes
  printf("%d",sum);
  //====DO NOT ADD NEW OR CHANGE STATEMENTS AFTER THIS LINE====
  //==THE OUTPUT AFTER THIS LINE WILL BE USED TO MARK YOUR PROGRAM==
  printf("\nOUTPUT:\n");
  printf("%d",sum); 
  printf("\n");
  system ("pause");
  return(0);
}
