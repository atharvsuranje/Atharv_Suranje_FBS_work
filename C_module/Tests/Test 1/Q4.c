#include <stdio.h>

void main() {
    int hr1,min1,sec1,hr2,min2,sec2;
    printf("Enter first time :: ");
    scanf("%d %d %d",&hr1,&min1,&sec1);
    printf("Enter second time :: ");
    scanf("%d %d %d",&hr2,&min2,&sec2);

    int totalTime1=(hr1*3600) + (min1*60) + (sec1);
    int totalTime2=(hr2*3600) + (min2*60) + (sec2);
    int hrdiff,mindiff,secdif;
    
    if(totalTime1>totalTime2) {
        printf("Time 1 is Greater");
        int diff=totalTime1-totalTime2;
        hrdiff=diff/3600;
        mindiff=(diff%3600)/60;
        secdif=diff%60;
        print("Greater by :: %d %d %d",hrdiff,mindiff,secdif);

    }
    else if(totalTime1<totalTime2) {
        printf("Time 2 is Greater");
        int diff=totalTime2-totalTime1;
        hrdiff=diff/3600;
        mindiff=(diff%3600)/60;
        secdif=diff%60;
        print("Greater by :: %d %d %d",hrdiff,mindiff,secdif);
    }
    else printf("Same");


}
