package fundamentos.loops;
import java.util.Scanner;

/*
Receba um número do usuário e imprima a tabuada de 1 a 10 com for.
 */

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        // Exibindo da tabuada
        System.out.println("====== Tabuada do " + numero + " ======");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        input.close();
    }
}
