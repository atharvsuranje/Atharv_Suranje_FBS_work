#include <stdio.h>

int isStrong();
void main() {
    if(isStrong()) printf("Strong\n");
    else printf("Not Strong\n");
}

int isStrong(){
    int n = 145, temp = n, sum = 0;
    
    for(n;n>0;n/=10) {
        int digit = n % 10, fact = 1;
        for (int i = 1; i <= digit; i++)
            fact *= i;
        sum += fact;
    }
    
    if (sum == temp) return 1;
    else return 0;

}