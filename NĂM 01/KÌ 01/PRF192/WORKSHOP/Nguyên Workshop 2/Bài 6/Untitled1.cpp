#include<stdio.h>
int main() {
   char ch;
   for (int i = 0; i < 256; i++) {
      printf("%c: %d, %o, %X\n",ch,ch,ch,ch);
      ch = ch + 1; 
   }
}
