#include <stdio.h>

struct Complex
{
    int real,imaginary;
};

struct Complex storeData(){
    struct Complex temp;
    printf("Enter real,imaginary : ");
    scanf("%d %d",&temp.real,&temp.imaginary);
    return temp;
}

struct Complex displayData(struct Complex temp){
    printf(" Complex : %d+%di \n",temp.real,temp.imaginary);
}


void main() {
    struct Complex c1,c2;
    c1=storeData();
    c2=storeData();
    displayData(c1);
    displayData(c2);
}