#include <stdio.h>

int main() {
    int arr[5] = {10, 25, 7, 45, 18};
    int largest = arr[0];

    for (int i = 1; i < 5; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }

    printf("Largest element = %d\n", largest);

    return 0;
}
