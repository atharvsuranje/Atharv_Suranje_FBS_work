#include <stdio.h>

int sum();
void main() {
    printf("SUM is %d",sum());
}

int sum(){
    int sum=0;
    for (int i = 1; i <= 5; i++)
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