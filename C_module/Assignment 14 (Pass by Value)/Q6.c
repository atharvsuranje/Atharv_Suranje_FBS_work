#include <stdio.h>

struct Date
{
    int day,month,year;
};

struct Date storeData(){
    struct Date temp;
    printf("Enter day,month,year : ");
    scanf("%d %d %d",&temp.day,&temp.month,&temp.year);
    return temp;
}

struct Date displayData(struct Date temp){
    printf(" Date : %d/%d/%d \n",temp.day,temp.month,temp.year);
}


void main() {
    struct Date d1,d2;
    d1=storeData();
    d2=storeData();
    displayData(d1);
    displayData(d2);
}