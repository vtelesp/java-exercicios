package semana01.poo.sistemaPagamentos;

public class Boleto extends FormaPagamento {

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public String processarPagamento() {
        return "Pagamento via Boleto processado: " + getValor();
    }
}
