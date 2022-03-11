
// class filha ContaCorrente pode instancia a class pai abstract
public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        imprimirInfoComuns();
    }

}
