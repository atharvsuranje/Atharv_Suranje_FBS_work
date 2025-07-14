#include <stdio.h>

void isEligible(int*);
void main() {
    int age;
    printf("Enter the age :: ");
    scanf("%d",&age);
    isEligible(&age);
}

void isEligible(int* age){
    if(*age>=18) printf("ELIGIBLE");
    else printf("NOT ELIGIBLE");

}