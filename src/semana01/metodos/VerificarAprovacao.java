package semana01.metodos;

public class VerificarAprovacao {

    private static double calcularMedia(double[] notas) {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma+= notas[i];
        }
        return soma / notas.length;
    }


    private static boolean ehAprovado(double media) {
        if (media >= 7) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        double[] notas = {8, 7, 9, 6};

        double media = calcularMedia(notas);

        System.out.println("Media do aluno: " + media);
        System.out.println("Status: " + ehAprovado(media));
    }
}
