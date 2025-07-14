#include <stdio.h>

int isLeap(int);
void main() {
    int year;
    printf("Enter the year :: ");
    scanf("%d",&year);
    int flag=isLeap(year);
    if(flag) printf("Year is LEAP");
    else printf("Year is not LEAP");
}

int isLeap(int year){
    if((year%4)==0) return 1;
    else return 0;
}