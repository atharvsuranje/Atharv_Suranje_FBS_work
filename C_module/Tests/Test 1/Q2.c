#include <stdio.h>

void main() {
    int year;
    printf("Enter year :: ");
    scanf("%d",&year);
    if(year%4) printf("NON-LEAP");
    else printf("LEAP");
}