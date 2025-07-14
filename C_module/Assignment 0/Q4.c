#include <stdio.h>
void main(){
    int a=10,b=5;
    int temp;
    temp=a;
    a=b;
    b=temp;
    printf("Sum is %d %d",a,b);
}