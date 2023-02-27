import java.util.Scanner;

public class Number_guessing {
    public void guess_number() {
        int n, trials = 10, number, i, score = 50;
        Scanner sc = new Scanner(System.in);
        number = 1 + (int) (100 * Math.random());
        System.out.println(
                "Welcome to Number Guessing Game\nGuess a number between 1 to 100 within 10 trials\nTotal Alloted score is 50\nFor every wrong guess 5 will be deducted");
        for (i = 0; i < trials; i++) {
            System.out.println("Guess a number: ");
            n = sc.nextInt();

            if (number == n) {
                System.out.println("Congratulation!..You won the game");
                System.out.println("Your Score is: " + score);
                break;
            } else if (n > number && i != trials - 1) {
                score -= 5;
                System.out.println("The gussed number is greater than the actual number ");
            } else if (n < number && i != trials - 1) {
                score -= 5;
                System.out.println("The gussed number is smaller than the actual number ");
            }
        }
        if (i == trials) {
            System.out.println("Oops trials exhausted");
            System.out.println("The number was: " + number);
            System.out.println("Your score is: " + score);
            sc.close();
        }

    }

    public static void main(String args[]) {
        Number_guessing ob = new Number_guessing();
        ob.guess_number();
    }
}
