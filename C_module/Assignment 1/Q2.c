#include <stdio.h>
void main(){
    int num;
    printf("Enter the num :: ");
    scanf("%d",&num);
    int last,first;
    last=num%10;
    num=num/100;
    first=num%10;
    if(first==last) printf("Num is palindrome");
    else printf("Num is not palindrome");

}