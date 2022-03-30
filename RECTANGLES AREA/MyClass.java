import java.util.Scanner;
import entities.Rectangle;
public class MyClass{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Rectangle calc = new Rectangle();
    System.out.println("Enter rectangle width and height:");

    calc.width = scan.nextDouble();
    calc.height = scan.nextDouble();

    System.out.println("AREA = " + calc.area());
    System.out.println("PERIMETER = " + calc.perimeter());
    System.out.println("DIAGONAL = " + calc.diagonal());



    scan.close();
    }

    }
