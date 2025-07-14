#include <stdio.h>

void main() {
    int num1,num2,res;
    char ch;
    printf("Enter the numbers followed by operator :: ");
    scanf("%d %d %c",&num1,&num2,&ch);
    if(ch=='+') res=num1+num2;
    else if (ch=='-') res =num1-num2;
    else if (ch=='*') res =num1*num2;
    else if (ch=='/') res =num1/num2;
    else if (ch=='%') res =num1%num2;
    printf("Result is :: %d",res);
}