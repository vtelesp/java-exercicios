package semana01.poo.sistemaBancario;

public class ContaBancaria {
    private Cliente titular;
    private double saldo;
    private String tipoConta;

    public ContaBancaria(Cliente titular, String tipoConta) {
        if (titular == null) {
            throw new IllegalArgumentException("Titular inválido.");
        }
        this.titular = titular;

        if (!"Corrente".equals(tipoConta) && !"Poupança".equals(tipoConta) ) {
            throw new IllegalArgumentException("Tipo de conta inválido.");
        }
        this.tipoConta = tipoConta;

        this.saldo = 0;
    }


    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public String getTipoConta() {
        return tipoConta;
    }


    public void setTipoConta(String tipoConta) {
        if (!"Corrente".equals(tipoConta) && !"Poupança".equals(tipoConta) ) {
            throw new IllegalArgumentException("Tipo de conta inválido.");
        }
        this.tipoConta = tipoConta;
    }


    public boolean depositar(double valorDeDeposito){
        if (valorDeDeposito > 0) {
            this.saldo += valorDeDeposito;
            return true;
        }
        return false;
    }


    public boolean sacar (double valorDoSaque) {
        if (valorDoSaque > 0 && valorDoSaque <= this.saldo) {
            this.saldo -= valorDoSaque;
            return true;
        }
        return false;
    }

}
