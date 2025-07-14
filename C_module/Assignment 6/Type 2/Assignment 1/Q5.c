#include <stdio.h>

int isEligible();
void main() {
    if(isEligible()) printf("ELIGIBLE");
    else printf("NOT ELIGIBLE");
}

int isEligible(){
    int age;
    printf("Enter the age :: ");
    scanf("%d",&age);
    if(age>=18) return 1;
    else return 0;

}