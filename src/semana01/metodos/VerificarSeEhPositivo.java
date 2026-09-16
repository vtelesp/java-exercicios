package semana01.metodos;

public class VerificarSeEhPositivo {
    private static int calcularMaiorNumero(int[] numeros) {

        int maiorNumero = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        return maiorNumero;
    }


    private static boolean ehPositivo(int numero) {
        if (numero > 0) {
            return true;
        }
        return false;
    }


    private static void exibirResultado(int maior, boolean positivo) {
        System.out.println("Maior número: " + maior);
        System.out.println("O maior número é positivo?: " + positivo);
    }

    public static void main(String[] args) {

        int [] numeros = {-10, 5, 2, 8};

        int maior = calcularMaiorNumero(numeros);
        boolean positivo = ehPositivo(maior);

        exibirResultado(maior, positivo);

    }
}
