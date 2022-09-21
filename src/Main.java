public class Main {

    public static void main(String[] args) {
        Cliente tiago = new Cliente();
        tiago.setNome("Tiago");

        Conta cp = new ContaPoupanca(tiago);
        cp.transferir(100, cp);

        Conta cc = new ContaCorrente(tiago);
        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
