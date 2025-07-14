#include <stdio.h>

int sum();
void main() {
    printf("Sum = %d\n", sum());
}

int sum(){
    int n = 12345, last = n % 10, first;

    for(n;n>=10;n/=10);
  // while (n >= 10) n /= 10;
    first = n;
    return first + last;
}