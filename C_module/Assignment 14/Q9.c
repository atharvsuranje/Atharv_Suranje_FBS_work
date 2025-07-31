#include <stdio.h>

struct Complex
{
    int real,imaginary;
};

void main() {
    struct Complex c1,c2;
    c1.real=5,c1.imaginary=30;
    printf("Enter c2 : ");
    scanf("%d %d",&c2.real,&c2.imaginary);
    printf("Complex 1 is : %d+%di",c1.real,c1.imaginary);
    printf("\nComplex 2 is : %d+%di",c2.real,c2.imaginary);
}