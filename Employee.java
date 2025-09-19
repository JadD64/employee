/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    public int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (age >= 16){
            System.out.println("You can drive");
            return true;
        }
        else{
            System.out.println("You can not drive. You must wait " + (16 - age) + " years");
            return false;
        }
        }
        // to be completed
    

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    public double calculatePay(){
        return ((hourlyWage * unpaidHours) * (70/100));
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        System.out.println(fullname + "has recieved a wire transfer of " + calculatePay());
        int unpaidHours = 0;
    }
    
    public void yearOfBirth (int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
     public int yearOfBirth (){
        return yearOfBirth();
    }
}