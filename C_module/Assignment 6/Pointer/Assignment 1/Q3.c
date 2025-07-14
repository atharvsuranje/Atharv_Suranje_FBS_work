#include <stdio.h>

void isLeap(int*);
void main() {
    int year;
    printf("Enter the year :: ");
    scanf("%d",&year);
    isLeap(&year);
}

void isLeap(int* year){
    if((*year%4)==0) printf("Year is LEAP");
    else printf("Year is not LEAP");
}