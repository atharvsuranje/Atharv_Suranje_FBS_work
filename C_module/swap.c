#include <stdio.h>

void swap(int*,int*);
void main() {
    int a=10,b=20;
    printf("Before swapping :: %d %d\n",a,b);
    swap(&a,&b);
    printf("After swapping :: %d %d ",a,b);
}

void swap(int* x,int*y){
    int temp=*x;
    *x=*y;
    *y=temp;
}