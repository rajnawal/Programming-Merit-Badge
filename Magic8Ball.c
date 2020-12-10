#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
 
int main() {
    char *question = NULL;
    size_t len = 0;
    ssize_t read;
    int i = 0;
    srand(time(NULL));
    printf("Please enter your question or a q to quit.\n");
    read = getline(&question, &len, stdin);
    while (strcmp(read, "q") != 0) {
        i = rand() % 8;
        if (i == 1)
            printf("Maybe \n");
        else if (i == 2)
            printf("Ask Again \n");
        else if (i == 3)
            printf("Its hazy \n");
        else if (i == 4)
            printf("Definitely not \n");
        else if (i == 5)
            printf("The stars say so \n");
        else if (i == 6)
            printf("Without a doubt \n");
        else if (i == 7)
            printf("Most Likely \n");
        else if (i == 8)
            printf("Very Doubtful \n");
        read = getline(&question, &len, stdin);
        }
    return 0;
}
