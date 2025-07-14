#include <stdio.h>

int sum(int);
void main() {
    int i=1;
    printf("SUM is %d",sum(i));
}

int sum(int i){
    int sum=0;
    for (i; i <= 5; i++)
    {
        sum=i+sum;
    }
    return sum;
    // int j=1;
    // while(j<=5){
    //     sum=j+sum;
    //     j++;
    // }
    // return sum;

}