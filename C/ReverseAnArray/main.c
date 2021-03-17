#include <stdio.h>
#include <stdlib.h>

// function prototypes
void reverseArray (int arr[], int start, int end);
void printArray (int arr[], int length);

int main()
{
    // create integer arrays
    int array[3] = {12, 17, 38};
    int array1[4] = {12, 17, 38, 45};
    int array2[5] = {12, 17, 38, 45, 64};
    int array3[11] = {12, 17, 38, 45, 64, 54, 21, 38, 91, 86, 42};

    // array length
    int length = sizeof(array3) / sizeof(array3[0]);

    printf("Original array: \n");
    printArray(array3, length);

    printf("\n");

    // reverse the original array
    reverseArray(array3, 0, length-1);

    printf("Reversed array: \n");
    printArray(array3, length);

    return 0;
}

// function to reverse an array
void reverseArray (int arr[], int start, int end) {
    // creating temporary variable to hold values
    int temp;

    // reverse that array
    while (start < end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

// function to print an array
void printArray (int arr[], int length) {
    int i;
    for (i = 0; i < length; i++) {
        printf("%d \n", arr[i]);
    }
}
