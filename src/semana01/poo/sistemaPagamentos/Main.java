package semana01.poo.sistemaPagamentos;

public class Main {
    public static void main(String[] args) {

        FormaPagamento pagamento1 = new Pix(500);
        FormaPagamento pagamento2 = new Cartao(750);
        FormaPagamento pagamento3 = new Boleto(300);

        System.out.println(pagamento1.processarPagamento());
        System.out.println(pagamento2.processarPagamento());
        System.out.println(pagamento3.processarPagamento());


    }
}
