public class ContaDeEnergia extends Conta{
    private double consumoEmkWh;
    private double tarifaPorkWh;

    public ContaDeEnergia(String nomeDoCliente, int diaDePagamento, double consumoEmkWh, double tarifaPorkWh) {
        super(nomeDoCliente, diaDePagamento);
    }

    public double calcularValor() {
        return (consumoEmkWh * tarifaPorkWh) + 22;
    }
}
