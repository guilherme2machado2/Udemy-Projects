import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class guessTheSecretNumber {

    private static boolean isTimeUp = false;

    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(() -> {
            isTimeUp = true;
            System.out.println("Timeout exceeded!");
            System.exit(0);
        }, 2, TimeUnit.MINUTES);

        Scanner input = new Scanner(System.in);
        System.out.println("ATENTION: You only have 1 minute and 10 attempts to guess the secret number");

        int inputNumber = 0;
        boolean validNumber = false;
        int numberAttempts = 10;
        int remainingAttempts = numberAttempts;

        while (!isTimeUp && remainingAttempts > 0) {
            System.out.println("Enter the number: (Remaining Attempts: " + remainingAttempts + "): ");
            System.out.println("Remind: ONLY INTEGERS ALLOWED! | Limit: (1 to 100)");

            try {
                inputNumber = input.nextInt();

                if (inputNumber < 1 || inputNumber > 100) {
                    System.out.println("Invalid Number! Please, Enter with a valid number" +
                            "\n Remind: Limit: (1 to 100) " );
                    continue;
                }

                remainingAttempts--;

                if (inputNumber == secretNumber) {
                    System.out.println("Congratulations! You guessed the secret number: " + secretNumber);
                    break;
                } else if (inputNumber < secretNumber) {
                    System.out.println("The Generated number is greater than the input!");
                } else {
                    System.out.println("The generated number is smaller than the input!");
                }

            } catch (Exception e) {
                System.out.println("Invalid Number! Please, Enter with a valid number" +
                        "\n Remind: Limit: (1 to 100) " );
                input.next();
            }

            if (!isTimeUp && remainingAttempts == 0) {
                System.out.println("Your attempts are over!" + "\n The secret number was: " + secretNumber);
            }
        }
        input.close();
    }
}