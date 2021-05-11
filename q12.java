import java.util.Random;

/**
 * Write a program to create an Account class containing acc_no, balance as data
 * members and disp() to display the details. Inherit it in Person class with
 * all mentioned data members and functions. Person class also has name and
 * aadhar_no as extra data members of its own. Override disp() function. Create
 * 5 persons‟ details.
 */

class q12 {
    public static void main(String[] args) {
        int n = 5;
        Person[] persons = new Person[n];
        String[] names = { "Rezz", "Shoukei", "Div", "Deeps", "May" };
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            int acc_no = rand.nextInt(10000);
            float balance = rand.nextInt(10000000) / 100f;
            int aadhar_no = rand.nextInt(10000);
            persons[i] = new Person(acc_no, balance, names[i], aadhar_no);
        }

        System.out.println("NAME\t\tACC_NO\t\tBALANCE \t\tAADHAR_NO\t\t");
        for (Person person : persons) {
            person.disp();
        }
    }
}

class Account {
    int acc_no;
    float balance;

    Account(int acc_no, float balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void disp() {
        // System.out.println("acc_no\tbalance");
        System.out.println(acc_no + "\t\t" + balance);
    }
}

class Person extends Account {
    String name;
    int aadhar_no;

    Person(int acc_no, float balance, String name, int aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    @Override
    void disp() {
        // System.out.println("NAME\tACC_NO\tBALANCE\tAADHAR_NO\t");
        System.out.println(name + "\t\t" + acc_no + "\t\t" + balance + "\t\t" + aadhar_no);
    }
}