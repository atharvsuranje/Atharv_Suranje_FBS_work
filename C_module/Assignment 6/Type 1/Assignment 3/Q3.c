#include <stdio.h>

void seriesSum();
void main() {
    seriesSum();
}
void seriesSum(){
    int sum=0;
    for (int i = 1; i <= 5; i++)
    {
        sum=i+sum;
    }
    printf("%d",sum);
    // int j=1;
    // while(j<=5){
        //     sum=j+sum;
        //     j++;
        // }
    // printf("%d",sum);

    }