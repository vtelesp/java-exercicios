package semana01.metodos;

public class ValidacaoIdade {

    private static boolean ehMaiorDeIdade(int idade) {
        if (idade >= 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(ehMaiorDeIdade(25));

    }

}
