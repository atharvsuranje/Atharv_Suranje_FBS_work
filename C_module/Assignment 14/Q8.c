#include <stdio.h>

struct Distance
{
    int feet,inch;
};

void main() {
    struct Distance d1,d2;
    d1.feet=5,d1.inch=30;
    printf("Enter d2 : ");
    scanf("%d %d",&d2.feet,&d2.inch);
    printf("Distance 1 is : %d-%d",d1.feet,d1.inch);
    printf("\nDistance 2 is : %d-%d",d2.feet,d2.inch);
}