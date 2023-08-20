import imposto.CalculadoraImposto;
import imposto.ICMS;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento01 = new Orcamento(new BigDecimal("100"), 2);
        Orcamento orcamento02 = new Orcamento(new BigDecimal("100"), 3);
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.println(calculadoraImposto.calcular(orcamento01, new ISS()));
        System.out.println(calculadoraImposto.calcular(orcamento02, new ICMS()));
    }
}
