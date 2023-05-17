abstract class Conta {
    private String nomeDoCliente;
    private int diaDePagamento;

    public Conta(String nomeDoCliente, int diaDePagamento){
        this.nomeDoCliente = nomeDoCliente;
        this.diaDePagamento = diaDePagamento;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public abstract double calcularValor();
}