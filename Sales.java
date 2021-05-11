package marketing;


import General.Employee;

public class Sales extends Employee {
    public Sales(int empid, String ename, float basic) {
        super(empid, ename, basic);
    }

    public float tallowance() {
        return 0.5f * earnings();
    }
}
