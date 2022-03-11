
// interface define as operações
// interface class abstrata com odos metodos abstrato
public interface IConta {
    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor,Conta contaDestino);

    void imprimirExtrato();
}

// Conta contaDestino nessa parte usada polimofismo => capacidade de
// um objecto ser referenciada de varias forma
// exemplo : Conta pode ser tanto poupaça qnd corrente

