#include<stdio.h>
void main()
{
int i,a,count=0,count1=0,temp=0,temp2=0;
char ch[50];
printf("Enter the string");
gets(ch);
a=strlen(ch);
for(i=0;i<a;i++)
{
if(ch[i]>=65 && ch[i]<=90)
{
count++;
}
else if(ch[i]>=97 && ch[i]<=122)
{
    count1++;
}
else if(ch[i]>=48 && ch[i]<=57)
{
temp++;
}
else
{
temp2++;
}
}
printf("small=%d",count1);
printf("capital=%d",count);
printf("num=%d",temp);
printf("spl=%d",temp2);
}
