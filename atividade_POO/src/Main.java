public class Main {
    public static void main(String[] args) {
        CadastroDeContas cadastro = new CadastroDeContas();

        ContaDeAgua contaAgua1 = new ContaDeAgua("Caio", 20, 8.8, 5.2);
        ContaDeAgua contaAgua2 = new ContaDeAgua("Caua", 18, 8.4, 4.2);
        ContaDeEnergia contaEnergia1 = new ContaDeEnergia("Eliane", 10, 220, 1.20);
        ContaDeEnergia contaEnergia2 = new ContaDeEnergia("João", 01, 280, 1.40);

        cadastro.adicionarConta(contaAgua1);
        cadastro.adicionarConta(contaAgua2);
        cadastro.adicionarConta(contaEnergia1);
        cadastro.adicionarConta(contaEnergia2);

        String ClientePesquisado = "Caio";
        Conta contaPesquisada = cadastro.pesquisarConta(ClientePesquisado);
        if (contaPesquisada != null) {
            System.out.println("Conta do cliente " + ClientePesquisado + " encontrada!");
            System.out.println("Valor da conta: R$" + contaPesquisada.calcularValor());
        } else {
            System.out.println("O Cliente" + ClientePesquisado + " Não se encontra!");
        }
        System.out.println("Clientes cadastrados:");
        cadastro.exibirClientesOrdenados();

        System.out.println("Valor total de todas as contas cadastradas: R$" + cadastro.calcularValorTotal());
    }
}
