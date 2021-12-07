/********************************************************************
 * Programmer:    Prempreet
 * Class:  CS30S
 *
 * Assignment: Decemeber Exam 
 *
 * Description: brief description of class
 ***********************************************************************/

// import libraries as needed here

public class EmployeeClass {
    //*** Class Variables ***
    
    private static int nextID = 1000;
    
    //*** Instance Variables ***
    
    private int id = 0;     // id number of employee
    private int hours = 0;  // number of hours worked by an employee
    private double wage = 0.0;  // wage of employee
    
    
    //*** Constructors ***
    
    public EmployeeClass(){
        id = nextID++;          
        
        hours = 0;      // number of hours worked 
        wage = 0.0;     // wage of employee 
        
    }// end default/no-arg constructor
    
    // full arg constructor 
    public EmployeeClass(int h, double w){
        id = nextID++;          
        
        this.hours = h;     // default value for hours 
        this.wage = w;     // default value for wage 
    }// end arg constructor
    
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
    * Description: Get employee id 
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    public int getId(){
        return id;
    }// end getId
    
    /*****************************************
    * Description: get employee hours
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    public int getHours(){
        return hours;
    }// end gethours
    
    /*****************************************
    * Description: get employee wage 
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    public double getWage(){
        return wage;
    }// end getwage 
    
    //*** Setters ***
    
    /*****************************************
    * Description: set the value of the hours 
    * 
    * Interface:
    * 
    * @param        int: new hours for the employee
    * ****************************************/
    public void setHours(int hours){
         this.hours = hours;   
    }// end setHours 
    
    /*****************************************
    * Description: set the value of the wage 
    * 
    * Interface:
    * 
    * @param        double: new wage for the employee
    * ****************************************/
    public void setWage(double wage){
         this.wage = wage;   
    }// end setRadius
    
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
    
} // end of public class
