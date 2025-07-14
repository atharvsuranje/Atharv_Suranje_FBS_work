#include <stdio.h>

int sum(int,int);
int subtract(int,int);
int multiply(int,int);
int divide(int,int);
int mod(int,int);

void main() {
    char ch;
    int num1,num2;
    printf("Enter the numbers :: ");
    scanf("%d %d",&num1,&num2);
    printf("Enter the operator :: ");
    scanf(" %c",&ch);
    if(ch=='+') printf("Result is :: %d",sum(num1,num2));
    else if (ch=='-') printf("Result is :: %d",subtract(num1,num2));
    else if (ch=='*') printf("Result is :: %d",multiply(num1,num2));
    else if (ch=='/') printf("Result is :: %d",divide(num1,num2));
    else if (ch=='%') printf("Result is :: %d",mod(num1,num2));
}

int sum(int num1,int num2){
    int res=num1+num2;
    return res;
}
int subtract(int num1,int num2){
    int res=num1-num2;
    return res;
}
int multiply(int num1,int num2){
    int res=num1*num2;
    return res;
}
int divide(int num1,int num2){
    int res=num1/num2;
    return res;
}
int mod(int num1,int num2){
    int res=num1%num2;
    return res;
}