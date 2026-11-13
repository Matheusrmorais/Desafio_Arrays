package modelo;

public class ContaBancaria {
    private double saldo;
    private int conta;

    public ContaBancaria(double saldo, int conta) {
        setSaldo(saldo);
        setConta(conta);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Conta: " + conta + ", saldo: " + saldo;
    }
}
