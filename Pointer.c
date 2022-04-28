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
    printf("%d\n", g[6]); // 111
    printf("%c\n", g[6]); // o
    printf("%s\n", g[6]); // no output

    printf("%s", g + g[6] - g[8]);

    return 0;
}

/* Hello,
I'm Niharika Dutta CSE 3rd Year student. I have worked as a FullStack Web Developer Intern at Meliorist Developers Pvt. Ltd. for 10 months. Previously worked as a FullStack Developer at The Prodigious People
and have also done a Frontend Intern at Tawi Tech Solutions. I have worked on ReactJs,NodeJs,MongoDB,AWS tools(Lambda), Material UI technologies during my internship period. I have also
acquire knowledge about DBMS, DSA, OOPS. I have secured a global rank of 171 among 15000+ participants in Codechef February Long Challenge. I am also active at Codechef(3 star) and Leetcode,solved 200+ problems on DSA.
I think my respective skills align with the job description. It'll be a great help if you can provide referral for the same.
For more details about my projects and internship please check out my resume attached below. */