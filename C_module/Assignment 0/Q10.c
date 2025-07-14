#include <stdio.h>
void main(){
    int m1,m2,m3,m4,m5;
    printf("Enter 5 subject marks out of 100 :: ");
    scanf("%d %d %d %d %d",&m1,&m2,&m3,&m4,&m5);
    int total=m1+m2+m3+m4+m5;
    float percentage=total/5;
    printf("Total marks are %d percentage are %.2f",total,percentage);
}