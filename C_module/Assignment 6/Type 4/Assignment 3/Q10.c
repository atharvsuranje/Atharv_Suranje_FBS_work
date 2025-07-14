#include <stdio.h>

int sum(int);
void main() {
    int n = 12345;
    printf("Sum = %d\n", sum(n));
}

int sum(int n){
    int last = n % 10, first;

    for(n;n>=10;n/=10);
  // while (n >= 10) n /= 10;
    first = n;
    return first+last;
}