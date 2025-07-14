#include <stdio.h>

void isEligible();
void main() {
    isEligible();
}
void isEligible(){
    int age;
    printf("Enter the age :: ");
    scanf("%d",&age);
    if(age>=18) printf("ELIGIBLE");
    else printf("NOT ELIGIBLE");
}