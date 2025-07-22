#include <stdio.h>
#include <string.h>

void main() {
    char str1[] = "Hello World";
    char str2[] = "oxy";
    int len = strcspn(str1,str2); //stops at 1st occurances of any char form str2 in str1 
    printf("Position of : %d\n", len);
}
