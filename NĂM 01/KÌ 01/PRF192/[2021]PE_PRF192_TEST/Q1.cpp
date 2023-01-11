#include <stdio.h>
int swap(int *a, int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
}
int main(){
	int a,b,c,d;
	printf("input a: ");
	scanf("%d",&a);
	printf("input b: ");
	scanf("%d",&b);
	printf("input c: ");
	scanf("%d",&c);
	printf("input d: ");
	scanf("%d",&d);
	//your code
	if(a<b){
		swap(&a,&b);
	}
	if(a<c){
		swap(&a,&c);
	}
	if(a<d){
		swap(&a,&d);
 	}

	if(b>c){
		swap(&b,&c);
	}
	if(b>d){
		swap(&b,&d);
	}
	//OUTPUT HERE
	printf("Input: a = %d, b = %d, c = %d, d = %d",a,b,c,d);
	printf("\n\nAfter processing: a = %d, b = %d",a,b);

}

