#include <stdio.h>

typedef struct Book{
    char bname[30],author[30];
    int id,price;
}Book;

void displayData(Book*,int);
void storeData(Book*,int);
void main() {
    int n=3;
    Book bookArr[n];
    storeData(bookArr,n);
    displayData(bookArr,n);
}

void storeData(Book* bookArr,int size){
    for(int i=0;i<size;i++){
        fflush(stdin);
        printf("Enter Name of Book %d : ",i+1);
        gets(bookArr[i].bname);
        printf("Enter Id of Book %d : ",i+1);
        scanf("%d",&bookArr[i].id);
        fflush(stdin);
        printf("Enter Author of Book %d : ",i+1);
        gets(bookArr[i].author);
        printf("Enter Price of Book %d : ",i+1);
        scanf("%d",&bookArr[i].price);
    }
}

void displayData(Book* bookArr,int size){
    for(int i=0;i<size;i++){
        printf("Details of Book %d : ",i+1);
        printf("Name: %s Id: %d Author: %s Price: %d\n",bookArr[i].bname,bookArr[i].id,bookArr[i].author,bookArr[i].price);
    }
}