#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Movie{
    char name[100],director[100],genre[50];
    int year;
}Movie;

Movie* addMovie(Movie* movieArr,int* n){
    movieArr=realloc(movieArr,(*n+1)*sizeof(Movie));
    printf("Enter name: ");
    fflush(stdin);
    gets(movieArr[*n].name);
    printf("Enter Director: ");
    fflush(stdin);
    gets(movieArr[*n].director);
    printf("Enter Release Year: ");
    fflush(stdin);
    scanf("%d",&movieArr[*n].year);
    printf("Enter Genre: ");
    fflush(stdin);
    gets(movieArr[*n].genre);
    (*n)++;
    printf("Movie Added.");
    return movieArr;
}

void search(Movie* movieArr,int n){
    char target[100];
    int found=0;
    printf("Enter name to search: ");
    fflush(stdin);
    gets(target);
    for(int i=0;i<n;i++){
        if(strcmp(movieArr[i].name,target) == 0){
            printf("\nName: %s\nDirector: %s\nYear: %d\nGenre: %s\n",movieArr[i].name, movieArr[i].director, movieArr[i].year, movieArr[i].genre);
            found=1;
            break;
        }
    } 
    if(found!=1){
        printf("Movie not found!\n");
    }  
}

void update(Movie* movieArr,int n){
    char target[100];
    int found=0;
    fflush(stdin);
    printf("Enter title to update: ");
    gets(target);
    for(int i=0;i<n;i++){
        if(strcmp(target,movieArr[i].name) == 0){
            fflush(stdin);
            printf("Enter new Director: ");
            gets(movieArr[i].director);
            fflush(stdin);
            printf("Enter new Release Year: ");
            scanf("%d", &movieArr[i].year);
            getchar();
            fflush(stdin);
            printf("Enter new Genre: ");
            gets(movieArr[i].genre);
            printf("Movie updated successfully!\n");
            found = 1;
            break;
        }
    }
}

void display(Movie* movieArr,int n){
    printf("\n----Movie List----\n");
    for(int i=0;i<n;i++){
        printf("\nMovie %d:\n", i + 1);
        printf("Title       : %s\n", movieArr[i].name);
        printf("Director    : %s\n", movieArr[i].director);
        printf("Release Year: %d\n", movieArr[i].year);
        printf("Genre       : %s\n", movieArr[i].genre);
    }
    printf("-------------------\n");
}

void main(){
    int n;
    printf("Enter no of Movie : ");
    scanf("%d",&n);
    Movie* movieArr = (Movie*) malloc(n*sizeof(Movie));
    int choice;
    for(int i=0;i<n;i++){
        printf("Enter details of Movie %d :\n",i+1);
        printf("Enter name: ");
        fflush(stdin);
        gets(movieArr[i].name);
        printf("Enter Director: ");
        fflush(stdin);
        gets(movieArr[i].director);
        printf("Enter Release Year: ");
        fflush(stdin);
        scanf("%d",&movieArr[i].year);
        printf("Enter Genre: ");
        fflush(stdin);
        gets(movieArr[i].genre);
    }
    while(1){
        printf("\n===== Movie Database Menu =====\n");
        printf("1. Add Movie\n");
        printf("2. Search Movie by name\n");
        printf("3. Update Movie by name\n");
        printf("4. Display Movies\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if(choice == 1){
            movieArr= addMovie(movieArr,&n);
        }
        else if(choice == 2){
            search(movieArr,n);
        }
        else if(choice == 3){
            update(movieArr,n);
        }
        else if(choice == 4){
            display(movieArr,n);
        }
        else if(choice == 0){
            break;
        }
        else{
            printf("Invalid choice!\n");
        }
    }
}