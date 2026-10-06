package semana01.poo.sistemaPagamentos;

public class Pix extends FormaPagamento {

    public Pix(double valor) {
        super(valor);
    }


    @Override
    public String processarPagamento() {
        return "Pagamento via Pix processado: " + getValor();
    }

}
