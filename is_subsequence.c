#include <stdbool.h>

bool isSubsequence(char* s, char* t) {
    int i = 0, j = 0;
    while (s[i] != '\0' && t[j] != '\0') {
        if (s[i] == t[j]) // char found
            i++;
        j++; // move to next char in t
    }
    if (s[i] == '\0') // all elements are found
        return true;
    else
        return false;
}
