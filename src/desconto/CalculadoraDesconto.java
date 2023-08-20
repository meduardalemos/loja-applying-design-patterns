package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDescontos = new DescontoPorQuantidade(
                new DescontoPorValor(
                        new SemDesconto()));

        return cadeiaDescontos.calcular(orcamento);
    }
}
