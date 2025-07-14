#include <stdio.h>

void main() {
    int number;
    printf("Enter number :: ");
    scanf("%d",&number);
    int last=number%100;
    printf("%d",last);
}