package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {
            boolean isAnInt = input.hasNextInt();
            if (isAnInt) {
                int number = input.nextInt();
                sum += number;
                count++;
                avg = Math.round((double) sum / count);

            } else{
                System.out.println("SUM = " + sum + " AVG = " + avg );
                break;

            }
            input.nextLine();

        }
        input.close();

    }

}

