#include <stdio.h>

void divisibility(int);
void main() {
    int num;
    printf("Enter the num :: ");
    scanf("%d", &num);
    divisibility(num);
}
void divisibility(int num){
    if(num%3==0 && num%5 ==0) printf("Divisible by both");
    else if(num%3==0 && num%5 !=0) printf("Divisible by 3 but not by 5");
    else if(num%3!=0 && num%5 ==0) printf("Divisible by 5 but not by 3");
    else printf("Divisible by None");
}