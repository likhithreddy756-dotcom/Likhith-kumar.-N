#include <stdio.h>
#include <string.h>

int main() {
    char str1[50] = "Hello";
    char str2[50] = "World";
    char str3[50];

    // 1. strlen() - finds length
    printf("Length of str1 = %lu\n", strlen(str1));

    // 2. strcpy() - copies one string to another
    strcpy(str3, str1);
    printf("Copied string = %s\n", str3);

    // 3. strcat() - joins two strings
    strcat(str1, str2);
    printf("Joined string = %s\n", str1);

    return 0;
}
