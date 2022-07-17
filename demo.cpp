
#include <bits/stdc++.h>
#include <iostream>

using namespace std;

/* void selectionsort(int arr[])
{
    int i = 0;
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << n << endl;

    for (int i = 0; i < n; i++)
    {
        int minIndex = i;
        for (int j = i; j < n; j++)
        {
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }
        swap(arr[i], arr[minIndex]);
    }
}

int main()
{
    int arr[] = {1, 2, 5, 1};
    selectionsort(arr);

    for (int data : arr)
        cout << data << " ";

    return 0;
}
 */

void fun(int arr[]) // SAME AS void fun(int *arr)
{
    unsigned int n = sizeof(arr) / sizeof(arr[0]);
    cout << sizeof(arr) << " " << sizeof(arr[0]) << endl; //  ?  / 4
    cout << "\nArray size inside fun() is " << n;
}

// Driver Code
int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    unsigned int n = sizeof(arr) / sizeof(arr[0]);
    cout << sizeof(arr) << " " << sizeof(arr[0]) << endl; //( 5 * 4 )/ 4
    cout << "Array size inside main() is " << n << endl;
    fun(arr);
    return 0;
}