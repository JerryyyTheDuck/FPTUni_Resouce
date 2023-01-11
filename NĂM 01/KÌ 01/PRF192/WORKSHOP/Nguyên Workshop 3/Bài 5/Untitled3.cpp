#include<stdio.h>
double fibo ( int n) {
    int s1=1, s2=1, other=1;
   for ( int i= 3; i<=n; i++) {
      other= s1 + s2;
      s1= s2;
      s2=other;
   }
   return other;
}
int main(){
	int n ;
do {
	printf("Nhap n: "); scanf("%d",&n);}
while (n<1);
printf("Gia tri la: %lf",fibo(n));
return 0;
}

