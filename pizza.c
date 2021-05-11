#include <stdio.h>
#include<stdlib.h>
#include <pthread.h>
typedef struct studentargs
{
int capacity_490;
} StudentArgs;
int totalcapacity_490 = 12;
int maxPizzaBoyCalls_490 = 1;
typedef struct pizzaboyArgs
{
int pizzaSlices_490;
} PizzaboyArgs;
PizzaboyArgs* pizzaboyArgs ;
void createPizzaBoy(){
pizzaboyArgs=(PizzaboyArgs*)malloc(sizeof(PizzaboyArgs));
pizzaboyArgs->pizzaSlices_490=12;
}
void *pizzaBoyTask(void *args){
totalcapacity_490=pizzaboyArgs->pizzaSlices_490;
};
void callPizzaBoy (){
pthread_t pizzaBoy;
pthread_create (&pizzaBoy, NULL, &pizzaBoyTask, (void *)NULL);
pthread_join(pizzaBoy,NULL);
};

void *taskByStudent (void *args){
int shouldEat_490 = 1;
while (shouldEat_490 == 1)
{
if (totalcapacity_490 == 3)
{
if (maxPizzaBoyCalls_490 >= 0)
{
printf ("PIZZA SLICE FINISHED\n\n");
callPizzaBoy ();
maxPizzaBoyCalls_490--;
printf ("Now calling Pizzaboy\n\n");
}
else
{
printf("Todays Quota is Full !\n\n");
shouldEat_490 = 0;
};
}
else
{
printf ("SLICES Started with : %d\n", totalcapacity_490);
StudentArgs *studentArgs = (StudentArgs *) args;
totalcapacity_490 -= studentArgs->capacity_490;
printf ("SLICES REMAINING : %d\n\n", totalcapacity_490);

};
};
}

int main ()
{
createPizzaBoy();
StudentArgs *studentArgs = (StudentArgs *) malloc (sizeof (StudentArgs));
studentArgs->capacity_490 = 3;
pthread_t stu1, stu2, stu3, stu4;
pthread_create (&stu1, NULL, &taskByStudent, (void *) studentArgs);
pthread_create (&stu2, NULL, &taskByStudent, (void *) studentArgs);
pthread_create (&stu3, NULL, &taskByStudent, (void *) studentArgs);
pthread_create (&stu4, NULL, &taskByStudent, (void *) studentArgs);
pthread_exit (NULL);
return 0;
}