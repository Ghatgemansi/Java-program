import java.util.*;

// create class ElectricityBill to calculate electricity bill  
class Electricity {

    public static void main(String args[]) {

        int units;

        double unitcharges = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of units for calculating electricity bill.");
        units = sc.nextInt();

        if (units <= 50) {
            unitcharges = 0.50;
        }

        else if (units <= 100) {
            unitcharges = 0.75;
        }

        else if (units <= 100) {
            unitcharges = 1.20;
        } else if (units > 250) {
            unitcharges = 1.50;
        }
        System.out.println("The electricity bill for " + units + " is : " + unitcharges);
    }
}