#include <stdio.h>

struct Time
{
    int hour,minute,second;
};

void main() {
    struct Time t1,t2;
    t1.hour=5,t1.minute=30,t1.second=25;
    printf("Enter t2 : ");
    scanf("%d %d %d",&t2.hour,&t2.minute,&t2.second);
    printf("Time 1 is : %d-%d-%d",t1.hour,t1.minute,t1.second);
    printf("\nTime 2 is : %d-%d-%d",t2.hour,t2.minute,t2.second);
}