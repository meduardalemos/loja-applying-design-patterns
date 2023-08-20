import pedido.GeradorPedidoDados;
import pedido.GeradorPedidoHandler;

import java.math.BigDecimal;

public class TestePedido {
    public static void main(String[] args) {
        // Recebendo dados via linha de comando
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeradorPedidoDados geradorPedidoDados = new GeradorPedidoDados(cliente, valorOrcamento, quantidadeItens);
        GeradorPedidoHandler geradorPedidoHandler = new GeradorPedidoHandler(/* DEPENDENCIAS */);
        geradorPedidoHandler.executa(geradorPedidoDados);
    }
}
