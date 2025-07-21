#include <stdio.h>

float calculate(int,int);
void main() {
    int cost,discount;
    printf("Enter Cost Price :: ");
    scanf("%d",&cost);
    printf("Enter Discount (in percent) :: ");
    scanf("%d",&discount);
    printf("Selling Price is :: %.2f",calculate(cost,discount));
}

float calculate(int cost,int discount){
    float res = cost - ((cost*discount)/100);
    return res;
}