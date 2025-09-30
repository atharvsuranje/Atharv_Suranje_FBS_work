#include <stdio.h>

int search(char*,char);
void main() {
    char str[20],target;
    printf("Enter string : ");
    scanf("%s",str);
    printf("Enter target character : ");
    scanf(" %c",&target);
    int result =search(str,target);
    if( result>=0) printf("Character found at %d",result);
    else printf("Character NOT found");
    
}
int search(char* str,char target){
    int i=0;
    while (str[i] != '\0'){
        if(str[i] == target) {
            return i;
            break;
        }
        i++;
    }
    return -1;
}
