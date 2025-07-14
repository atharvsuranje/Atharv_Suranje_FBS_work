#include <stdio.h>

void largest(int,int,int);
void main() {
    int a, b, c;
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);
    largest(a,b,c);
}
void largest(int a,int b,int c){
    
    if (a > b){
        if (a > c) printf("first is the largest");
        else printf("Third is the largest");
    }
    else{
        if (b > c) printf("Second is the largest");
        else printf("Third is the largest");
    }

}
