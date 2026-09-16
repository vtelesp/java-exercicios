package semana01.metodos;

public class MetodosBasicos {

    private static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {


        System.out.println(ehPar(0));
    }
}
