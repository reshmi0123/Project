import java.util.Scanner;
interface Salary {
void earnings();
void deductions();
void bonus();
}
class Manager implements Salary{
public static Scanner sc = new Scanner(System.in);
public static void prnt(String s){
System.out.println(s);
};
public double basic,DA,HRA;
Manager(double b){
this .basic = b;
};
Manager(){
this .basic=0;
}
public void setBasic(double b){
this .basic=b;
}
public void earnings(){
DA = 0.8*basic;
HRA=0.15*basic;
prnt("Earning are : "+(basic+DA+HRA));
}
public void deductions(){
prnt("Deductions are : "+(0.12*basic));
basic=basic*0.15;
}
public void bonus(){};
}
public class subStaff extends Manager {
subStaff(double b){
this .basic=b;
}
subStaff(){
this .basic=0;
};
public void setBasic(double b){
this .basic=b;
};
public void bonus(){
prnt("Bonus is : "+(0.5*basic));
basic+=basic*0.5;
};
public static void main(String[] args) {
prnt("Enter basic for manager : ");
Manager mg = new Manager(sc.nextDouble());
mg.earnings();
mg.deductions();
prnt("Enter basic for subStaff");
subStaff ss = new subStaff(sc.nextDouble());
ss.earnings();
ss.deductions();
ss.bonus();
}
}

