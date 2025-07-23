#include <stdio.h>

int search(char*,char);
void main() {
    char str[20],target;
    printf("Enter string : ");
    scanf("%s",str);
    printf("Enter target character : ");
    scanf(" %c",&target);
    if(search(str,target) == 1 ) printf("Character found.");
    else printf("Character NOT found");
    
}
int search(char* str,char target){
    int i=0,flag=0;
    while (str[i] != '\0'){
        if(str[i] == target) {
            flag=1;
            break;
        }
        i++;
    }
    return flag;
}
