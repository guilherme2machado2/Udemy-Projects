import java.util.Scanner;

public class challengeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;

        //System.out.println("informe a operação:");
        //String operator = input.next();

        System.out.println("Digite um numero!");
        int x = input.nextInt();

        System.out.println("Digite outro numero!");
        int y = input.nextInt();

        System.out.println("Selecione qual operando vais utilizar!");

        String menu = """
                1. for Subtraction -;
                2. for Addition +;
                3. for Multiplication *;
                4. Division /;
                
                5. to end program;
                """;

        while (choice != 5) {
            System.out.println(menu);
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println( x - y);
            } else if (choice == 2) {
                System.out.println(x + y);
            } else if (choice == 3) {
                System.out.println(x * y);
            } else if (choice == 4) {
                System.out.println(x / y);
            } else if (choice != 5) {
                System.out.println("Choose a valid option of the menu");
            }
        }
    }

    String outraForma = """
            
            double result = "+".equals(operator) ? x + y : 0;
            result = "-".equals(operator) ? x - y : result;
            result = "*".equals(operator) ? x * y : result;
            result = "/".equals(operator) ? x / y : result;
            result = "%".equals(operator) ? x % y : result;
            
            System.out.println("%.2f %s %.2f = %.2f", x, operator, y, result);
            
            """;
}
