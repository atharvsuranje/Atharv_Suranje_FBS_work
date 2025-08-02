#include <stdio.h>

typedef struct Time{
    int hrs,min,sec;
}Time;

void displayData(Time*,int);
void storeData(Time*,int);
int convertToSec(Time);
void addTime(Time,Time);
void main() {
    int n=3;
    Time timeArr[n];
    storeData(timeArr,n);
    displayData(timeArr,n);
    addTime(timeArr[0],timeArr[1]);
}

void storeData(Time* timeArr,int size){
    for(int i=0;i<size;i++){
        printf("Enter Hours Time %d : ",i+1);
        scanf("%d",&timeArr[i].hrs);
        printf("Enter Minutes Time %d : ",i+1);
        scanf("%d",&timeArr[i].min);
        printf("Enter Seconds Time %d : ",i+1);
        scanf("%d",&timeArr[i].sec);
    }
}

void displayData(Time* timeArr,int size){
    for(int i=0;i<size;i++){
        printf("Time %d is : %d:%d:%d\n",i+1,timeArr[i].hrs,timeArr[i].min,timeArr[i].sec);
    }
}

int convertToSec(Time t1){
    return ((t1.hrs)*3600) + ((t1.min)*60) + (t1.sec);
}

void addTime(Time t1,Time t2){
    Time res;
    int t1sec=convertToSec(t1);
    int t2sec=convertToSec(t2);
    int ressec=t1sec+t2sec;
    res.hrs=ressec/3600;
    res.min=(ressec%3600)/60;
    res.sec=ressec%60;
    printf("Added time is %d:%d:%d",res.hrs,res.min,res.sec);
}