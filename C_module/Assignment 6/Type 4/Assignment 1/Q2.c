#include <stdio.h>

int isPalindrome(int);
void main(){
    int num;
    printf("Enter the num :: ");
    scanf("%d",&num);
    int flag=isPalindrome(num);
    if(flag) printf("Num is palindrome");
    else printf("Num is not palindrome");
}

int isPalindrome(int num){
    int last,first;
    last=num%10;
    num=num/100;
    first=num%10;
    if(first==last) return 1;
    else return 0;
}