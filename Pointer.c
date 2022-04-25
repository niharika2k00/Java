/*
________________________________________
----------------------------------------
 Author    :  Niharika Dutta
 Code Link :  Gfg Pointer Questions
 Time Complexity :
________________________________________
----------------------------------------
 */

#include <stdio.h>

int main()
{
    // char *ptr = "GeeksQuiz";
    // printf("%c\n", *&*&*ptr); //  & * cancel out
    // printf("Next character element : %c , \nNext alphabet : %c\n", *(ptr + 1), *ptr + 1);

    char x = 'a';
    char *xx = "ab";

    int *y;
    float *z;

    printf("%d\n", *xx); //  ASCII  value
    printf("Integer Pointer Size => %ld\t , Integer Pointer Size => %ld\n", sizeof(y), sizeof(z));

    char a[] = "Hello world";
    char *b = "Hello world";
    printf("Size of the Character Array ==> %d\t , Size of the Character String ==> %d\n", sizeof(a), sizeof(b));

    return 0;
}