import java.util.*;

// create class ElectricityBillExample1 to calculate electricity bill  
class ElectricityBillExample2 {
    // main() method start
    public static void main(String args[]) {
        // declare variable units
        int units;

        // variable to calculate electricity bill to pay
        double unitcharges = 0;

        // create Scanner class object to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of units for calculating electricity bill.");
        units = sc.nextInt();

        // check whether units are less than 100
        if (units <= 50) {
            unitcharges = 0.50;
        }
        // check whether the units are less than 300
        else if (units <= 100) {
            unitcharges = 0.75;
        }
        // check whether the units are greater than 300
        else if (units <= 100) {
            unitcharges = 1.20;
        } else if (unit > 250) {
            unitcharges = 1.50;
        }
        System.out.println("The electricity bill for " + units + " is : " + unitcharges);
    }
}