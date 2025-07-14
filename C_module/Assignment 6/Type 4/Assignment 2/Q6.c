#include <stdio.h>

int divisibility(int);
void main() {
    int num;
    printf("Enter the num :: ");
    scanf("%d", &num);
    int flag=divisibility(num);
    if(flag==1) printf("Divisible by both");
    else if(flag==3) printf("Divisible by 3 but not by 5");
    else if(flag==5) printf("Divisible by 5 but not by 3");
    else printf("Divisible by None");
}
int divisibility(int num){
    if(num%3==0 && num%5 ==0) return 1;
    else if(num%3==0 && num%5 !=0) return 3;
    else if(num%3!=0 && num%5 ==0) return 5;
    else return 0;
}