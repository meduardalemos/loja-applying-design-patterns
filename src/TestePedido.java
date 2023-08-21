import pedido.GeradorPedidoDados;
import pedido.GeradorPedidoHandler;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = "Cliente 01";
        BigDecimal valorOrcamento = new BigDecimal(1000);
        int quantidadeItens = 5;

        GeradorPedidoDados geradorPedidoDados = new GeradorPedidoDados(
                cliente, valorOrcamento, quantidadeItens
        );
        GeradorPedidoHandler geradorPedidoHandler = new GeradorPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido())
        );
        geradorPedidoHandler.executa(geradorPedidoDados);
    }
}
