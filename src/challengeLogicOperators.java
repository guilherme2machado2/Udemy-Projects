import java.util.Scanner;

public class challengeLogicOperators {

    // caso do desafio: Há dois tipos de trabalhos a serem entregues
    // na terça e na quinta, se o lucas entregar os dois trabalhos
    // ele vai ao shopping com o a sua familia para comprar uma TV de 50 polegadas
    // e tambem tomar sorvete com eles, mas se lucas entregar somente 1
    // dos trabalhos ele ira comprar uma TV de 32 polegadas e tambem tomar sorvete com eles,
    // por fim se nenhum dos trabalhos forem entregues, lucas e sua familia ficaram em casa.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O Trabalho com o prazo até Terça-feira foi entregue pelo Lucas?");
        boolean Trabalho1 = input.nextBoolean();

        System.out.println("O Trabalho com o prazo até Quinta-feira foi entregue pelo Lucas?");
        boolean Trabalho2 = input.nextBoolean();

        if (!Trabalho1 && !Trabalho2) {
            System.out.println("Lucas e sua familia ficaram em casa!");
        } else if (Trabalho1 && Trabalho2) {
            System.out.println("Lucas e sua familia vão ao shopping tomar sorvete e comprar uma TV de 50 polegadas");
        }
        if (Trabalho1 ^ Trabalho2){
            System.out.println("Lucas e sua familia vão ao shopping tomar sorvete e comprar uma TV de 32 polegadas");
        }
    }
}
