import desconto.CalculadoraDesconto;
import imposto.CalculadoraImposto;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento orcamento01 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento02 = new Orcamento(new BigDecimal("1000"), 7);
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        System.out.println(calculadoraDesconto.calcular(orcamento01));
        System.out.println(calculadoraDesconto.calcular(orcamento02));
    }
}
