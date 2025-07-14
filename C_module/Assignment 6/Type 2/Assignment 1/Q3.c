#include <stdio.h>

int isLeap();
void main() {
    if(isLeap()) printf("Year is LEAP");
    else printf("Year is not LEAP");
}

int isLeap(){
    int year;
    printf("Enter the year :: ");
    scanf("%d",&year);
    if((year%4)==0) return 1;
    else return 0;
}