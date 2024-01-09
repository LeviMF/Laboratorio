import Atendimento.Cliente;

public class Main {
    public static void main(String[] args) {
        boolean teste = true;

        Cliente teste1 = new Cliente("coqueiro", "MS", "quadra 4", "Mauro");
        teste1.solicitarOrcamento();
        System.out.println("Pedido chegou ? [Sim] [Nao]");
        teste1.receberPedido(teste);
    }
}
