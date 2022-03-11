public class ContaPoupaca extends Conta {


    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupaça");
        imprimirInfoComuns();
    }
}
