#include <stdio.h>

int isEligible(int);
void main() {
    int age;
    printf("Enter the age :: ");
    scanf("%d",&age);
    int flag=isEligible(age);
    if(flag) printf("ELIGIBLE");
    else printf("NOT ELIGIBLE");
}

int isEligible(int age){
    if(age>=18) return 1;
    else return 0;
}