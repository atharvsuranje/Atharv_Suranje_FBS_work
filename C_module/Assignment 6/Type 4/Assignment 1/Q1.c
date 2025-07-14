#include <stdio.h>

int isEven(int);
void main() {
    int num,flag=0;
    printf("Enter the num :: ");
    scanf("%d",&num);
    flag=isEven(num);
    if(flag) printf("Even");
    else printf("ODD");
}

int isEven(int num){
    if(num%2 == 0) return 1;
    else return 0;
}