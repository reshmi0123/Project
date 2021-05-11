import marketing.Sales;


public class q4 {
    public static void main(String[] args) {
        float basic = 500000;

        Sales obj = new Sales(100, "Anmol", basic);
        float total = obj.tallowance() + obj.earnings();
        System.out.println("Total earning of : " + obj.getEname() + " \t EMPID : " + obj.getEmpid() + " \t  Rs. : " + total);
    }
}