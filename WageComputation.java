public class WageComputation {
	public static void main(String[] args) {
        System.out.println("Welcome Employee" + "\n");
        EmployeeWageBuilderArray employeeWageArray = new EmployeeWageBuilderArray();
        employeeWageArray.addCompanyToArray("D-Mart", 10, 10,10);
        employeeWageArray.addCompanyToArray("Reliance", 20, 20,20);
        employeeWageArray.computeEmpWage();
    }
}
