#include<stdio.h>
#include<ctype.h>
int main(){
 	char ch;
 	int vowels = 0 ;
  	int consonats =0;
 	int others =0;
  	printf(" Nhap ch:");
	do{ 
	 ch = getchar();
 	 ch = toupper(ch);
 	 if((ch>'A') && (ch<'Z')){
 		switch(ch){
   			case'A':
   			case'E':
   			case'I':
   			case'O':
   			case'U': 
   				vowels ++ ;
  				break;
  			default:
  				 consonats ++ ;
			}
		} else others = others ++;
	}while ( ch != '\n');
    printf("vowels :%d\n",vowels);
    printf("consonats :%d\n",consonats);
    printf("others:%d\n",others);
 	getchar();
 	return 0;
}

