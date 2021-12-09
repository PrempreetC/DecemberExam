/********************************************************************
 * Programmer:  Harmeet Gill
 * Class:  CS30S
 *
 * Assignment: December Exam Payroll
 *
 * Description: Class for Employee
 ***********************************************************************/

// import libraries as needed here

public class Employee_Class {
    //*** Class Variables ***

    private static int nextID = 1000;       // unique id

    //*** Instance Variables ***

    private int id = 0;              // employee id number
    private int Hours = 0;           // number of hours worked by the employee 
    private double Wage = 0.0;       // wage of the employee  

    //*** Constructors ***

    public Employee_Class(){
        id = nextID++;                  // set unique id of cirlce object
                                        // and increment nextID so the next object
                                        // gets a unique id number
        Hours = 0;              // number of hours worked by the employee
        Wage = 0.0;             // wage of the employee

    }// end defult/no-arg constructor 

    // full arg constructor
    public Employee_Class(int h ,double w){
        id = nextID++;

        this.Hours = h;
        this.Wage = w;

    }// end defult/no-arg constructor 

    /*****************************************
     * Description: brief description of the methods purpose
     * 
     * Interface:
     * 
     * @param        each parameter of the method should be listed with an @param
     * @param        parametername description of parameter
     * 
     * @return       any return value will be noted here
     * ****************************************/

    //*** Getters ***

    /*****************************************
     * Description: get employee id
     * 
     * Interface:
     * 
     * @return       all return value will be noted here
     * ****************************************/
    public int getId(){
        return id;
    }// end getId

    /*****************************************
     * Description: get hours employee has worked
     * 
     * Interface:
     * 
     * @return       
     * ****************************************/
    public int getHours(){
        return Hours;
    }// end getHours

    /*****************************************
     * Description: get employee wage
     * 
     * Interface:
     * 
     * @return       
     * ****************************************/
    public double getWage(){
        return Wage;
    }// end getWage

    //*** Setters ***

    /*****************************************
     * Description: set the value of the hours
     * 
     * Interface:
     * 
     * @param        int: new hours for the employee
     * ****************************************/
    public void setHours(int Hours){
        this.Hours = Hours;
    }// end setHours

    /*****************************************
     * Description: set the value of the wage
     * 
     * Interface:
     * 
     * @param        double: new wage for the employee
     * ****************************************/
    public void setWage(double Wage){
        this.Wage = Wage;
    }// end setWage

    // other methods

    /*****************************************
     * Description: over ride to string
     * 
     * Interface:
     * 
     * @return       String: circle state
     * ****************************************/
    @Override
    public String toString(){
        String nl = System.lineSeparator(); 

        StringBuilder s = new StringBuilder();

        s.append(String.format("%-10s%10d%s", "Employee:", this.getId(), nl));
        s.append(String.format("%-10s%10.3f%s", "Hours:", this.getHours(), nl));
        s.append(String.format("%-10s%10.3f%s", "Hourly Wage:", this.getWage(), nl));

        return s.toString();
    }// end toString

    //Calculations For Regular, Ovaertime, And Gross Pay
    /*****************************************
     * Description: get Regular Pay
     * 
     * Interface:
     * 
     * @return       double: Regular Pay
     * ****************************************/
    public double getRegularPay(){
        double RegularPay;
        if(Hours <= 40){
            RegularPay = Wage * Hours;
        }
        else{
            RegularPay = Wage * 40;
        }
        return RegularPay;
    }// end getReguarPay

    /*****************************************
     * Description: get Overtime pay
     * 
     * Interface:
     * 
     * @return       double: Overtime pay
     * ****************************************/
    public double getOvertimePay(){
        double OvertimePay;
        if(Hours > 40){
            OvertimePay = Wage - 40 * Hours;
        }
        else{
            OvertimePay = 0;
        }
        return OvertimePay;
    }// end getOvertimePay
} // end of public class
