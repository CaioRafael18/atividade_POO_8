import com.sun.tools.jconsole.JConsoleContext;

public class ContaDeAgua extends Conta {
    private double consumoEmMetroCubico;
    private double  valorPorMetroCubico;

    public ContaDeAgua(String nomeDoCliente, int diaDePagamento, double consumoEmMetroCubico, double valorPorMetroCubico) {
        super(nomeDoCliente, diaDePagamento);
    }

    public double calcularValor() {
        return (consumoEmMetroCubico * valorPorMetroCubico) + 30;
    }
}
