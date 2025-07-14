#include <stdio.h>

void isStrong();
void main() {
    isStrong();
}
void isStrong(){
    int n = 145, temp = n, sum = 0;
    
    for(n;n>0;n/=10) {
        int digit = n % 10, fact = 1;
        for (int i = 1; i <= digit; i++)
            fact *= i;
        sum += fact;
    }
    
    if (sum == temp)
        printf("Strong\n");
    else
        printf("Not Strong\n");
    
}