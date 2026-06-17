#include <stdio.h>

int main() {
    int r = 5;
    char ch;

    for(int i = r; i >= 1; i--) {
        ch = 'A';
        for(int j = 0; j < i; j++) {
            printf("%c ", ch++);
        }
        printf("\n");
    }

    return 0;
}