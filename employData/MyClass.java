import employ.Employees;
import java.util.Scanner;
public class MyClass{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Employees employ = new Employees();
        System.out.println("Enter the name, gross salary and the tax");
        employ.name =  scan.nextLine();
        employ.grossSalary = scan.nextDouble();
        employ.tax = scan.nextDouble();
        System.out.println("Employee: " + employ.name + ", $ " + employ.netSalary());
        System.out.println("Which percentage to increase salary?");
        double percent = scan.nextDouble();        
        employ.increaseSalary(percent);
        System.out.println("Updated data: " + employ.name + ", $ " + employ.grossSalary );
        

    






        scan.close();
    }

}