package semana01.poo.sistemaBancario;

public class Main {

    public static void exibirMensagemDeposito(boolean depositoCompleto) {
        if (depositoCompleto) {
            System.out.println("Deposito feito com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito.");
        }
    }

    public static void exibirMensagemSaque(boolean saqueRealizado) {
        if (saqueRealizado) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possível concluir o saque.");
        }
    }


    public static void main(String[] args) {

        Cliente joao = new Cliente("João","00000000000");

        ContaBancaria contaJoao = new ContaBancaria(joao,"Corrente");

        contaJoao.depositar(500);
        System.out.println(contaJoao.getTitular().getNome());
        System.out.println(contaJoao.getTitular().getCpf());
        System.out.println(contaJoao.getTipoConta());
        System.out.println(contaJoao.getSaldo());

    }
}
