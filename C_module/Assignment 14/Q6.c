#include <stdio.h>

struct Date
{
    int day,month,year;
};

void main() {
    struct Date d1,d2;
    d1.day=26,d1.month=4,d1.year=2003;
    printf("Enter d2 : ");
    scanf("%d %d %d",&d2.day,&d2.month,&d2.year);
    printf("Date 1 is : %d-%d-%d",d1.day,d1.month,d1.year);
    printf("\nDate 2 is : %d-%d-%d",d2.day,d2.month,d2.year);
}