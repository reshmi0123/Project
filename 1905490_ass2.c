#include<stdio.h>
#include<stdlib.h>
void main()
{
int allocation[10][5],max[10][5],need[10][5],available[3],flag[10],sq[10];
int n,r,i,j,k,count,count1=0;
FILE *fptr;
   fptr = fopen("assignment2_1905490_input.txt","w");
   if(fptr == NULL)
   {
      printf("Error!");  
      exit(1);            
   }
printf("\n Input the number of processes : ");
scanf("%d",&n);
fprintf(fptr,"\n Input the number of processes : %d",n);
for(i=0;i<10;i++)
    flag[i]=0;
printf("\n Input the number of resources : ");
scanf("%d",&r);
fprintf(fptr,"\n Input the number of resources : %d",r);
printf("\n Input the Allocation Matrix for the processes in row major order : \n");
printf("\n Enter the Allocation Matrix : \n");
fprintf(fptr,"\n Enter the Allocation Matrix : \n");
for(i=0;i<n;i++)
{
    printf("\n Process %d\n",i);
    fprintf(fptr,"\n Process %d\n",i);
    for(j=0;j<r;j++)
    {
        printf("\n Resource %d  : ",j);
        scanf("%d",&allocation[i][j]);
        fprintf(fptr,"\n Resource %d  : %d",j,allocation[i][j]);
    }
}
printf("\n Input the no. of resources that a process can maximum have  : \n");
printf("\n Enter the Maximum Matrix : \n");
fprintf(fptr,"\n Enter the Maximum Matrix : \n");
for(i=0;i<n;i++)
{
    printf("\n Process %d \n",i);
    fprintf(fptr,"\n Process %d \n",i);
    for(j=0;j<r;j++)
    {
        printf("\n Resource %d : ",j);
        scanf("%d",&max[i][j]);
        fprintf(fptr,"\n Resource %d  : %d",j,max[i][j]);
    }
}
printf("\n Input the no. of Available Instances of each resource..\n");
printf("\n Enter the Available Vector : \n");
fprintf(fptr,"\n Enter the Available Vector : \n");
for(i=0;i<r;i++)
{
    printf("\n Resource %d : ",i);
    scanf("%d",&available[i]);
    fprintf(fptr,"\n Resource %d  : %d",i,available[i]);
}
fclose(fptr);
FILE *fp;
   if ((fp = fopen("assignment2_1905490_input.txt","r")) == NULL)
   {
       printf("Error! opening file");
       // Program exits if the file pointer returns NULL.
       exit(1);
   }
printf("\n The need matrix is as follows : \n");
printf("\t A \t B \t C \t D\n");
for(i=0;i<n;i++)
{
    for(j=0;j<r;j++)
    {
        fscanf(fp,"%d",&max[i][j]);
        fscanf(fp,"%d",&allocation[i][j]);
        need[i][j]= max[i][j]-allocation[i][j];
        printf("\t %d",need[i][j]);
    }
    printf("\n");
}
do{
  for(k=0;k<n;k++)
  {
      for(i=0;i<n;i++)
      {
          if(flag[i]==0)
          {
            count=0;
            for(j=0;j<r;j++)
            {
               fscanf(fp,"%d",&available[j]);
               if(available[j]>=need[i][j])
               count++;
            }
            if(count==r)
            {
               count1++;
               flag[i]=1;
               sq[count1-1]=i;
               for(j=0;j<r;j++)
              {    fscanf(fp,"%d",&available[j]);
                   fscanf(fp,"%d",&allocation[i][j]);
                   available[j]=available[j]+allocation[i][j];
              }
               break;
            }
         }
     }
  }
  if(count1!=n)
  {
     printf("\n--------------- IT'S AN UNSAFE STATE ---------------\n");
     break;
  }
}while(count1!=n);
if(count1==n)
{
   printf("\n ******* IT'S A SAFE STATE ******* \n");
   printf("\n The safe sequence is....\n");
   for(i=0;i<n;i++)
       printf("\t P[%d] ",sq[i]);
   printf("\n");
   printf("\n The available matrix is now : ");
   for(i=0;i<r;i++)
   {
       fscanf(fp,"%d",&available[i]);
       printf("\t %d",available[i]);
   }
}
fclose(fp);
}