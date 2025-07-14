#include <stdio.h>

void main() {
    int num;
    printf("Enter the num :: ");
    scanf("%d",&num);
    if(num%2 == 0) printf("Num is EVEN");
    else printf("Num is ODD");
}