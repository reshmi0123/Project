import java.util.Scanner; 
public class trip_planner 
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        
            greet();
            budget();
            time();
            distance();
        System.out.println("************************************************");

    }

    public static void greet() 
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" ****   Welcome to Vacation Planner   ****");
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Nice to meet you" + name + ", where are you travelling to ?");
        String place = scanner.next();
        System.out.println("Great!" + place + "sounds like a good trip.");
        System.out.println("************************************************");

    }

    public static void budget() 
    {
        Scanner scanner =new Scanner(System.in);
        int hr = 0, min = 0;
        double daily = 0.0;
        double newdaily = 0.0;
        double curr1 = 0.0;
        System.out.println("How many days are you going to spend travelling?");
        int days = scanner.nextInt();
        hr = days * 24;
        min = hr * 60;
        System.out.println("How much money,in USD ,are you planning to spend on your trip ? ");
        double money = scanner.nextDouble();
        System.out.println("What is the three letter currency symbolfor your travel destination ? ");
        String curr = scanner.next();
        System.out.println("How many " + curr + " are there in 1 USD ?");
        double new_curr = scanner.nextDouble();
        daily = (double) money / days;
        curr1 = (double) money * new_curr;
        newdaily = (double) curr1 / days;
        System.out.println("If you are travelling for" + days + " that is " + hr + " hours or " + min + "minutes");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $"
                + daily + " USD.");
        System.out.println("Your total budget in " + curr + "is $ " + curr1 + curr + " ,which means per day is "
                + newdaily + curr);
        System.out.println("************************************************");

    }

    public static void time() 
    {
        Scanner scanner =new Scanner(System.in);

        int t2 = 12, t1 = 0;
        System.out.println("What is the time difference, in hours,between your home and your destination ?");
        int time = scanner.nextInt();
        if (time >= 0) {
            t1 = t1 + time;
            t2 = t2 + time;
            System.out.println("That means that when it will be midnight at home it will be " + t1
                    + "in your destination and when it is noon at home it will be " + t2);
        } else if (time < 0) {
            t1 = 12;
            t2 = 0;
            t1 = t1 - time;
            t2 = t2 - time;
            System.out.println("That means that when it will be midnight at home it will be " + t1
                    + "in your destination and when it is noon at home it will be " + t2);
        }
        System.out.println("************************************************");

    }

    public static void distance()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("What is the square area of your destination country in km^2 ?");
        double dist=scanner.nextDouble();
        double di1=0.0;
        di1=dist*0.3861;
        System.out.println("In mile^2 that is "+di1);
        System.out.println("************************************************");

    }

}