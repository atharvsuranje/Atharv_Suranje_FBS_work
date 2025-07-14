#include <stdio.h>

void isLeap();
void main() {
    isLeap();
}
void isLeap(){
    int year;
    printf("Enter the year :: ");
    scanf("%d",&year);
    if((year%4)==0) printf("Year is LEAP");
    else printf("Year is not LEAP");
}