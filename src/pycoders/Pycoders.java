package pycoders;
import java.util.Scanner;

public class Pycoders {
    
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
//       System.out.println("enter a number");
//       int number = input.nextInt();
//       System.out.println("you entered "+number);
       
      
//       System.out.print("enter your name:");
//       String name = input.nextLine();
////       String name2 = "yves";
//       System.out.println("my name is: "+name);

/*casting is the change from one data type to another*/

//double num2 = 1.7;
//System.out.println("double value: "+num2);
//int castedValue = (int)num2;
//System.out.println("casted value: "+ castedValue);

/*casting from string to integer */

//String number = "23";
//int sum = Integer.parseInt(number) + 4;
//System.out.println("sum is: "+sum);

/* casting from integer to string*/

//String number = "23";
//int sum = Integer.parseInt(number) +4;
//String output = String.valueOf(sum);
//System.out.println("sum is: "+sum);
System.out.println("enter your name: ");
String name = scanner.nextLine();

System.out.println("enter your age: ");
int age = scanner.nextInt();

System.out.println("enter your height in  meters: ");
double yourHeightInMeters = scanner.nextDouble();

System.out.println("are you a student(true/false): ");
boolean isStudent = scanner.nextBoolean();

int ageInfiveYears = age + 5;

int yourHeight = (int) (yourHeightInMeters * 100);

System.out.println("\n Hello "+ name + "!");
System.out.println("\n In 5 years, you will be "+ ageInfiveYears + ".");
System.out.println("\n your height in centermiters is "+yourHeight);
System.out.println("\n you are a student "+isStudent);
System.out.println();

double ageAsDouble = (double)age;
int height = (int)yourHeightInMeters;
System.out.println("\n Age as double: "+ageAsDouble);
System.out.println("Height as an integer: "+height);



    }
    
}

