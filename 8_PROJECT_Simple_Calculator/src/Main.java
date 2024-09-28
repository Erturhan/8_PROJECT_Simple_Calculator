import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1, num2, result = 0;
        int opration;

        System.out.print("Please , enter the first number : ");
        num1 = scan.nextDouble();

        System.out.print("Please , enter the scond number : ");
        num2 = scan.nextDouble();

        while (true) {

            System.out.println("1-adding");
            System.out.println("2-subtracting");
            System.out.println("3-multiplying");
            System.out.println("4-dividing");
            System.out.println("5-taking the base");
            System.out.println("6-taking the roots");
            System.out.print("Please , write the number of one of the transactions listed on it :");
            opration = scan.nextInt();
            if (opration >= 1 && opration <= 6) {
                break;
            } else {
                System.out.println("You entered the wrong statement, try again");
            }

        }

        switch (opration) {

            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = Math.abs(num1 - num2);
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = Math.pow(num1, num2);
                break;
            case 6:
                System.out.println(" Results 1 number : " + Math.sqrt(num1) +
                        "and" + " Results 2 number : " + Math.sqrt(num2));
                ;
                break;
        }

        System.out.println(" Results : " + result);


    }
}