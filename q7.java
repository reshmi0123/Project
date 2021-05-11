import java.io.*;
class Student {
    int rollno;
    String name;
    int number_of_subjects;
    int mark[];

    Student(int roll, String stud_name, int noofsub) throws IOException {
        rollno = roll;
        name = stud_name;
        number_of_subjects = noofsub;
        getMarks(noofsub);
    }

    public void getMarks(int nosub) throws IOException {
        mark = new int[nosub];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nosub; i++) {
            System.out.println("Enter " + i + "Subject Marks.:=> ");
            mark[i] = Integer.parseInt(br.readLine());
            System.out.println("");
        }

    }

    public void calculateMarks() {
        double percentage = 0;
        int tmarks = 0;
        for (int i = 0; i < mark.length; i++) {
            tmarks += mark[i];
        }
        percentage = tmarks / number_of_subjects;
        System.out.println("Roll Number :=> " + rollno);
        System.out.println("Name Of Student is :=> " + name);
        System.out.println("Number Of Subject :=> " + number_of_subjects);
        System.out.println("Percentage Is :=> " + percentage);

        if (percentage >= 90)
            System.out.println("O ");
        else if (percentage >= 80 && percentage < 90)
            System.out.println("E");
        else if (percentage >= 70 && percentage < 80)
            System.out.println("A");
        else if (percentage >= 60 && percentage < 70)
            System.out.println("B");
        else if (percentage >= 50 && percentage < 60)
            System.out.println("C");
        else if (percentage >= 40 && percentage < 50)
            System.out.println("D");
        else
            System.out.println("Fail");
    }
}

public class q7 {
    public static void main(String args[]) throws IOException {
        int rno, no, nostud;
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter How many Students:=> ");
        nostud = Integer.parseInt(br.readLine());
        Student s[] = new Student[nostud];

        for (int i = 0; i < nostud; i++) {
            System.out.println("Enter Roll Number:=> ");
            rno = Integer.parseInt(br.readLine());
            System.out.println("Enter Name:=> ");
            name = br.readLine();
            System.out.println("Enter No of Subject:=> ");
            no = Integer.parseInt(br.readLine());
            s[i] = new Student(rno, name, no);
        }
        for (int i = 0; i < nostud; i++) {
            s[i].calculateMarks();
        }

    }
}
