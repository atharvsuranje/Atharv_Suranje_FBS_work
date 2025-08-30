#include <stdio.h>

struct Distance
{
    int feet,inch;
};

struct Distance storeData(){
    struct Distance temp;
    printf("Enter feet,inch : ");
    scanf("%d %d",&temp.feet,&temp.inch);
    return temp;
}

struct Distance displayData(struct Distance temp){
    printf(" Distance : %d-%d \n",temp.feet,temp.inch);
}


void main() {
    struct Distance d1,d2;
    d1=storeData();
    d2=storeData();
    displayData(d1);
    displayData(d2);
}