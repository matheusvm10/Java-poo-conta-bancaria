public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void exibirExtrato(){
        System.out.println("Titular da conta: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
}