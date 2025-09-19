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
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (age >= 16){
            system.out.println("You can drive");
        }
        else{
            system.out.println("You can not drive. You must wait " + (16 - age) + " years");
        }
        }
        // to be completed
    

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        System.out.println ((hourlyWage + unpaidHours) * (70/100));
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        system.out.println(fullname + "has recieved a wire transfer of " + calculatePay());
        set unpaidHours = 0;
    }
    
    private int yearOfBirth (int yearOfBirth){
        int yearOfBirth = yearOfBirth();
    }
    
    private int yearOfBirth (int yearOfBirth){
        return yearOfbirth();
    }
    
    
    }
    }
}