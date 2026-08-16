import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double temp;
        String unit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temprature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit= scanner.next().toUpperCase();
        double newTemp=(unit.equals("C")) ? (temp-32)*5/9:(temp*5/9)+32;
        System.out.printf("%.2f %s",newTemp,unit);


    }
}