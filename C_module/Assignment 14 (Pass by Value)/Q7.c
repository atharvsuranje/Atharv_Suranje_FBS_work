#include <stdio.h>

struct Time
{
    int hour,minute,second;
};

struct Time storeData(){
    struct Time temp;
    printf("Enter hour,minute,second : ");
    scanf("%d %d %d",&temp.hour,&temp.minute,&temp.second);
    return temp;
}

struct Time displayData(struct Time temp){
    printf(" Time : %d:%d:%d \n",temp.hour,temp.minute,temp.second);
}


void main() {
    struct Time d1,d2;
    d1=storeData();
    d2=storeData();
    displayData(d1);
    displayData(d2);
}