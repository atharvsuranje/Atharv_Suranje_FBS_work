#include <stdio.h>

void main() {
    int age;
    printf("Enter the age :: ");
    scanf("%d",&age);
    if(age>=18) printf("ELIGIBLE");
    else printf("NOT ELIGIBLE");
}