#include <stdio.h>

void sum(int*);
void main() {
    int i=1;
    sum(&i);
}

void sum(int* i){
    int sum=0;
    for (*i; *i <= 5; (*i)++)
    {
        sum=*i+sum;
    }
    printf("SUM is %d",sum);
    // int j=1;
    // while(j<=5){
    //     sum=j+sum;
    //     j++;
    // }
    // return sum;

}