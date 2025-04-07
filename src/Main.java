import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esta executando!");

        Scanner input = new Scanner(System.in);

        String value = input.nextLine();
        System.out.println("Value is " + value);

        input.close();
    }
}