#include <stdio.h>

void sum(int*,int*);
void subtract(int*,int*);
void multiply(int*,int*);
void divide(int*,int*);
void mod(int*,int*);

void main() {
    char ch;
    int num1,num2;
    printf("Enter the numbers :: ");
    scanf("%d %d",&num1,&num2);
    printf("Enter the operator :: ");
    scanf(" %c",&ch);
    if(ch=='+') sum(&num1,&num2);
    else if (ch=='-') subtract(&num1,&num2);
    else if (ch=='*') multiply(&num1,&num2);
    else if (ch=='/') divide(&num1,&num2);
    else if (ch=='%') mod(&num1,&num2);
}

void sum(int* num1,int* num2){
    int res= *num1+ *num2;
    printf("Result is :: %d",res);
}
void subtract(int* num1,int* num2){
    int res= *num1- *num2;
    printf("Result is :: %d",res);
}
void multiply(int* num1,int* num2){
    int res= *num1* *num2;
    printf("Result is :: %d",res);
}
void divide(int* num1,int* num2){
    int res= *num1/ *num2;
    printf("Result is :: %d",res);
}
void mod(int* num1,int* num2){
    int res= *num1% *num2;
    printf("Result is :: %d",res);
}