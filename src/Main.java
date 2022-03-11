public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        // deposito
        cc.depositar(100);
        Conta cp = new ContaPoupaca();
        // transferencia conta corrente para poupança
        cc.transferir(100,cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
