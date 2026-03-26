#include<iostream>
using namespace std;

int len(char *p){
    int c=0;
    while(*p++) c++;
    return c;
}

void copy(char *d,char *s){
    while(*s) *d++=*s++;
    *d='\0';
}

void concat(char *a,char *b){
    while(*a) a++;
    while(*b) *a++=*b++;
    *a='\0';
}

int compare(char *a,char *b){
    while(*a && *b){
        if(*a!=*b) return *a-*b;
        a++; b++;
    }
    return *a-*b;
}