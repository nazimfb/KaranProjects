package KaranProjects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class E6_ChangeReturnProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cost: ");
        float price =  scanner.nextFloat();

        System.out.print("Enter given money amount(must be bigger or equal to cost): ");
        float moneyGiven =  scanner.nextFloat();

        int changeInCents = (int) Math.round((moneyGiven - price) * 100);
        if (changeInCents < 0) {
            System.out.println("The given amount is less than the cost.");
            return;
        }

        System.out.println("Your change: " + returnChange(price, moneyGiven) + "$");

    }

    public static float returnChange(float price, float moneyGiven) {
        if (moneyGiven < price)
            throw new RuntimeException("Not enough money");

        float change = moneyGiven - price;

        //1.99
        //1 + 1 * 0.25 + 1 * 0.05 + 0 * 0.01

        BigDecimal number = new BigDecimal(Float.toString(change));
        BigDecimal iPart = new BigDecimal(number.toBigInteger());
        BigDecimal fractionalPart = number.subtract(iPart);
        System.out.println("Fractional Part: " + fractionalPart );

        BigDecimal penny = BigDecimal.valueOf(0.01);
        BigDecimal nickel = BigDecimal.valueOf(0.05);
        BigDecimal dime = BigDecimal.valueOf(0.1);
        BigDecimal quarter = BigDecimal.valueOf(0.25);


        BigDecimal numberOfQuarters = fractionalPart
                .divide(quarter, 0, RoundingMode.FLOOR);

        BigDecimal numberOfDimes = fractionalPart
                .subtract(numberOfQuarters.multiply(quarter))
                .divide(dime, 0, RoundingMode.FLOOR);

        BigDecimal numberOfNickels = fractionalPart
                .subtract(numberOfQuarters.multiply(quarter))
                .subtract(numberOfDimes.multiply(dime))
                .divide(nickel, 0, RoundingMode.FLOOR);

        BigDecimal numberOfPennies = fractionalPart
                .subtract(numberOfQuarters.multiply(quarter))
                .subtract(numberOfDimes.multiply(dime))
                .subtract(numberOfNickels.multiply(nickel))
                .divide(penny, 0, RoundingMode.FLOOR);

        System.out.println("number of quarters: " + numberOfQuarters);
        System.out.println("number of dimes: " + numberOfDimes);
        System.out.println("number of nickels: " + numberOfNickels);
        System.out.println("number of pennies: " + numberOfPennies);

        return change;


    }


}


