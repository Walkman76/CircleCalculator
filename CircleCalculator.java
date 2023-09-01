import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleCalculator {
	
	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello, this is a circle calculator, choose from below which part of the circle you have a value for");
        System.out.println("1: Perimeter");
        System.out.println("2: Area");
        System.out.println("3: Radius");
        System.out.print("Enter your choice (1/2/3): ");
        
        //Source: https://www.w3schools.com/java/java_user_input.asp       
        int input = scanner.nextInt();
        
        double radius = 0;
        double area = 0;
        double perimeter = 0;
        double diameter = 0;
        
        
        //Source: https://www.baeldung.com/java-round-decimal-number Example 3
        
        DecimalFormat fd = new DecimalFormat("###.###");
        
//Next up is the part where the program checks which input the user chose, and based on that calculates the other available options
        
        //Source: https://www.w3schools.com/java/java_switch.asp
        
        switch (input) {
            case 1:
            	System.out.print("Enter the perimeter of the cricle: ");
                perimeter = scanner.nextDouble();
                radius = perimeter / (2 * Math.PI);
                area = Math.PI * radius * radius;
                diameter = radius * 2;
                
                break;
            
            case 2:
                System.out.print("Enter the area of the circle: ");
                area = scanner.nextDouble();
                radius = Math.sqrt(area / Math.PI);
                perimeter = 2 * Math.PI * radius;
                diameter = radius * 2;
                break;
            
            case 3:
            	System.out.print("Enter the radius of the circle: ");
                radius = scanner.nextDouble();
                perimeter = 2* Math.PI * radius;
                area = Math.PI * radius * radius;
                diameter = radius * 2;
                break;
            
            default:
                System.out.println("Invalid choice.");
        }
        
        System.out.println("Perimeter of the circle: " + fd.format(perimeter));
        System.out.println("Area of the circle: " + fd.format(area));
        System.out.println("Radius of the circle: " + fd.format(radius));
        System.out.println("Diamter of the circle: " + fd.format(diameter));
        
        scanner.close();
    }





}


