import java.util.*;

class CadastroDeContas {
    private ArrayList<Conta> contas;

    public CadastroDeContas() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public Conta pesquisarConta(String nomeDoCliente) {
        for (Conta conta : contas) {
            if (conta.getNomeDoCliente().equals(nomeDoCliente)) {
                return conta;
            }
        }
        return null;
    }

    public void exibirClientesOrdenados() {
        Collections.sort(contas, new Comparator<Conta>() {
            public int compare(Conta c1, Conta c2) {
                return c1.getNomeDoCliente().compareTo(c2.getNomeDoCliente());
            }
        });
        for (Conta conta : contas) {
            System.out.println(conta.getNomeDoCliente());
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Conta conta : contas) {
            valorTotal += conta.calcularValor();
        }
        return valorTotal;
    }
}