import java.util.Scanner;
public class q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length And Breadth of Plate: ");
		double a = sc.nextDouble();
        double b = sc.nextDouble();
		System.out.println("\nEnter Length And Breadth And Height Of Box:");
        double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		System.out.println("\nEnter Length And Breadth And Height And Thickness Of Wooden Box:");
		double d = sc.nextDouble();
		double h = sc.nextDouble();
        double l = sc.nextDouble();
        double f = sc.nextDouble();

		sc.close();
		plate c = new plate();
		c.c_area(a,b);
		box s = new box();
		s.r_area(x,y,z);
		wooden_box t = new wooden_box();
		t.t_area(d, h,l,f);
	}
}

class shape {
	double area;

	void showArea() {
		System.out.println(area);
	}
}

class plate extends shape {
	void c_area(double a, double b) {
		System.out.println("\nPlate Area: ");
		area = a*b ;
		showArea();
	}
}

class box extends shape {
	void r_area(double a, double b, double c) {
		System.out.println("\nBox Area: ");
		area = a * b*c;
		showArea();
	}
}

class wooden_box extends shape {
	void t_area(double b, double h,double l , double t) {
		System.out.println("\nWooden_Box Area: ");
		area = l* b * h*t;
		showArea();
	}
}