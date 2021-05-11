import java.util.Scanner;
interface Motor {
int capacity=100;
void run(int mins);
void consume();
}
public class WashingMachine implements Motor{
static Scanner sc = new Scanner(System.in);
static void prnt(String x){
System.out.println(x);
}
public void run(int mins){
prnt("Running the machine for "+mins+" minutes\n");
}
public void consume(){
prnt("Started consuming");
}
public static void main(String[] args) {
WashingMachine wm = new WashingMachine();
wm.run(20);
wm.consume();
prnt("Original capacity of machine is : "+WashingMachine.capacity);
}
}
