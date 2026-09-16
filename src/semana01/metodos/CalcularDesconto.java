package semana01.metodos;

public class CalcularDesconto {

    private static double calcularDesconto(double preco, double porcentagemDesconto) {
        return preco - (preco * porcentagemDesconto / 100);
    }

    private static void exibirResultado(double preco, double precoFinal) {
        System.out.println("Preço inicial: " + preco);
        System.out.println("Preço final: " + precoFinal);
    }

    public static void main(String[] args) {

        double preco = 100;
        double porcentagemDesconto = 20;

        double precoFinal = calcularDesconto(preco, porcentagemDesconto);


        exibirResultado(preco, precoFinal);
    }
}
