package pedido;

import orcamento.Orcamento;
import pedido.acao.AcaoAposGerarPedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeradorPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeradorPedidoHandler(List<AcaoAposGerarPedido> acoes){
        this.acoes = acoes;
    }
    public void executa(GeradorPedidoDados dados){
        Orcamento orcamento = new Orcamento(
                dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executar(pedido));

    }
}
