#include <stdio.h>

int isEven();
int isPrime();
int isPalindrome();
int posiNeg();
int reverse();
int digitSum();
int num;
void main()
{
    int choice;

    printf("Enter a number: ");
    scanf("%d", &num);

    printf("\nChoose an operation:\n");
    printf("1. Check Even or Odd\n");
    printf("2. Check Prime or Not\n");
    printf("3. Check Palindrome or Not\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Sum of Digits\n");
    printf("Enter your choice (1-6): ");
    scanf("%d", &choice);

    if (choice == 1) {
        if(isEven()) printf("Even\n");
        else printf("Odd\n");
    }

    else if (choice == 2) {
        if(isPrime()) printf("Prime\n");
        else printf("Not Prime\n");
    }

    else if (choice == 3) {
        if(isPalindrome()) printf("Palindrome\n");
        else printf("Not Palindrome\n");
    }

    else if (choice == 4) {
        int flag = posiNeg();
        if(flag==1) printf("Positive\n");
        else if(flag==0) printf("Negative\n");
        else printf("Zero\n");
    }

    else if (choice == 5) {
        printf("Reversed Number = %d\n", reverse());
    }

    else if (choice == 6) {
        printf("Sum of digits = %d\n", digitSum());
    }

    else
        printf("Invalid choice.\n");
}

int isEven(){
    if (num % 2 == 0) return 1;
    else return 0;
}

int isPrime(){
    int isPrime = 1;
    if (num <= 1) isPrime = 0;
    else
    {
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                isPrime = 0;
                break;
            }
        }
    }
    if (isPrime) return 1;
    else return 0;
}

int isPalindrome(){
    int temp = num, rev = 0;
    while (temp != 0){
        rev = rev * 10 + temp % 10;
        temp /= 10;
    }
    if (rev == num) return 1;
    else return 0;
}

int posiNeg(){
    if (num > 0) return 1;
    else if (num < 0) return 0;
    else return 2;
}

int reverse(){
    int rev = 0, temp = num;
        while (temp != 0)
        {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev;
}

int digitSum(){
    int sum = 0, temp = (num < 0) ? -num : num;
        while (temp != 0)
        {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
}
