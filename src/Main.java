public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Matheus", 543210);

        conta.exibirExtrato();
        conta.depositar(1500.0);
        conta.exibirExtrato();
        conta.sacar(500.0);
        conta.exibirExtrato();
    }
}