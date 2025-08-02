#include <stdio.h>
// name, no. of matches played, runs, wickets takes.
typedef struct Player{
    char name[30];
    int matches,runs,wickets;
}Player;

void storeData(Player* playerArr,int n){
    for(int i=0;i<n;i++){
        fflush(stdin);
        printf("Enter Name of Player %d : ",i+1);
        gets(playerArr[i].name);
        printf("Enter No. of matches of Player %d : ",i+1);
        scanf("%d",&playerArr[i].matches);
        printf("Enter Runs of Player %d : ",i+1);
        scanf("%d",&playerArr[i].runs);
        printf("Enter Wickets of Player %d : ",i+1);
        scanf("%d",&playerArr[i].wickets);
    }
}

void displayData(Player* playerArr,int n){
    printf("Player Details are as : \n");
    for(int i=0;i<n;i++){
        printf("Name : %s\nNo. of matches : %d\nRuns : %d\nWickets : %d",playerArr[i].name,playerArr[i].matches,playerArr[i].runs,playerArr[i].wickets);
    }
}

void maxRun(Player* playerArr,int n){
    int idx=0,maxi=playerArr[0].runs;
    for(int i=0;i<n;i++){
        if(playerArr[i].runs > maxi){
            maxi=playerArr[i].runs;
            idx=i;
        }
    }
    printf("\nPlayer with Maximum run : \n");
    printf("Name : %s\nNo. of matches : %d\nRuns : %d\nWickets : %d",playerArr[idx].name,playerArr[idx].matches,playerArr[idx].runs,playerArr[idx].wickets);
}

void maxWicket(Player* playerArr,int n){
    int idx=0,maxi=playerArr[0].wickets;
    for(int i=0;i<n;i++){
        if(playerArr[i].wickets > maxi){
            maxi=playerArr[i].wickets;
            idx=i;
        }
    }
    printf("\nPlayer with Maximum wicket : \n");
    printf("Name : %s\nNo. of matches : %d\nRuns : %d\nWickets : %d",playerArr[idx].name,playerArr[idx].matches,playerArr[idx].runs,playerArr[idx].wickets);
}

void main() {
    int n=3;
    Player playerArr[n];
    storeData(playerArr,n);
    displayData(playerArr,n);
    maxRun(playerArr,n);
    maxWicket(playerArr,n);
}