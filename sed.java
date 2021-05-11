abstract class Student {
	int roll;
	int marks;

	abstract void mark();
}

class CIA extends Student {
	void mark() {
		System.out.println("Mark Method of CIA");
	}
}

class Semester extends Student {
	void mark() {
		System.out.println("Mark Method of Semester");
	}
}

class sed {
	public static void main(String args[]) {
		CIA obj1 = new CIA();
		obj1.mark();

		Semester obj2 = new Semester();
		obj2.mark();
	}
}