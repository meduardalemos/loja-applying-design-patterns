package pedido;

import orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeradorPedidoHandler {
    // Construtor com injeção de dependências: repository, service, etc;

    public void executa(GeradorPedidoDados dados){
        Orcamento orcamento = new Orcamento(
                dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar o pedido no banco de dados.");
        System.out.println("Enviar e-mail com dados do novo pedido.");
    }
}
