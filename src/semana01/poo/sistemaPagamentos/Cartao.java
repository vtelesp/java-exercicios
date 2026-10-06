package semana01.poo.sistemaPagamentos;

public class Cartao extends FormaPagamento {

    public Cartao(double valor) {
        super(valor);
    }


    @Override
    public String processarPagamento() {
        return "Pagamento via Cartão processado: " + getValor();
    }
}
