package fundamentos.variaveis;

import java.util.Locale;
import java.util.Scanner;

/*
Crie um programa que realiza soma, subtração, multiplicação e divisão entre dois números.
 */

public class calculosBasicos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 = input.nextInt();

        // Contas básicas
        int soma = numero + numero2;
        int subtracao = numero - numero2;
        int multiplicacao = numero * numero2;
        int divisao = numero / numero2;


        System.out.printf("%d + %d = %d\n", numero, numero2, soma);
        System.out.printf("%d - %d = %d\n", numero, numero2, subtracao);
        System.out.printf("%d * %d = %d\n", numero, numero2, multiplicacao);
        System.out.printf("%d / %d = %d\n", numero, numero2, divisao);



        // Fechando o scanner
        input.close();

    }
}
