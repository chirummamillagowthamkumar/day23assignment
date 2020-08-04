import java.util.ArrayList;

public class EmployeeWageArray implements EmpWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private final ArrayList<ComputeEmployeeWage> computeEmployeeWageArrayList;

   
    public EmployeeWageArray(){
        computeEmployeeWageArrayList = new ArrayList<>();
    }

    public void addCompanyToArray(String companyName, int empRate, int numberOfWorkingDays, int numberOfWorkingHours){
        ComputeEmployeeWage computeEmployeeWage = new ComputeEmployeeWage(companyName, empRate, numberOfWorkingDays, numberOfWorkingHours);
        computeEmployeeWageArrayList.add(computeEmployeeWage);
    }

   
    public void computeEmpWage(){
        for (int i = 0; i<computeEmployeeWageArrayList.size();i++){
            computeEmployeeWageArrayList.get(i).setTotalWage(computeEmpWagesForACompany(computeEmployeeWageArrayList.get(i)));
            System.out.println(computeEmployeeWageArrayList.get(i));
        }
    }

    public int computeEmpWagesForACompany(ComputeEmployeeWage computeEmployeeWage){

        // Variables
        int empHours = 0;
        int totalHrs = 0;
        int totalDays = 0;
        int salary;
        ArrayList<Integer> salaryArrayList = new ArrayList<>();

        // loop condition to check if the total days are matching number of working days/hours and eventually calculate salary
        while (totalDays <= computeEmployeeWage.numberOfWorkingDays || totalHrs <= computeEmployeeWage.numberOfWorkingHours){

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
            salary=empHours*computeEmployeeWage.empRate;
            salaryArrayList.add(salary);
            System.out.println("Day: " + totalDays + ", Emp Hr: " + empHours + ", Salary per day: " + salary);
        }
        return totalHrs*computeEmployeeWage.empRate;
    }
}
