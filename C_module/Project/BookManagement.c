#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
// Book ID, Book Name, Author Name, Category,Price, and Rating.
typedef struct Book
{
    int id;
    char bookName[50],authorName[50],category[50];
    float price,rating;
}Book;

int isBookIdUnique(Book* bookArr,int n,int id){
    for(int i=0;i<n;i++) {
        if(bookArr[i].id==id){
            return 0; // Not unique
        }
    }
    return 1; // Unique
}

void toLower(char* dest,char* src){
    while(*src){
        *dest = tolower(*src);
        src++;
        dest++;
    }
    *dest='\0';
}

Book* addBook(Book* bookArr,int* n){
    bookArr=realloc(bookArr,(*n+1)*sizeof(Book));
    if(bookArr==NULL){
        printf("Memory Allocation Failed.\n");
        return NULL;
    }
    int id;
    printf("Enter Book Details : ");
    do{
        printf("Enter Unique Book ID : ");
        scanf("%d",&id);
        if(isBookIdUnique(bookArr,*n,id) != 1){
            printf("Book ID already exists! Please enter a different ID.\n");
        }
    } while(isBookIdUnique(bookArr,*n,id) != 1);
    bookArr[*n].id=id;

    printf("Enter Book Name : ");
    fflush(stdin);
    gets(bookArr[*n].bookName);

    printf("Enter Author Name : ");
    fflush(stdin);
    gets(bookArr[*n].authorName);

    printf("Enter Category : ");
    fflush(stdin);
    gets(bookArr[*n].category);

    do{
        printf("Enter Price : ");
        scanf("%f",&bookArr[*n].price);
        if(bookArr[*n].price <=0){
            printf("Please enter a valid price.\n");
        }
    }while(bookArr[*n].price <=0);

    do{
        printf("Enter Rating : ");
        scanf("%f",&bookArr[*n].rating);
        if(bookArr[*n].rating <=0 || bookArr[*n].rating>5){
            printf("Please enter a valid Rating.\n");
        }
    }while(bookArr[*n].rating <=0 || bookArr[*n].rating>5);
    (*n)++;
    printf("Book Added.");
    return bookArr;
}

void displayBook(Book* bookArr,int n){
    if (n == 0) {
        printf("No books to display.\n");
        return;
    }
    printf("\n%-5s %-25s %-25s %-20s %-10s %-6s\n","ID", "Book Name", "Author", "Category", "Price", "Rating");
    printf("---------------------------------------------------------------------------------------------------\n");
    for (int i = 0; i < n; i++) {
        printf("%-5d %-25s %-25s %-20s %-10.2f %-6.1f\n",
            bookArr[i].id,
            bookArr[i].bookName,
            bookArr[i].authorName,
            bookArr[i].category,
            bookArr[i].price,
            bookArr[i].rating);
    }
}

Book* removeBook(Book* bookArr,int* n){
    int id,found=0;
    printf("Enter ID of the Book to be removed : ");
    scanf("%d",&id);
    for(int i=0;i<*n;i++){
        if(bookArr[i].id == id){
            found=1;
            for(int j=i;j<*n-1;j++){
                bookArr[j]=bookArr[j+1];
            }
            (*n)--;
            bookArr = realloc(bookArr,(*n)*sizeof(Book));
            printf("Book removed successfully.\n");
            break;
        }
    }
    if(found==0){
        printf("Book with ID: %d Not Found.",id);
    }
    return bookArr;
}

int searchId(Book* bookArr,int n){
    int id;
    printf("Enter ID of the Book : ");
    scanf("%d",&id);
    for(int i=0;i<n;i++){
        if(bookArr[i].id == id){
            return i;
        }
    }
    return -1;
}

Book* search(Book* bookArr,int n,int* j,int flag){ //1 for name,2 for suthor,3 for category
    Book* res = (Book*) malloc(n*sizeof(Book));
    char target[50],loweredTarget[50],loweredField[50];
    if(flag==1){
        printf("Enter Name of the Book to be searched : ");
        fflush(stdin);
        gets(target);
        toLower(loweredTarget,target);
        for(int i=0;i<n;i++){
            // int cmp=strcmp(name,bookArr[i].bookName);
            toLower(loweredField,bookArr[i].bookName);
            char* cmp=strstr(loweredField, loweredTarget);  //for partial searching
            if(cmp!=NULL){
                res[*j]=bookArr[i];
                (*j)++;
            }
        }
    }
    else if(flag==2){
        printf("Enter Name of the Author to be searched : ");
        fflush(stdin);
        gets(target);
        toLower(loweredTarget,target);
        for(int i=0;i<n;i++){
            // int cmp=strcmp(name,bookArr[i].authorName);
            toLower(loweredField,bookArr[i].authorName);
            char* cmp=strstr(loweredField, loweredTarget); //for partial searching
            if(cmp!=NULL){
                res[*j]=bookArr[i];
                (*j)++;
            }
        }
    }
    else if (flag==3){
        printf("Enter Name of the Category to be searched : ");
        fflush(stdin);
        gets(target);
        toLower(loweredTarget,target);
        for(int i=0;i<n;i++){
            // int cmp=strcmp(name,bookArr[i].category);
            toLower(loweredField,bookArr[i].category);
            char* cmp=strstr(loweredField, loweredTarget); //for partial searching
            if(cmp!=NULL){
                res[*j]=bookArr[i];
                (*j)++;
            }
        }
    }
    res = realloc(res,((*j)+1)*sizeof(Book));
    return res;
}

void update(Book* bookArr,int n){
    int idx=searchId(bookArr,n);
    if(idx==-1){
        printf("No Book with ID found.");
    }
    else{
        do{
        printf("Enter Updated Price : ");
        scanf("%f",&bookArr[idx].price);
        if(bookArr[idx].price <=0){
            printf("Please enter a valid price.\n");
        }
        } while(bookArr[idx].price <=0);
        do{
        printf("Enter Rating : ");
        scanf("%f",&bookArr[idx].rating);
        if(bookArr[idx].rating <=0 || bookArr[idx].rating>5){
            printf("Please enter a valid Rating.\n");
        }
    }while(bookArr[idx].rating <=0 || bookArr[idx].rating>5);
        printf("Information Updated.");
    }
}

Book* sort(Book* bookArr,int n,int type){ //1 for price and 2 for rating
    if (n == 0){
        printf("No books to sort.\n");
        return NULL;
    }
    int order;
    printf("Sorting Order:\n1. Increasing\n2. Decreasing\nEnter choice: ");
    scanf("%d",&order);
    Book* temp= (Book*) malloc(n*sizeof(Book));
    for(int i=0;i<n;i++)
        temp[i]=bookArr[i];
    
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            int cond=0;
            if(type==1){
                cond= (order==1) ? (temp[j].price>temp[j+1].price)
                                 : (temp[j].price<temp[j+1].price);
            }
            else if(type==2){
                cond = (order==1) ? (temp[j].rating>temp[j+1].rating)
                                  : (temp[j].rating<temp[j+1].rating);
            }
            if(cond==1){
                Book t = temp[j];
                temp[j]=temp[j+1];
                temp[j+1]=t;
            }
        }
    }
    return temp;
}

void main() {
    int n=5, choice;
    Book* bookArr = (Book*) malloc(n*sizeof(Book));
    if (bookArr == NULL) {
        printf("Memory allocation failed.\n");
        return;
    }
    bookArr[0].id=101;
    strcpy(bookArr[0].bookName,"ORV");
    strcpy(bookArr[0].authorName,"Sing Shong");
    strcpy(bookArr[0].category,"Fantasy");
    bookArr[0].price=499;
    bookArr[0].rating=4.9;

    bookArr[1].id = 102;
    strcpy(bookArr[1].bookName, "Naruto");
    strcpy(bookArr[1].authorName, "Masashi Kishimoto");
    strcpy(bookArr[1].category, "Action");
    bookArr[1].price = 399.0;
    bookArr[1].rating = 4.8;

    bookArr[2].id = 103;
    strcpy(bookArr[2].bookName, "Dragon Ball");
    strcpy(bookArr[2].authorName, "Akira Toriyama");
    strcpy(bookArr[2].category, "Adventure");
    bookArr[2].price = 450.0;
    bookArr[2].rating = 4.7;

    bookArr[3].id = 104;
    strcpy(bookArr[3].bookName, "One Piece");
    strcpy(bookArr[3].authorName, "Eiichiro Oda");
    strcpy(bookArr[3].category, "Adventure");
    bookArr[3].price = 550.0;
    bookArr[3].rating = 4.95;

    bookArr[4].id = 105;
    strcpy(bookArr[4].bookName, "Bleach");
    strcpy(bookArr[4].authorName, "Tite Kubo");
    strcpy(bookArr[4].category, "Supernatural");
    bookArr[4].price = 420.0;
    bookArr[4].rating = 4.6;
    
    while(1){
        printf("\n\n====== Book Management System ======\n");
        printf("1. Display All Books\n");
        printf("2. Add Book\n");
        printf("3. Remove Book by ID\n");
        printf("4. Search Book by ID\n");
        printf("5. Search Book by Name\n");
        printf("6. Show All Books by an Author\n");
        printf("7. Show All Books of a Category\n");
        printf("8. Update Book (Price and Rating)\n");
        printf("9. Display Top 3 Books by Price\n");
        printf("10. Display Top 3 Books by Rating\n");
        printf("11. Display All Books Sorted by Price\n");
        printf("12. Display All Books Sorted by Rating\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d",&choice);

        if(choice == 0){
            printf("Exiting...\n");
            break;
        }
        else if (choice==1){
            displayBook(bookArr,n);
        }
        else if(choice == 2){
            bookArr=addBook(bookArr,&n);
        }
        else if(choice == 3){
            bookArr=removeBook(bookArr,&n);
        }
        else if(choice == 4){
            int idx=searchId(bookArr,n);
            if(idx==-1) printf("Book Not Found.");
            else displayBook(&bookArr[idx],1);
        }
        else if(choice == 5){
            int j=0;
            Book* res=search(bookArr,n,&j,1);
            if(j==0){
                printf("Book Not Found.");
            }
            else{
                displayBook(res,j);
            }
            free(res);
        }
        else if(choice == 6){
            int j=0;
            Book* res=search(bookArr,n,&j,2);
            if(j==0)
                printf("Author Not Found.");
            else{
                printf("All books of the Author are : \n");
                displayBook(res,j);
            }
            free(res);
        }
        else if(choice == 7){
            int j=0;
            Book* res=search(bookArr,n,&j,3);
            if(j==0)
                printf("Category Not Found.");
            else{
                printf("All books of the Category are : \n");
                displayBook(res,j);
            }
            free(res);
        }
        else if(choice == 8){
            update(bookArr,n);
        }
        else if(choice == 9){
            Book* res=sort(bookArr,n,1);
            displayBook(res,3);
            free(res);
        }
        else if(choice == 10){
            Book* res=sort(bookArr,n,2);
            displayBook(res,3);
            free(res);
        }
        else if(choice == 11){
            Book* res=sort(bookArr,n,1);
            displayBook(res,n);
            free(res);
        }
        else if(choice == 12){
            Book* res=sort(bookArr,n,2);
            displayBook(res,n);
            free(res);
        }
        else {
            printf("Invalid choice.\n");
        }
    } 
    free(bookArr); 
}