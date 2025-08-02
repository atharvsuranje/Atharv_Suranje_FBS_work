#include <stdio.h>
#include <string.h>

struct Movie {
    char title[100];
    char director[100];
    int year;
    char genre[50];
};

struct Movie movies[100];
int count = 0;

void addMovie() {
    if (count >= 100) {
        printf("Movie list is full!\n");
        return;
    }

    printf("Enter Title: ");
    gets(movies[count].title);

    printf("Enter Director: ");
    gets(movies[count].director);

    printf("Enter Release Year: ");
    scanf("%d", &movies[count].year);
    getchar();

    printf("Enter Genre: ");
    gets(movies[count].genre);

    count++;
    printf("Movie added successfully!\n");
}

void searchMovie() {
    char searchTitle[100];
    int found = 0;

    printf("Enter title to search: ");
    gets(searchTitle);

    for (int i = 0; i < count; i++) {
        if (strcmp(movies[i].title, searchTitle) == 0) {
            printf("\nTitle: %s\nDirector: %s\nYear: %d\nGenre: %s\n",
                movies[i].title, movies[i].director, movies[i].year, movies[i].genre);
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Movie not found!\n");
    }
}

void updateMovie() {
    char searchTitle[100];
    int found = 0;

    printf("Enter title to update: ");
    gets(searchTitle);

    for (int i = 0; i < count; i++) {
        if (strcmp(movies[i].title, searchTitle) == 0) {
            printf("Enter new Director: ");
            gets(movies[i].director);

            printf("Enter new Release Year: ");
            scanf("%d", &movies[i].year);
            getchar();

            printf("Enter new Genre: ");
            gets(movies[i].genre);

            printf("Movie updated successfully!\n");
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Movie not found!\n");
    }
}

int main() {
    int choice;

    while (1) {
        printf("\n===== Movie Database Menu =====\n");
        printf("1. Add Movie\n");
        printf("2. Search Movie by Title\n");
        printf("3. Update Movie by Title\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        getchar();  // consume newline

        if (choice == 1) {
            addMovie();
        } else if (choice == 2) {
            searchMovie();
        } else if (choice == 3) {
            updateMovie();
        } else if (choice == 0) {
            break;
        } else {
            printf("Invalid choice!\n");
        }
    }
}
