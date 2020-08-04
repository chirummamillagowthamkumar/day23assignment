import java.util.ArrayList;

public class EmployeeWageArrayList  implements EmployeeWageBuilder{

	 // Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numOfCompnaies = 0;
    private final ArrayList<EmployeeWageuc10> employeeWageArrayList;
    /**
     * Constructor - setting the size of array
     */
    public EmployeeWageArrayList(){
    	employeeWageArrayList = new ArrayList<>();
    }

    /**
     * This method adds the number of companies into an array
     *
     * @param companyName - name of company
     * @param empRate - rate per hr
     * @param numberOfWorkingDays - number of working days
     * @param numberOfWorkingHours - number of working hours
     */
    public void addCompanyToArray(String companyName, int empRate, int numberOfWorkingDays, int numberOfWorkingHours){
    	EmployeeWageuc10 computeEmployeeWage = new EmployeeWageuc10(companyName, empRate, numberOfWorkingDays, numberOfWorkingHours);
       employeeWageArrayList.add(computeEmployeeWage);
        numOfCompnaies++;
    }

    /**
     * This method sets the total wage of the employee
     */
    public void computeEmpWage(){
        for (int i = 0; i<numOfCompnaies;i++){
        	employeeWageArrayList.get(i).setTotalWage(computeEmpWagesForACompany(employeeWageArrayList.get(i)));
            System.out.println(employeeWageArrayList.get(i));
        }
    }

    /**
     * This is a void method used to calculate the salary of the employee
     */
    public int computeEmpWagesForACompany(EmployeeWageuc10  employeeWage){

        // Variables
        int empHours = 0;
        int totalHrs = 0;
        int totalDays = 0;

        // loop condition to check if the total days are matching number of working days/hours and eventually calculate salary
        while (totalDays <= employeeWage.numberOfWorkingDays || totalHrs <=employeeWage.numberOfWorkingHours){

            totalDays++;

            // random numbers (0,1,2)
            int randomNum = (int)( Math.random() * 2 + 1);

            // selection statement
            if (randomNum == IS_FULL_TIME){
                empHours = 8;
            }
            else if (randomNum == IS_PART_TIME){
                empHours = 4;
            }
            else{
                empHours = 0;
            }

            // calculation of salary and hours
            totalHrs+=empHours;
            System.out.println("Day: " + totalDays + ", Emp Hr: " + empHours);
        }
        return totalHrs*employeeWage.empRate;
    }

	

}
