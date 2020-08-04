
public class TotalWageForEachCompany {

	public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String companyName;
    private final int empRate;
    private final int numberOfWorkingDays;
    private final int numberOfWorkingHours;

    /**
     * @param companyName - name of the company
     * @param empRate - rate of the employee per hr
     * @param numberOfWorkingDays - total number of working days
     * @param numberOfWorkingHours - total number of working hours
     */
    public TotalWageForEachCompany(String companyName, int empRate, int numberOfWorkingDays, int numberOfWorkingHours) {
        this.companyName = companyName;
        this.empRate = empRate;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.numberOfWorkingHours = numberOfWorkingHours;
    }

    /**
     * This is a void method used to calculate the salary of the employee
     */
    public void computeWages(){

        // Variables
        int empHours = 0;
        int salary = 0;
        int totalWage = 0;
        int totalHrs = 0;
        int totalDays = 0;

        // loop condition to check if the total days are matching number of working days/hours and eventually calculate salary
        while (totalDays <= numberOfWorkingDays || totalHrs <= numberOfWorkingHours){

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
            salary = empRate * empHours;
            totalWage+=salary;
        }
        System.out.println("Employee is in: " + companyName + ", Total salary: " + totalWage);
    }

    /**
     * The main method now calls the contructor with the parameters declared above and the method computeWages
     * @param args - main method
     */
    public static void main(String[] args) {
        System.out.println("Welcome Employee" + "\n");
        TotalWageForEachCompany companyA = new TotalWageForEachCompany("Company-A", 20, 5, 10);
        TotalWageForEachCompany companyB = new TotalWageForEachCompany("Company-B", 25, 10, 15);
        companyA.computeWages();
        companyB.computeWages();
    }
}


