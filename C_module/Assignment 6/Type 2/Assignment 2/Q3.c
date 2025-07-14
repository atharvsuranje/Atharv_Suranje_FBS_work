#include <stdio.h>

int largest();
void main() {
    int flag=largest();
    if(flag==1) printf("first is the largest");
    else if(flag==2) printf("Second is the largest");
    else printf("Third is the largest");
    
}
int largest(){
    int a, b, c;
    
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);
    
    if (a > b){
        if (a > c) return 1;
        else return 3;
    }
    else{
        if (b > c) return 2;
        else return 3;
    }

}
