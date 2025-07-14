#include <stdio.h>

void isEven(int);
void main() {
    int num;
    printf("Enter the num :: ");
    scanf("%d",&num);
    isEven(num);
}

void isEven(int num){
    if(num%2 == 0) printf("Even");
    else printf("ODD");
}