#include <stdio.h>
void main(){
    int n1,n2,n3,n4,n5;
    printf("Enter 5 numbers ");
    scanf("%d %d %d %d %d",&n1,&n2,&n3,&n4,&n5);
    int average=(n1+n2+n3+n4+n5)/5;
    printf("average is %d",average);
}