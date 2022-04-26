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
    //   *************    TYPE - 1    *************
    // char *ptr = "GeeksQuiz";
    // printf("%c\n", *&*&*ptr); //  & * cancel out
    // printf("Next character element : %c , \nNext alphabet : %c\n", *(ptr + 1), *ptr + 1);

    // *************  TYPE - 2   *************
    // char x = 'A';
    // printf("ASCII value  :  %d\n", x);
    // char *xx = "ab";

    // int *y;
    // float *z;

    // printf("%d\n", *xx);                                                                           //  ASCII  value
    // printf("Integer Pointer Size => %ld\t , Integer Pointer Size => %ld\n", sizeof(y), sizeof(z)); //  Size of a Pointer

    // *************  TYPE - 3   *************
    // char a[] = "Hello world";
    // char *b = "Hello world"; // string in C
    // printf("Size of the Character Array ==> %d\t , Size of the Character String ==> %d\n ", sizeof(a), sizeof(b));
    // printf("Character  :  %c\n ", *b);

    // char c[] = "";
    // char *d = "";

    // printf("Size of the Pointer  :  %d\n", sizeof(d));

    // *************  TYPE - 4   *************
    // float arr[5] = {12.5, 10.0, 13.5, 90.5, 0.5};
    // float *ptr1 = &arr[0];
    // float *ptr2 = ptr1 + 3; // ptr2 points to the  [3 * sizeof(int)] = 3 * 4 = 12 means points 90.5

    // printf("%f ", *ptr2);      // Value :  90.500000
    // printf("%d", ptr2 - ptr1); //  [12 - 0] / 4 (size of int)  =  12 / 4 = 3

    // *************  TYPE - 5   *************
    // int arr[] = {1, 9, 3, 4, 5};
    // int *p = arr;

    // ++*p;   //  ++(*p)  increment value of arr[0].
    // p += 2; //  shift +2  cell points to the 3rd element.
    // printf("%d", *p);

    // *************  TYPE - 6  [all pointing the Base Address]  *************
    int arr[4][4];
    printf("%d\n", arr);
    printf("%d\n", *arr);
    printf("%d\n", arr[0]);

    char g[] = "geeksforgeeks";
    // printf("%s\n", g[6]);

    printf("%s", g + g[6] - g[8]);

    return 0;
}