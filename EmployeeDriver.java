import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
/** ***************************************************
 *  Name:           Prempreet
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class EmployeeDriver {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        ArrayList<EmployeeClass> employeeclass = new ArrayList<>();
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Ax Qy" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
        employeeclass.add(new EmployeeClass(35, 12.50));
        employeeclass.add(new EmployeeClass(40, 17.25));
        employeeclass.add(new EmployeeClass(45, 12.50));
        employeeclass.add(new EmployeeClass(40, 25.00));
        employeeclass.add(new EmployeeClass(46, 20.00));
        employeeclass.add(new EmployeeClass(21, 18.75));
        employeeclass.add(new EmployeeClass(48, 15.50));
        employeeclass.add(new EmployeeClass(40, 32.75));
        employeeclass.add(new EmployeeClass(41, 30.00));
    
        for(EmployeeClass e: employeeclass)
            System.out.println(e.toString());
            
        System.out.println("-------------"); 
        employeeclass.get(1).setHours(20); 
        employeeclass.get(1).setWage(20.00);
        System.out.println(employeeclass.get(1).toString());
        
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
