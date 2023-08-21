package pedido.acao;

import pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executar(Pedido pedido){
        System.out.println("Salvar o pedido no banco de dados.");
    }

}
