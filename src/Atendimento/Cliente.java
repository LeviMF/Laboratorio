package Atendimento;

public class Cliente {
    String bairro;
    String nomeDoConsultorio;
    String rua;
    String nomeDoDentista;

    public Cliente(String bairro, String nomeDoConsultorio, String rua, String nomeDoDentista) {
        this.bairro = bairro;
        this.nomeDoConsultorio = nomeDoConsultorio;
        this.rua = rua;
        this.nomeDoDentista = nomeDoDentista;
    }

    public void solicitarOrcamento(){
        System.out.println();
    }

     public boolean receberPedido(boolean resposta){
        //Pedido chegou ? [Sim] [Nao]
        return resposta;
    }

}
