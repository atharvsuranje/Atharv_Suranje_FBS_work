#include <stdio.h>

int sum();
int subtract();
int multiply();
int divide();
int mod();

void main() {
    char ch;
    printf("Enter the operator :: ");
    scanf("%c",&ch);
    if(ch=='+') printf("Result is %d",sum());
    else if (ch=='-') printf("Result is %d",subtract());
    else if (ch=='*') printf("Result is %d",multiply());
    else if (ch=='/') printf("Result is %d",divide());
    else if (ch=='%') printf("Result is %d",mod());;
}

int sum(){
    int num1,num2,res;
    printf("Enter the numbers :: ");
    scanf("%d %d",&num1,&num2);
    return res=num1+num2;
}
int subtract(){
    int num1,num2,res;
    printf("Enter the numbers :: ");
    scanf("%d %d",&num1,&num2);
    return res=num1-num2;
}
int multiply(){
    int num1,num2,res;
    printf("Enter the numbers :: ");
    scanf("%d %d",&num1,&num2);
    return res=num1*num2;
}
int divide(){
    int num1,num2,res;
    printf("Enter the numbers :: ");
    scanf("%d %d",&num1,&num2);
    return res=num1/num2;
}
int mod(){
    int num1,num2,res;
    printf("Enter the numbers :: ");
    scanf("%d %d",&num1,&num2);
    return res=num1%num2;
}