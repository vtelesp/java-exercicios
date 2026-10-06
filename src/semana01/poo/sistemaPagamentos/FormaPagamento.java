package semana01.poo.sistemaPagamentos;

public abstract class FormaPagamento {

    private double valor;

    public FormaPagamento(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido.");
        }
        this.valor = valor;
    }

    public double getValor() {return valor;}


    public abstract String processarPagamento();

}
