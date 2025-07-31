#include <stdio.h>
#include <string.h>

char* reverse(char*);
void main() {
    char str[20];
    printf("Enter a String : ");
    gets(str);
    printf("Reversed String : %s",reverse(str));
}


char* reverse(char* str){
    int n=strlen(str);
    int i=0;
    while (i<n/2)
    {
        char temp=str[i];
        str[i]=str[n-i-1];
        str[n-i-1]=temp;
        i++;
    }
    return str; 
}