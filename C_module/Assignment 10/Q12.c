#include <stdio.h>
#include <string.h>

void main() {
    char str1[] = "axabbbccde123";
    char str2[] = "abcd";
    int len = strspn(str1, str2); //checks from 1st char of str1 and returns length where the mismatch begins 
    printf("Span length: %d\n", len);
}
